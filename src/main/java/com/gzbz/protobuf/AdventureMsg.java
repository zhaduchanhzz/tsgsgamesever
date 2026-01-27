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

public final class AdventureMsg {
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_AdventureHero_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_AdventureHero_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_TaskInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_TaskInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_C2S_OpenAdventureUi_7801_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_C2S_OpenAdventureUi_7801_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_S2C_OpenAdventureUiResult_7802_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_S2C_OpenAdventureUiResult_7802_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_C2S_FlushTask_7803_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_C2S_FlushTask_7803_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_S2C_FlushTaskResult_7804_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_S2C_FlushTaskResult_7804_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_C2S_AcceptTask_7805_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_C2S_AcceptTask_7805_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_S2C_AcceptTaskResult_7806_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_S2C_AcceptTaskResult_7806_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_C2S_AccelerateTask_7807_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_C2S_AccelerateTask_7807_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_S2C_AccelerateTaskResult_7808_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_S2C_AccelerateTaskResult_7808_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_C2S_TakeTask_7809_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_C2S_TakeTask_7809_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_S2C_TakeTaskResult_7810_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_S2C_TakeTaskResult_7810_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_C2S_TakeAllTask_7811_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_C2S_TakeAllTask_7811_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_S2C_TakeAllTaskResult_7812_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_S2C_TakeAllTaskResult_7812_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_C2S_AutoAcceptQuality_7813_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_C2S_AutoAcceptQuality_7813_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_S2C_AutoAcceptQuality_7814_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_S2C_AutoAcceptQuality_7814_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_C2S_AutoAccept_7815_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_C2S_AutoAccept_7815_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_adventure_com_gzbz_protobuf_S2C_AutoAccept_7816_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_adventure_com_gzbz_protobuf_S2C_AutoAccept_7816_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private AdventureMsg() {
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
      String[] descriptorData = new String[]{"\n\u000fAdventure.proto\u0012\u001badventure.com.gzbz.protobuf\"7\n\rAdventureHero\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004star\u0018\u0003 \u0002(\u0005\"\u008a\u0001\n\bTaskInfo\u0012\f\n\u0004code\u0018\u0001 \u0002(\t\u0012\u000e\n\u0006taskId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005state\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nacceptTime\u0018\u0004 \u0002(\u0003\u0012=\n\theroInfos\u0018\u0005 \u0003(\u000b2*.adventure.com.gzbz.protobuf.AdventureHero\"\u001a\n\u0018C2S_OpenAdventureUi_7801\"\u008f\u0001\n\u001eS2C_OpenAdventureUiResult_7802\u00124\n\u0005infos\u0018\u0001 \u0003(\u000b2%.adventure.com.gzbz.protobuf.TaskInfo\u0012\u0012\n\nisActivity\u0018\u0002 \u0001(\b\u0012\u0012\n\nuseFreeNum\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007quality\u0018\u0004 \u0003(\u0005\"$\n\u0012C2S_FlushTask_7803\u0012\u000e\n\u0006isMust\u0018\u0001 \u0001(\u0005\"*\n\u0018S2C_FlushTaskResult_7804\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"5\n\u0013C2S_AcceptTask_7805\u0012\f\n\u0004code\u0018\u0001 \u0002(\t\u0012\u0010\n\bheroCode\u0018\u0002 \u0003(\u0005\"`\n\u0019S2C_AcceptTaskResult_7806\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u00123\n\u0004info\u0018\u0002 \u0002(\u000b2%.adventure.com.gzbz.protobuf.TaskInfo\"'\n\u0017C2S_AccelerateTask_7807\u0012\f\n\u0004code\u0018\u0001 \u0002(\t\"d\n\u001dS2C_AccelerateTaskResult_7808\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u00123\n\u0004info\u0018\u0002 \u0002(\u000b2%.adventure.com.gzbz.protobuf.TaskInfo\"!\n\u0011C2S_TakeTask_7809\u0012\f\n\u0004code\u0018\u0001 \u0002(\t\"7\n\u0017S2C_TakeTaskResult_7810\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\t\"\u0016\n\u0014C2S_TakeAllTask_7811\";\n\u001aS2C_TakeAllTaskResult_7812\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005codes\u0018\u0002 \u0003(\t\"-\n\u001aC2S_AutoAcceptQuality_7813\u0012\u000f\n\u0007quality\u0018\u0001 \u0003(\u0005\"-\n\u001aS2C_AutoAcceptQuality_7814\u0012\u000f\n\u0007quality\u0018\u0001 \u0003(\u0005\"#\n\u0013C2S_AutoAccept_7815\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"#\n\u0013S2C_AutoAccept_7816\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005B#\n\u0011com.gzbz.protobufB\fAdventureMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_adventure_com_gzbz_protobuf_AdventureHero_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_adventure_com_gzbz_protobuf_AdventureHero_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_AdventureHero_descriptor, new String[]{"Code", "Id", "Star"});
      internal_static_adventure_com_gzbz_protobuf_TaskInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_adventure_com_gzbz_protobuf_TaskInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_TaskInfo_descriptor, new String[]{"Code", "TaskId", "State", "AcceptTime", "HeroInfos"});
      internal_static_adventure_com_gzbz_protobuf_C2S_OpenAdventureUi_7801_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_adventure_com_gzbz_protobuf_C2S_OpenAdventureUi_7801_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_C2S_OpenAdventureUi_7801_descriptor, new String[0]);
      internal_static_adventure_com_gzbz_protobuf_S2C_OpenAdventureUiResult_7802_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_adventure_com_gzbz_protobuf_S2C_OpenAdventureUiResult_7802_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_S2C_OpenAdventureUiResult_7802_descriptor, new String[]{"Infos", "IsActivity", "UseFreeNum", "Quality"});
      internal_static_adventure_com_gzbz_protobuf_C2S_FlushTask_7803_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_adventure_com_gzbz_protobuf_C2S_FlushTask_7803_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_C2S_FlushTask_7803_descriptor, new String[]{"IsMust"});
      internal_static_adventure_com_gzbz_protobuf_S2C_FlushTaskResult_7804_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_adventure_com_gzbz_protobuf_S2C_FlushTaskResult_7804_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_S2C_FlushTaskResult_7804_descriptor, new String[]{"Result"});
      internal_static_adventure_com_gzbz_protobuf_C2S_AcceptTask_7805_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_adventure_com_gzbz_protobuf_C2S_AcceptTask_7805_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_C2S_AcceptTask_7805_descriptor, new String[]{"Code", "HeroCode"});
      internal_static_adventure_com_gzbz_protobuf_S2C_AcceptTaskResult_7806_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_adventure_com_gzbz_protobuf_S2C_AcceptTaskResult_7806_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_S2C_AcceptTaskResult_7806_descriptor, new String[]{"Result", "Info"});
      internal_static_adventure_com_gzbz_protobuf_C2S_AccelerateTask_7807_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_adventure_com_gzbz_protobuf_C2S_AccelerateTask_7807_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_C2S_AccelerateTask_7807_descriptor, new String[]{"Code"});
      internal_static_adventure_com_gzbz_protobuf_S2C_AccelerateTaskResult_7808_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_adventure_com_gzbz_protobuf_S2C_AccelerateTaskResult_7808_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_S2C_AccelerateTaskResult_7808_descriptor, new String[]{"Result", "Info"});
      internal_static_adventure_com_gzbz_protobuf_C2S_TakeTask_7809_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_adventure_com_gzbz_protobuf_C2S_TakeTask_7809_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_C2S_TakeTask_7809_descriptor, new String[]{"Code"});
      internal_static_adventure_com_gzbz_protobuf_S2C_TakeTaskResult_7810_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_adventure_com_gzbz_protobuf_S2C_TakeTaskResult_7810_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_S2C_TakeTaskResult_7810_descriptor, new String[]{"Result", "Code"});
      internal_static_adventure_com_gzbz_protobuf_C2S_TakeAllTask_7811_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_adventure_com_gzbz_protobuf_C2S_TakeAllTask_7811_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_C2S_TakeAllTask_7811_descriptor, new String[0]);
      internal_static_adventure_com_gzbz_protobuf_S2C_TakeAllTaskResult_7812_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_adventure_com_gzbz_protobuf_S2C_TakeAllTaskResult_7812_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_S2C_TakeAllTaskResult_7812_descriptor, new String[]{"Result", "Codes"});
      internal_static_adventure_com_gzbz_protobuf_C2S_AutoAcceptQuality_7813_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_adventure_com_gzbz_protobuf_C2S_AutoAcceptQuality_7813_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_C2S_AutoAcceptQuality_7813_descriptor, new String[]{"Quality"});
      internal_static_adventure_com_gzbz_protobuf_S2C_AutoAcceptQuality_7814_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_adventure_com_gzbz_protobuf_S2C_AutoAcceptQuality_7814_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_S2C_AutoAcceptQuality_7814_descriptor, new String[]{"Quality"});
      internal_static_adventure_com_gzbz_protobuf_C2S_AutoAccept_7815_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_adventure_com_gzbz_protobuf_C2S_AutoAccept_7815_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_C2S_AutoAccept_7815_descriptor, new String[]{"Type"});
      internal_static_adventure_com_gzbz_protobuf_S2C_AutoAccept_7816_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_adventure_com_gzbz_protobuf_S2C_AutoAccept_7816_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_adventure_com_gzbz_protobuf_S2C_AutoAccept_7816_descriptor, new String[]{"Type"});
   }

   public static final class AdventureHero extends GeneratedMessageV3 implements AdventureHeroOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      public static final int STAR_FIELD_NUMBER = 3;
      private int star_;
      private byte memoizedIsInitialized;
      private static final AdventureHero DEFAULT_INSTANCE = new AdventureHero();
      /** @deprecated */
      @Deprecated
      public static final Parser<AdventureHero> PARSER = new AbstractParser<AdventureHero>() {
         public AdventureHero parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new AdventureHero(input, extensionRegistry);
         }
      };

      private AdventureHero(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private AdventureHero() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new AdventureHero();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private AdventureHero(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.id_ = input.readInt32();
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
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_AdventureHero_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_AdventureHero_fieldAccessorTable.ensureFieldAccessorsInitialized(AdventureHero.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getId() {
         return this.id_;
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
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasId()) {
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
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
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
               size += CodedOutputStream.computeInt32Size(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.id_);
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
         } else if (!(obj instanceof AdventureHero)) {
            return super.equals(obj);
         } else {
            AdventureHero other = (AdventureHero)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
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

      public static AdventureHero parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (AdventureHero)PARSER.parseFrom(data);
      }

      public static AdventureHero parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AdventureHero)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AdventureHero parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (AdventureHero)PARSER.parseFrom(data);
      }

      public static AdventureHero parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AdventureHero)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AdventureHero parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (AdventureHero)PARSER.parseFrom(data);
      }

      public static AdventureHero parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AdventureHero)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AdventureHero parseFrom(InputStream input) throws IOException {
         return (AdventureHero)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static AdventureHero parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AdventureHero)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static AdventureHero parseDelimitedFrom(InputStream input) throws IOException {
         return (AdventureHero)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static AdventureHero parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AdventureHero)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static AdventureHero parseFrom(CodedInputStream input) throws IOException {
         return (AdventureHero)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static AdventureHero parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AdventureHero)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(AdventureHero prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static AdventureHero getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<AdventureHero> parser() {
         return PARSER;
      }

      public Parser<AdventureHero> getParserForType() {
         return PARSER;
      }

      public AdventureHero getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdventureHeroOrBuilder {
         private int bitField0_;
         private int code_;
         private int id_;
         private int star_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_AdventureHero_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_AdventureHero_fieldAccessorTable.ensureFieldAccessorsInitialized(AdventureHero.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.AdventureHero.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            this.star_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_AdventureHero_descriptor;
         }

         public AdventureHero getDefaultInstanceForType() {
            return AdventureMsg.AdventureHero.getDefaultInstance();
         }

         public AdventureHero build() {
            AdventureHero result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public AdventureHero buildPartial() {
            AdventureHero result = new AdventureHero(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
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
            if (other instanceof AdventureHero) {
               return this.mergeFrom((AdventureHero)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(AdventureHero other) {
            if (other == AdventureMsg.AdventureHero.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
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
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasId()) {
               return false;
            } else {
               return this.hasStar();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            AdventureHero parsedMessage = null;

            try {
               parsedMessage = (AdventureHero)AdventureMsg.AdventureHero.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (AdventureHero)e.getUnfinishedMessage();
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

   public static final class TaskInfo extends GeneratedMessageV3 implements TaskInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private volatile Object code_;
      public static final int TASKID_FIELD_NUMBER = 2;
      private int taskId_;
      public static final int STATE_FIELD_NUMBER = 3;
      private int state_;
      public static final int ACCEPTTIME_FIELD_NUMBER = 4;
      private long acceptTime_;
      public static final int HEROINFOS_FIELD_NUMBER = 5;
      private List<AdventureHero> heroInfos_;
      private byte memoizedIsInitialized;
      private static final TaskInfo DEFAULT_INSTANCE = new TaskInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<TaskInfo> PARSER = new AbstractParser<TaskInfo>() {
         public TaskInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new TaskInfo(input, extensionRegistry);
         }
      };

      private TaskInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private TaskInfo() {
         this.memoizedIsInitialized = -1;
         this.code_ = "";
         this.heroInfos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new TaskInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private TaskInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.taskId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.state_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.acceptTime_ = input.readInt64();
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.heroInfos_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.heroInfos_.add(input.readMessage(AdventureMsg.AdventureHero.PARSER, extensionRegistry));
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
               if ((mutable_bitField0_ & 16) != 0) {
                  this.heroInfos_ = Collections.unmodifiableList(this.heroInfos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_TaskInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_TaskInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TaskInfo.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getCode() {
         Object ref = this.code_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.code_ = s;
            }

            return s;
         }
      }

      public ByteString getCodeBytes() {
         Object ref = this.code_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.code_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasAcceptTime() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getAcceptTime() {
         return this.acceptTime_;
      }

      public List<AdventureHero> getHeroInfosList() {
         return this.heroInfos_;
      }

      public List<? extends AdventureHeroOrBuilder> getHeroInfosOrBuilderList() {
         return this.heroInfos_;
      }

      public int getHeroInfosCount() {
         return this.heroInfos_.size();
      }

      public AdventureHero getHeroInfos(int index) {
         return (AdventureHero)this.heroInfos_.get(index);
      }

      public AdventureHeroOrBuilder getHeroInfosOrBuilder(int index) {
         return (AdventureHeroOrBuilder)this.heroInfos_.get(index);
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
         } else if (!this.hasTaskId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAcceptTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getHeroInfosCount(); ++i) {
               if (!this.getHeroInfos(i).isInitialized()) {
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
            GeneratedMessageV3.writeString(output, 1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.taskId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.state_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(4, this.acceptTime_);
         }

         for(int i = 0; i < this.heroInfos_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.heroInfos_.get(i));
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
               size += GeneratedMessageV3.computeStringSize(1, this.code_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.taskId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.state_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.acceptTime_);
            }

            for(int i = 0; i < this.heroInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.heroInfos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof TaskInfo)) {
            return super.equals(obj);
         } else {
            TaskInfo other = (TaskInfo)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && !this.getCode().equals(other.getCode())) {
               return false;
            } else if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasAcceptTime() != other.hasAcceptTime()) {
               return false;
            } else if (this.hasAcceptTime() && this.getAcceptTime() != other.getAcceptTime()) {
               return false;
            } else if (!this.getHeroInfosList().equals(other.getHeroInfosList())) {
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
               hash = 53 * hash + this.getCode().hashCode();
            }

            if (this.hasTaskId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTaskId();
            }

            if (this.hasState()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getState();
            }

            if (this.hasAcceptTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getAcceptTime());
            }

            if (this.getHeroInfosCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeroInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static TaskInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (TaskInfo)PARSER.parseFrom(data);
      }

      public static TaskInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TaskInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TaskInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (TaskInfo)PARSER.parseFrom(data);
      }

      public static TaskInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TaskInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TaskInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (TaskInfo)PARSER.parseFrom(data);
      }

      public static TaskInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TaskInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TaskInfo parseFrom(InputStream input) throws IOException {
         return (TaskInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TaskInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TaskInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static TaskInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (TaskInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static TaskInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TaskInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static TaskInfo parseFrom(CodedInputStream input) throws IOException {
         return (TaskInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TaskInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TaskInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(TaskInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static TaskInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<TaskInfo> parser() {
         return PARSER;
      }

      public Parser<TaskInfo> getParserForType() {
         return PARSER;
      }

      public TaskInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TaskInfoOrBuilder {
         private int bitField0_;
         private Object code_;
         private int taskId_;
         private int state_;
         private long acceptTime_;
         private List<AdventureHero> heroInfos_;
         private RepeatedFieldBuilderV3<AdventureHero, AdventureHero.Builder, AdventureHeroOrBuilder> heroInfosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_TaskInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_TaskInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TaskInfo.class, Builder.class);
         }

         private Builder() {
            this.code_ = "";
            this.heroInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.code_ = "";
            this.heroInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.TaskInfo.alwaysUseFieldBuilders) {
               this.getHeroInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = "";
            this.bitField0_ &= -2;
            this.taskId_ = 0;
            this.bitField0_ &= -3;
            this.state_ = 0;
            this.bitField0_ &= -5;
            this.acceptTime_ = 0L;
            this.bitField0_ &= -9;
            if (this.heroInfosBuilder_ == null) {
               this.heroInfos_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.heroInfosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_TaskInfo_descriptor;
         }

         public TaskInfo getDefaultInstanceForType() {
            return AdventureMsg.TaskInfo.getDefaultInstance();
         }

         public TaskInfo build() {
            TaskInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public TaskInfo buildPartial() {
            TaskInfo result = new TaskInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.code_ = this.code_;
            if ((from_bitField0_ & 2) != 0) {
               result.taskId_ = this.taskId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.acceptTime_ = this.acceptTime_;
               to_bitField0_ |= 8;
            }

            if (this.heroInfosBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.heroInfos_ = Collections.unmodifiableList(this.heroInfos_);
                  this.bitField0_ &= -17;
               }

               result.heroInfos_ = this.heroInfos_;
            } else {
               result.heroInfos_ = this.heroInfosBuilder_.build();
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
            if (other instanceof TaskInfo) {
               return this.mergeFrom((TaskInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(TaskInfo other) {
            if (other == AdventureMsg.TaskInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.bitField0_ |= 1;
                  this.code_ = other.code_;
                  this.onChanged();
               }

               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasAcceptTime()) {
                  this.setAcceptTime(other.getAcceptTime());
               }

               if (this.heroInfosBuilder_ == null) {
                  if (!other.heroInfos_.isEmpty()) {
                     if (this.heroInfos_.isEmpty()) {
                        this.heroInfos_ = other.heroInfos_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureHeroInfosIsMutable();
                        this.heroInfos_.addAll(other.heroInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.heroInfos_.isEmpty()) {
                  if (this.heroInfosBuilder_.isEmpty()) {
                     this.heroInfosBuilder_.dispose();
                     this.heroInfosBuilder_ = null;
                     this.heroInfos_ = other.heroInfos_;
                     this.bitField0_ &= -17;
                     this.heroInfosBuilder_ = AdventureMsg.TaskInfo.alwaysUseFieldBuilders ? this.getHeroInfosFieldBuilder() : null;
                  } else {
                     this.heroInfosBuilder_.addAllMessages(other.heroInfos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasTaskId()) {
               return false;
            } else if (!this.hasState()) {
               return false;
            } else if (!this.hasAcceptTime()) {
               return false;
            } else {
               for(int i = 0; i < this.getHeroInfosCount(); ++i) {
                  if (!this.getHeroInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            TaskInfo parsedMessage = null;

            try {
               parsedMessage = (TaskInfo)AdventureMsg.TaskInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (TaskInfo)e.getUnfinishedMessage();
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

         public String getCode() {
            Object ref = this.code_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.code_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getCodeBytes() {
            Object ref = this.code_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.code_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setCode(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.code_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = AdventureMsg.TaskInfo.getDefaultInstance().getCode();
            this.onChanged();
            return this;
         }

         public Builder setCodeBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.code_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasTaskId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTaskId() {
            return this.taskId_;
         }

         public Builder setTaskId(int value) {
            this.bitField0_ |= 2;
            this.taskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.bitField0_ &= -3;
            this.taskId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 4;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -5;
            this.state_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAcceptTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getAcceptTime() {
            return this.acceptTime_;
         }

         public Builder setAcceptTime(long value) {
            this.bitField0_ |= 8;
            this.acceptTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAcceptTime() {
            this.bitField0_ &= -9;
            this.acceptTime_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureHeroInfosIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.heroInfos_ = new ArrayList(this.heroInfos_);
               this.bitField0_ |= 16;
            }

         }

         public List<AdventureHero> getHeroInfosList() {
            return this.heroInfosBuilder_ == null ? Collections.unmodifiableList(this.heroInfos_) : this.heroInfosBuilder_.getMessageList();
         }

         public int getHeroInfosCount() {
            return this.heroInfosBuilder_ == null ? this.heroInfos_.size() : this.heroInfosBuilder_.getCount();
         }

         public AdventureHero getHeroInfos(int index) {
            return this.heroInfosBuilder_ == null ? (AdventureHero)this.heroInfos_.get(index) : (AdventureHero)this.heroInfosBuilder_.getMessage(index);
         }

         public Builder setHeroInfos(int index, AdventureHero value) {
            if (this.heroInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroInfosIsMutable();
               this.heroInfos_.set(index, value);
               this.onChanged();
            } else {
               this.heroInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHeroInfos(int index, AdventureHero.Builder builderForValue) {
            if (this.heroInfosBuilder_ == null) {
               this.ensureHeroInfosIsMutable();
               this.heroInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHeroInfos(AdventureHero value) {
            if (this.heroInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroInfosIsMutable();
               this.heroInfos_.add(value);
               this.onChanged();
            } else {
               this.heroInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHeroInfos(int index, AdventureHero value) {
            if (this.heroInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroInfosIsMutable();
               this.heroInfos_.add(index, value);
               this.onChanged();
            } else {
               this.heroInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHeroInfos(AdventureHero.Builder builderForValue) {
            if (this.heroInfosBuilder_ == null) {
               this.ensureHeroInfosIsMutable();
               this.heroInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.heroInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHeroInfos(int index, AdventureHero.Builder builderForValue) {
            if (this.heroInfosBuilder_ == null) {
               this.ensureHeroInfosIsMutable();
               this.heroInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHeroInfos(Iterable<? extends AdventureHero> values) {
            if (this.heroInfosBuilder_ == null) {
               this.ensureHeroInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroInfos_);
               this.onChanged();
            } else {
               this.heroInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHeroInfos() {
            if (this.heroInfosBuilder_ == null) {
               this.heroInfos_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.heroInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removeHeroInfos(int index) {
            if (this.heroInfosBuilder_ == null) {
               this.ensureHeroInfosIsMutable();
               this.heroInfos_.remove(index);
               this.onChanged();
            } else {
               this.heroInfosBuilder_.remove(index);
            }

            return this;
         }

         public AdventureHero.Builder getHeroInfosBuilder(int index) {
            return (AdventureHero.Builder)this.getHeroInfosFieldBuilder().getBuilder(index);
         }

         public AdventureHeroOrBuilder getHeroInfosOrBuilder(int index) {
            return this.heroInfosBuilder_ == null ? (AdventureHeroOrBuilder)this.heroInfos_.get(index) : (AdventureHeroOrBuilder)this.heroInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends AdventureHeroOrBuilder> getHeroInfosOrBuilderList() {
            return this.heroInfosBuilder_ != null ? this.heroInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.heroInfos_);
         }

         public AdventureHero.Builder addHeroInfosBuilder() {
            return (AdventureHero.Builder)this.getHeroInfosFieldBuilder().addBuilder(AdventureMsg.AdventureHero.getDefaultInstance());
         }

         public AdventureHero.Builder addHeroInfosBuilder(int index) {
            return (AdventureHero.Builder)this.getHeroInfosFieldBuilder().addBuilder(index, AdventureMsg.AdventureHero.getDefaultInstance());
         }

         public List<AdventureHero.Builder> getHeroInfosBuilderList() {
            return this.getHeroInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<AdventureHero, AdventureHero.Builder, AdventureHeroOrBuilder> getHeroInfosFieldBuilder() {
            if (this.heroInfosBuilder_ == null) {
               this.heroInfosBuilder_ = new RepeatedFieldBuilderV3(this.heroInfos_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.heroInfos_ = null;
            }

            return this.heroInfosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_OpenAdventureUi_7801 extends GeneratedMessageV3 implements C2S_OpenAdventureUi_7801OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenAdventureUi_7801 DEFAULT_INSTANCE = new C2S_OpenAdventureUi_7801();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenAdventureUi_7801> PARSER = new AbstractParser<C2S_OpenAdventureUi_7801>() {
         public C2S_OpenAdventureUi_7801 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenAdventureUi_7801(input, extensionRegistry);
         }
      };

      private C2S_OpenAdventureUi_7801(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenAdventureUi_7801() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenAdventureUi_7801();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenAdventureUi_7801(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_OpenAdventureUi_7801_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_OpenAdventureUi_7801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenAdventureUi_7801.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenAdventureUi_7801)) {
            return super.equals(obj);
         } else {
            C2S_OpenAdventureUi_7801 other = (C2S_OpenAdventureUi_7801)obj;
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

      public static C2S_OpenAdventureUi_7801 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenAdventureUi_7801)PARSER.parseFrom(data);
      }

      public static C2S_OpenAdventureUi_7801 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenAdventureUi_7801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenAdventureUi_7801 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenAdventureUi_7801)PARSER.parseFrom(data);
      }

      public static C2S_OpenAdventureUi_7801 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenAdventureUi_7801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenAdventureUi_7801 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenAdventureUi_7801)PARSER.parseFrom(data);
      }

      public static C2S_OpenAdventureUi_7801 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenAdventureUi_7801)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenAdventureUi_7801 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenAdventureUi_7801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenAdventureUi_7801 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenAdventureUi_7801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenAdventureUi_7801 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenAdventureUi_7801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenAdventureUi_7801 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenAdventureUi_7801)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenAdventureUi_7801 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenAdventureUi_7801)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenAdventureUi_7801 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenAdventureUi_7801)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenAdventureUi_7801 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenAdventureUi_7801 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenAdventureUi_7801> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenAdventureUi_7801> getParserForType() {
         return PARSER;
      }

      public C2S_OpenAdventureUi_7801 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenAdventureUi_7801OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_OpenAdventureUi_7801_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_OpenAdventureUi_7801_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenAdventureUi_7801.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.C2S_OpenAdventureUi_7801.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_OpenAdventureUi_7801_descriptor;
         }

         public C2S_OpenAdventureUi_7801 getDefaultInstanceForType() {
            return AdventureMsg.C2S_OpenAdventureUi_7801.getDefaultInstance();
         }

         public C2S_OpenAdventureUi_7801 build() {
            C2S_OpenAdventureUi_7801 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenAdventureUi_7801 buildPartial() {
            C2S_OpenAdventureUi_7801 result = new C2S_OpenAdventureUi_7801(this);
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
            if (other instanceof C2S_OpenAdventureUi_7801) {
               return this.mergeFrom((C2S_OpenAdventureUi_7801)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenAdventureUi_7801 other) {
            if (other == AdventureMsg.C2S_OpenAdventureUi_7801.getDefaultInstance()) {
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
            C2S_OpenAdventureUi_7801 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenAdventureUi_7801)AdventureMsg.C2S_OpenAdventureUi_7801.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenAdventureUi_7801)e.getUnfinishedMessage();
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

   public static final class S2C_OpenAdventureUiResult_7802 extends GeneratedMessageV3 implements S2C_OpenAdventureUiResult_7802OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<TaskInfo> infos_;
      public static final int ISACTIVITY_FIELD_NUMBER = 2;
      private boolean isActivity_;
      public static final int USEFREENUM_FIELD_NUMBER = 3;
      private int useFreeNum_;
      public static final int QUALITY_FIELD_NUMBER = 4;
      private Internal.IntList quality_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenAdventureUiResult_7802 DEFAULT_INSTANCE = new S2C_OpenAdventureUiResult_7802();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenAdventureUiResult_7802> PARSER = new AbstractParser<S2C_OpenAdventureUiResult_7802>() {
         public S2C_OpenAdventureUiResult_7802 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenAdventureUiResult_7802(input, extensionRegistry);
         }
      };

      private S2C_OpenAdventureUiResult_7802(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenAdventureUiResult_7802() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
         this.quality_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenAdventureUiResult_7802();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenAdventureUiResult_7802(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.infos_.add(input.readMessage(AdventureMsg.TaskInfo.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.isActivity_ = input.readBool();
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.useFreeNum_ = input.readInt32();
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.quality_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.quality_.addInt(input.readInt32());
                        break;
                     case 34:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.quality_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.quality_.addInt(input.readInt32());
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.quality_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_OpenAdventureUiResult_7802_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_OpenAdventureUiResult_7802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenAdventureUiResult_7802.class, Builder.class);
      }

      public List<TaskInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends TaskInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public TaskInfo getInfos(int index) {
         return (TaskInfo)this.infos_.get(index);
      }

      public TaskInfoOrBuilder getInfosOrBuilder(int index) {
         return (TaskInfoOrBuilder)this.infos_.get(index);
      }

      public boolean hasIsActivity() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsActivity() {
         return this.isActivity_;
      }

      public boolean hasUseFreeNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUseFreeNum() {
         return this.useFreeNum_;
      }

      public List<Integer> getQualityList() {
         return this.quality_;
      }

      public int getQualityCount() {
         return this.quality_.size();
      }

      public int getQuality(int index) {
         return this.quality_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUseFreeNum()) {
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
         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.infos_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(2, this.isActivity_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.useFreeNum_);
         }

         for(int i = 0; i < this.quality_.size(); ++i) {
            output.writeInt32(4, this.quality_.getInt(i));
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
               size += CodedOutputStream.computeBoolSize(2, this.isActivity_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.useFreeNum_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.quality_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.quality_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getQualityList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenAdventureUiResult_7802)) {
            return super.equals(obj);
         } else {
            S2C_OpenAdventureUiResult_7802 other = (S2C_OpenAdventureUiResult_7802)obj;
            if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else if (this.hasIsActivity() != other.hasIsActivity()) {
               return false;
            } else if (this.hasIsActivity() && this.getIsActivity() != other.getIsActivity()) {
               return false;
            } else if (this.hasUseFreeNum() != other.hasUseFreeNum()) {
               return false;
            } else if (this.hasUseFreeNum() && this.getUseFreeNum() != other.getUseFreeNum()) {
               return false;
            } else if (!this.getQualityList().equals(other.getQualityList())) {
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

            if (this.hasIsActivity()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsActivity());
            }

            if (this.hasUseFreeNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getUseFreeNum();
            }

            if (this.getQualityCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getQualityList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenAdventureUiResult_7802 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenAdventureUiResult_7802)PARSER.parseFrom(data);
      }

      public static S2C_OpenAdventureUiResult_7802 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenAdventureUiResult_7802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenAdventureUiResult_7802 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenAdventureUiResult_7802)PARSER.parseFrom(data);
      }

      public static S2C_OpenAdventureUiResult_7802 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenAdventureUiResult_7802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenAdventureUiResult_7802 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenAdventureUiResult_7802)PARSER.parseFrom(data);
      }

      public static S2C_OpenAdventureUiResult_7802 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenAdventureUiResult_7802)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenAdventureUiResult_7802 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenAdventureUiResult_7802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenAdventureUiResult_7802 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenAdventureUiResult_7802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenAdventureUiResult_7802 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenAdventureUiResult_7802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenAdventureUiResult_7802 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenAdventureUiResult_7802)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenAdventureUiResult_7802 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenAdventureUiResult_7802)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenAdventureUiResult_7802 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenAdventureUiResult_7802)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenAdventureUiResult_7802 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenAdventureUiResult_7802 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenAdventureUiResult_7802> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenAdventureUiResult_7802> getParserForType() {
         return PARSER;
      }

      public S2C_OpenAdventureUiResult_7802 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenAdventureUiResult_7802OrBuilder {
         private int bitField0_;
         private List<TaskInfo> infos_;
         private RepeatedFieldBuilderV3<TaskInfo, TaskInfo.Builder, TaskInfoOrBuilder> infosBuilder_;
         private boolean isActivity_;
         private int useFreeNum_;
         private Internal.IntList quality_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_OpenAdventureUiResult_7802_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_OpenAdventureUiResult_7802_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenAdventureUiResult_7802.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.quality_ = AdventureMsg.S2C_OpenAdventureUiResult_7802.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.quality_ = AdventureMsg.S2C_OpenAdventureUiResult_7802.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.S2C_OpenAdventureUiResult_7802.alwaysUseFieldBuilders) {
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

            this.isActivity_ = false;
            this.bitField0_ &= -3;
            this.useFreeNum_ = 0;
            this.bitField0_ &= -5;
            this.quality_ = AdventureMsg.S2C_OpenAdventureUiResult_7802.emptyIntList();
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_OpenAdventureUiResult_7802_descriptor;
         }

         public S2C_OpenAdventureUiResult_7802 getDefaultInstanceForType() {
            return AdventureMsg.S2C_OpenAdventureUiResult_7802.getDefaultInstance();
         }

         public S2C_OpenAdventureUiResult_7802 build() {
            S2C_OpenAdventureUiResult_7802 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenAdventureUiResult_7802 buildPartial() {
            S2C_OpenAdventureUiResult_7802 result = new S2C_OpenAdventureUiResult_7802(this);
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
               result.isActivity_ = this.isActivity_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.useFreeNum_ = this.useFreeNum_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.quality_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.quality_ = this.quality_;
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
            if (other instanceof S2C_OpenAdventureUiResult_7802) {
               return this.mergeFrom((S2C_OpenAdventureUiResult_7802)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenAdventureUiResult_7802 other) {
            if (other == AdventureMsg.S2C_OpenAdventureUiResult_7802.getDefaultInstance()) {
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
                     this.infosBuilder_ = AdventureMsg.S2C_OpenAdventureUiResult_7802.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               if (other.hasIsActivity()) {
                  this.setIsActivity(other.getIsActivity());
               }

               if (other.hasUseFreeNum()) {
                  this.setUseFreeNum(other.getUseFreeNum());
               }

               if (!other.quality_.isEmpty()) {
                  if (this.quality_.isEmpty()) {
                     this.quality_ = other.quality_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureQualityIsMutable();
                     this.quality_.addAll(other.quality_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasUseFreeNum()) {
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
            S2C_OpenAdventureUiResult_7802 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenAdventureUiResult_7802)AdventureMsg.S2C_OpenAdventureUiResult_7802.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenAdventureUiResult_7802)e.getUnfinishedMessage();
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

         public List<TaskInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public TaskInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (TaskInfo)this.infos_.get(index) : (TaskInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, TaskInfo value) {
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

         public Builder setInfos(int index, TaskInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(TaskInfo value) {
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

         public Builder addInfos(int index, TaskInfo value) {
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

         public Builder addInfos(TaskInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, TaskInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends TaskInfo> values) {
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

         public TaskInfo.Builder getInfosBuilder(int index) {
            return (TaskInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public TaskInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (TaskInfoOrBuilder)this.infos_.get(index) : (TaskInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends TaskInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public TaskInfo.Builder addInfosBuilder() {
            return (TaskInfo.Builder)this.getInfosFieldBuilder().addBuilder(AdventureMsg.TaskInfo.getDefaultInstance());
         }

         public TaskInfo.Builder addInfosBuilder(int index) {
            return (TaskInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, AdventureMsg.TaskInfo.getDefaultInstance());
         }

         public List<TaskInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<TaskInfo, TaskInfo.Builder, TaskInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public boolean hasIsActivity() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsActivity() {
            return this.isActivity_;
         }

         public Builder setIsActivity(boolean value) {
            this.bitField0_ |= 2;
            this.isActivity_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsActivity() {
            this.bitField0_ &= -3;
            this.isActivity_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasUseFreeNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getUseFreeNum() {
            return this.useFreeNum_;
         }

         public Builder setUseFreeNum(int value) {
            this.bitField0_ |= 4;
            this.useFreeNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUseFreeNum() {
            this.bitField0_ &= -5;
            this.useFreeNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureQualityIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.quality_ = AdventureMsg.S2C_OpenAdventureUiResult_7802.mutableCopy(this.quality_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getQualityList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.quality_) : this.quality_);
         }

         public int getQualityCount() {
            return this.quality_.size();
         }

         public int getQuality(int index) {
            return this.quality_.getInt(index);
         }

         public Builder setQuality(int index, int value) {
            this.ensureQualityIsMutable();
            this.quality_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addQuality(int value) {
            this.ensureQualityIsMutable();
            this.quality_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllQuality(Iterable<? extends Integer> values) {
            this.ensureQualityIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.quality_);
            this.onChanged();
            return this;
         }

         public Builder clearQuality() {
            this.quality_ = AdventureMsg.S2C_OpenAdventureUiResult_7802.emptyIntList();
            this.bitField0_ &= -9;
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

   public static final class C2S_FlushTask_7803 extends GeneratedMessageV3 implements C2S_FlushTask_7803OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISMUST_FIELD_NUMBER = 1;
      private int isMust_;
      private byte memoizedIsInitialized;
      private static final C2S_FlushTask_7803 DEFAULT_INSTANCE = new C2S_FlushTask_7803();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FlushTask_7803> PARSER = new AbstractParser<C2S_FlushTask_7803>() {
         public C2S_FlushTask_7803 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FlushTask_7803(input, extensionRegistry);
         }
      };

      private C2S_FlushTask_7803(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FlushTask_7803() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FlushTask_7803();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FlushTask_7803(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isMust_ = input.readInt32();
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
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_FlushTask_7803_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_FlushTask_7803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FlushTask_7803.class, Builder.class);
      }

      public boolean hasIsMust() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIsMust() {
         return this.isMust_;
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
            output.writeInt32(1, this.isMust_);
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
               size += CodedOutputStream.computeInt32Size(1, this.isMust_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FlushTask_7803)) {
            return super.equals(obj);
         } else {
            C2S_FlushTask_7803 other = (C2S_FlushTask_7803)obj;
            if (this.hasIsMust() != other.hasIsMust()) {
               return false;
            } else if (this.hasIsMust() && this.getIsMust() != other.getIsMust()) {
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
            if (this.hasIsMust()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIsMust();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FlushTask_7803 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FlushTask_7803)PARSER.parseFrom(data);
      }

      public static C2S_FlushTask_7803 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FlushTask_7803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FlushTask_7803 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FlushTask_7803)PARSER.parseFrom(data);
      }

      public static C2S_FlushTask_7803 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FlushTask_7803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FlushTask_7803 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FlushTask_7803)PARSER.parseFrom(data);
      }

      public static C2S_FlushTask_7803 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FlushTask_7803)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FlushTask_7803 parseFrom(InputStream input) throws IOException {
         return (C2S_FlushTask_7803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FlushTask_7803 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FlushTask_7803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FlushTask_7803 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FlushTask_7803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FlushTask_7803 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FlushTask_7803)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FlushTask_7803 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FlushTask_7803)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FlushTask_7803 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FlushTask_7803)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FlushTask_7803 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FlushTask_7803 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FlushTask_7803> parser() {
         return PARSER;
      }

      public Parser<C2S_FlushTask_7803> getParserForType() {
         return PARSER;
      }

      public C2S_FlushTask_7803 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FlushTask_7803OrBuilder {
         private int bitField0_;
         private int isMust_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_FlushTask_7803_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_FlushTask_7803_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FlushTask_7803.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.C2S_FlushTask_7803.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.isMust_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_FlushTask_7803_descriptor;
         }

         public C2S_FlushTask_7803 getDefaultInstanceForType() {
            return AdventureMsg.C2S_FlushTask_7803.getDefaultInstance();
         }

         public C2S_FlushTask_7803 build() {
            C2S_FlushTask_7803 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FlushTask_7803 buildPartial() {
            C2S_FlushTask_7803 result = new C2S_FlushTask_7803(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isMust_ = this.isMust_;
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
            if (other instanceof C2S_FlushTask_7803) {
               return this.mergeFrom((C2S_FlushTask_7803)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FlushTask_7803 other) {
            if (other == AdventureMsg.C2S_FlushTask_7803.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsMust()) {
                  this.setIsMust(other.getIsMust());
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
            C2S_FlushTask_7803 parsedMessage = null;

            try {
               parsedMessage = (C2S_FlushTask_7803)AdventureMsg.C2S_FlushTask_7803.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FlushTask_7803)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsMust() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIsMust() {
            return this.isMust_;
         }

         public Builder setIsMust(int value) {
            this.bitField0_ |= 1;
            this.isMust_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsMust() {
            this.bitField0_ &= -2;
            this.isMust_ = 0;
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

   public static final class S2C_FlushTaskResult_7804 extends GeneratedMessageV3 implements S2C_FlushTaskResult_7804OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_FlushTaskResult_7804 DEFAULT_INSTANCE = new S2C_FlushTaskResult_7804();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FlushTaskResult_7804> PARSER = new AbstractParser<S2C_FlushTaskResult_7804>() {
         public S2C_FlushTaskResult_7804 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FlushTaskResult_7804(input, extensionRegistry);
         }
      };

      private S2C_FlushTaskResult_7804(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FlushTaskResult_7804() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FlushTaskResult_7804();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FlushTaskResult_7804(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_FlushTaskResult_7804_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_FlushTaskResult_7804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FlushTaskResult_7804.class, Builder.class);
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
         } else if (!(obj instanceof S2C_FlushTaskResult_7804)) {
            return super.equals(obj);
         } else {
            S2C_FlushTaskResult_7804 other = (S2C_FlushTaskResult_7804)obj;
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

      public static S2C_FlushTaskResult_7804 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FlushTaskResult_7804)PARSER.parseFrom(data);
      }

      public static S2C_FlushTaskResult_7804 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FlushTaskResult_7804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FlushTaskResult_7804 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FlushTaskResult_7804)PARSER.parseFrom(data);
      }

      public static S2C_FlushTaskResult_7804 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FlushTaskResult_7804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FlushTaskResult_7804 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FlushTaskResult_7804)PARSER.parseFrom(data);
      }

      public static S2C_FlushTaskResult_7804 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FlushTaskResult_7804)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FlushTaskResult_7804 parseFrom(InputStream input) throws IOException {
         return (S2C_FlushTaskResult_7804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FlushTaskResult_7804 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FlushTaskResult_7804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FlushTaskResult_7804 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FlushTaskResult_7804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FlushTaskResult_7804 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FlushTaskResult_7804)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FlushTaskResult_7804 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FlushTaskResult_7804)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FlushTaskResult_7804 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FlushTaskResult_7804)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FlushTaskResult_7804 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FlushTaskResult_7804 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FlushTaskResult_7804> parser() {
         return PARSER;
      }

      public Parser<S2C_FlushTaskResult_7804> getParserForType() {
         return PARSER;
      }

      public S2C_FlushTaskResult_7804 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FlushTaskResult_7804OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_FlushTaskResult_7804_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_FlushTaskResult_7804_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FlushTaskResult_7804.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.S2C_FlushTaskResult_7804.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_FlushTaskResult_7804_descriptor;
         }

         public S2C_FlushTaskResult_7804 getDefaultInstanceForType() {
            return AdventureMsg.S2C_FlushTaskResult_7804.getDefaultInstance();
         }

         public S2C_FlushTaskResult_7804 build() {
            S2C_FlushTaskResult_7804 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FlushTaskResult_7804 buildPartial() {
            S2C_FlushTaskResult_7804 result = new S2C_FlushTaskResult_7804(this);
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
            if (other instanceof S2C_FlushTaskResult_7804) {
               return this.mergeFrom((S2C_FlushTaskResult_7804)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FlushTaskResult_7804 other) {
            if (other == AdventureMsg.S2C_FlushTaskResult_7804.getDefaultInstance()) {
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
            S2C_FlushTaskResult_7804 parsedMessage = null;

            try {
               parsedMessage = (S2C_FlushTaskResult_7804)AdventureMsg.S2C_FlushTaskResult_7804.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FlushTaskResult_7804)e.getUnfinishedMessage();
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

   public static final class C2S_AcceptTask_7805 extends GeneratedMessageV3 implements C2S_AcceptTask_7805OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private volatile Object code_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private Internal.IntList heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_AcceptTask_7805 DEFAULT_INSTANCE = new C2S_AcceptTask_7805();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AcceptTask_7805> PARSER = new AbstractParser<C2S_AcceptTask_7805>() {
         public C2S_AcceptTask_7805 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AcceptTask_7805(input, extensionRegistry);
         }
      };

      private C2S_AcceptTask_7805(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AcceptTask_7805() {
         this.memoizedIsInitialized = -1;
         this.code_ = "";
         this.heroCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AcceptTask_7805();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AcceptTask_7805(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = bs;
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.heroCode_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.heroCode_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroCode_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heroCode_.addInt(input.readInt32());
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
                  this.heroCode_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AcceptTask_7805_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AcceptTask_7805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AcceptTask_7805.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getCode() {
         Object ref = this.code_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.code_ = s;
            }

            return s;
         }
      }

      public ByteString getCodeBytes() {
         Object ref = this.code_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.code_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public List<Integer> getHeroCodeList() {
         return this.heroCode_;
      }

      public int getHeroCodeCount() {
         return this.heroCode_.size();
      }

      public int getHeroCode(int index) {
         return this.heroCode_.getInt(index);
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
            GeneratedMessageV3.writeString(output, 1, this.code_);
         }

         for(int i = 0; i < this.heroCode_.size(); ++i) {
            output.writeInt32(2, this.heroCode_.getInt(i));
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
               size += GeneratedMessageV3.computeStringSize(1, this.code_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.heroCode_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroCode_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroCodeList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AcceptTask_7805)) {
            return super.equals(obj);
         } else {
            C2S_AcceptTask_7805 other = (C2S_AcceptTask_7805)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && !this.getCode().equals(other.getCode())) {
               return false;
            } else if (!this.getHeroCodeList().equals(other.getHeroCodeList())) {
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
               hash = 53 * hash + this.getCode().hashCode();
            }

            if (this.getHeroCodeCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AcceptTask_7805 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AcceptTask_7805)PARSER.parseFrom(data);
      }

      public static C2S_AcceptTask_7805 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AcceptTask_7805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AcceptTask_7805 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AcceptTask_7805)PARSER.parseFrom(data);
      }

      public static C2S_AcceptTask_7805 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AcceptTask_7805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AcceptTask_7805 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AcceptTask_7805)PARSER.parseFrom(data);
      }

      public static C2S_AcceptTask_7805 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AcceptTask_7805)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AcceptTask_7805 parseFrom(InputStream input) throws IOException {
         return (C2S_AcceptTask_7805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AcceptTask_7805 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AcceptTask_7805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AcceptTask_7805 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AcceptTask_7805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AcceptTask_7805 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AcceptTask_7805)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AcceptTask_7805 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AcceptTask_7805)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AcceptTask_7805 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AcceptTask_7805)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AcceptTask_7805 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AcceptTask_7805 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AcceptTask_7805> parser() {
         return PARSER;
      }

      public Parser<C2S_AcceptTask_7805> getParserForType() {
         return PARSER;
      }

      public C2S_AcceptTask_7805 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AcceptTask_7805OrBuilder {
         private int bitField0_;
         private Object code_;
         private Internal.IntList heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AcceptTask_7805_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AcceptTask_7805_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AcceptTask_7805.class, Builder.class);
         }

         private Builder() {
            this.code_ = "";
            this.heroCode_ = AdventureMsg.C2S_AcceptTask_7805.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.code_ = "";
            this.heroCode_ = AdventureMsg.C2S_AcceptTask_7805.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.C2S_AcceptTask_7805.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = "";
            this.bitField0_ &= -2;
            this.heroCode_ = AdventureMsg.C2S_AcceptTask_7805.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AcceptTask_7805_descriptor;
         }

         public C2S_AcceptTask_7805 getDefaultInstanceForType() {
            return AdventureMsg.C2S_AcceptTask_7805.getDefaultInstance();
         }

         public C2S_AcceptTask_7805 build() {
            C2S_AcceptTask_7805 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AcceptTask_7805 buildPartial() {
            C2S_AcceptTask_7805 result = new C2S_AcceptTask_7805(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.code_ = this.code_;
            if ((this.bitField0_ & 2) != 0) {
               this.heroCode_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.heroCode_ = this.heroCode_;
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
            if (other instanceof C2S_AcceptTask_7805) {
               return this.mergeFrom((C2S_AcceptTask_7805)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AcceptTask_7805 other) {
            if (other == AdventureMsg.C2S_AcceptTask_7805.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.bitField0_ |= 1;
                  this.code_ = other.code_;
                  this.onChanged();
               }

               if (!other.heroCode_.isEmpty()) {
                  if (this.heroCode_.isEmpty()) {
                     this.heroCode_ = other.heroCode_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureHeroCodeIsMutable();
                     this.heroCode_.addAll(other.heroCode_);
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
            C2S_AcceptTask_7805 parsedMessage = null;

            try {
               parsedMessage = (C2S_AcceptTask_7805)AdventureMsg.C2S_AcceptTask_7805.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AcceptTask_7805)e.getUnfinishedMessage();
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

         public String getCode() {
            Object ref = this.code_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.code_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getCodeBytes() {
            Object ref = this.code_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.code_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setCode(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.code_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = AdventureMsg.C2S_AcceptTask_7805.getDefaultInstance().getCode();
            this.onChanged();
            return this;
         }

         public Builder setCodeBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.code_ = value;
               this.onChanged();
               return this;
            }
         }

         private void ensureHeroCodeIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.heroCode_ = AdventureMsg.C2S_AcceptTask_7805.mutableCopy(this.heroCode_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getHeroCodeList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.heroCode_) : this.heroCode_);
         }

         public int getHeroCodeCount() {
            return this.heroCode_.size();
         }

         public int getHeroCode(int index) {
            return this.heroCode_.getInt(index);
         }

         public Builder setHeroCode(int index, int value) {
            this.ensureHeroCodeIsMutable();
            this.heroCode_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroCode(int value) {
            this.ensureHeroCodeIsMutable();
            this.heroCode_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroCode(Iterable<? extends Integer> values) {
            this.ensureHeroCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroCode_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.heroCode_ = AdventureMsg.C2S_AcceptTask_7805.emptyIntList();
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

   public static final class S2C_AcceptTaskResult_7806 extends GeneratedMessageV3 implements S2C_AcceptTaskResult_7806OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int INFO_FIELD_NUMBER = 2;
      private TaskInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_AcceptTaskResult_7806 DEFAULT_INSTANCE = new S2C_AcceptTaskResult_7806();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AcceptTaskResult_7806> PARSER = new AbstractParser<S2C_AcceptTaskResult_7806>() {
         public S2C_AcceptTaskResult_7806 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AcceptTaskResult_7806(input, extensionRegistry);
         }
      };

      private S2C_AcceptTaskResult_7806(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AcceptTaskResult_7806() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AcceptTaskResult_7806();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AcceptTaskResult_7806(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        TaskInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (TaskInfo)input.readMessage(AdventureMsg.TaskInfo.PARSER, extensionRegistry);
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
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AcceptTaskResult_7806_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AcceptTaskResult_7806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AcceptTaskResult_7806.class, Builder.class);
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

      public TaskInfo getInfo() {
         return this.info_ == null ? AdventureMsg.TaskInfo.getDefaultInstance() : this.info_;
      }

      public TaskInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? AdventureMsg.TaskInfo.getDefaultInstance() : this.info_;
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
         } else if (!(obj instanceof S2C_AcceptTaskResult_7806)) {
            return super.equals(obj);
         } else {
            S2C_AcceptTaskResult_7806 other = (S2C_AcceptTaskResult_7806)obj;
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

      public static S2C_AcceptTaskResult_7806 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AcceptTaskResult_7806)PARSER.parseFrom(data);
      }

      public static S2C_AcceptTaskResult_7806 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AcceptTaskResult_7806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AcceptTaskResult_7806 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AcceptTaskResult_7806)PARSER.parseFrom(data);
      }

      public static S2C_AcceptTaskResult_7806 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AcceptTaskResult_7806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AcceptTaskResult_7806 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AcceptTaskResult_7806)PARSER.parseFrom(data);
      }

      public static S2C_AcceptTaskResult_7806 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AcceptTaskResult_7806)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AcceptTaskResult_7806 parseFrom(InputStream input) throws IOException {
         return (S2C_AcceptTaskResult_7806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AcceptTaskResult_7806 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AcceptTaskResult_7806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AcceptTaskResult_7806 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AcceptTaskResult_7806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AcceptTaskResult_7806 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AcceptTaskResult_7806)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AcceptTaskResult_7806 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AcceptTaskResult_7806)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AcceptTaskResult_7806 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AcceptTaskResult_7806)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AcceptTaskResult_7806 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AcceptTaskResult_7806 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AcceptTaskResult_7806> parser() {
         return PARSER;
      }

      public Parser<S2C_AcceptTaskResult_7806> getParserForType() {
         return PARSER;
      }

      public S2C_AcceptTaskResult_7806 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AcceptTaskResult_7806OrBuilder {
         private int bitField0_;
         private int result_;
         private TaskInfo info_;
         private SingleFieldBuilderV3<TaskInfo, TaskInfo.Builder, TaskInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AcceptTaskResult_7806_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AcceptTaskResult_7806_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AcceptTaskResult_7806.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.S2C_AcceptTaskResult_7806.alwaysUseFieldBuilders) {
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
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AcceptTaskResult_7806_descriptor;
         }

         public S2C_AcceptTaskResult_7806 getDefaultInstanceForType() {
            return AdventureMsg.S2C_AcceptTaskResult_7806.getDefaultInstance();
         }

         public S2C_AcceptTaskResult_7806 build() {
            S2C_AcceptTaskResult_7806 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AcceptTaskResult_7806 buildPartial() {
            S2C_AcceptTaskResult_7806 result = new S2C_AcceptTaskResult_7806(this);
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
                  result.info_ = (TaskInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_AcceptTaskResult_7806) {
               return this.mergeFrom((S2C_AcceptTaskResult_7806)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AcceptTaskResult_7806 other) {
            if (other == AdventureMsg.S2C_AcceptTaskResult_7806.getDefaultInstance()) {
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
            S2C_AcceptTaskResult_7806 parsedMessage = null;

            try {
               parsedMessage = (S2C_AcceptTaskResult_7806)AdventureMsg.S2C_AcceptTaskResult_7806.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AcceptTaskResult_7806)e.getUnfinishedMessage();
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

         public TaskInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? AdventureMsg.TaskInfo.getDefaultInstance() : this.info_;
            } else {
               return (TaskInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(TaskInfo value) {
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

         public Builder setInfo(TaskInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeInfo(TaskInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.info_ != null && this.info_ != AdventureMsg.TaskInfo.getDefaultInstance()) {
                  this.info_ = AdventureMsg.TaskInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public TaskInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (TaskInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public TaskInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (TaskInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? AdventureMsg.TaskInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<TaskInfo, TaskInfo.Builder, TaskInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class C2S_AccelerateTask_7807 extends GeneratedMessageV3 implements C2S_AccelerateTask_7807OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private volatile Object code_;
      private byte memoizedIsInitialized;
      private static final C2S_AccelerateTask_7807 DEFAULT_INSTANCE = new C2S_AccelerateTask_7807();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AccelerateTask_7807> PARSER = new AbstractParser<C2S_AccelerateTask_7807>() {
         public C2S_AccelerateTask_7807 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AccelerateTask_7807(input, extensionRegistry);
         }
      };

      private C2S_AccelerateTask_7807(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AccelerateTask_7807() {
         this.memoizedIsInitialized = -1;
         this.code_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AccelerateTask_7807();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AccelerateTask_7807(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = bs;
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
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AccelerateTask_7807_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AccelerateTask_7807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AccelerateTask_7807.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getCode() {
         Object ref = this.code_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.code_ = s;
            }

            return s;
         }
      }

      public ByteString getCodeBytes() {
         Object ref = this.code_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.code_ = b;
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
            GeneratedMessageV3.writeString(output, 1, this.code_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.code_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AccelerateTask_7807)) {
            return super.equals(obj);
         } else {
            C2S_AccelerateTask_7807 other = (C2S_AccelerateTask_7807)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && !this.getCode().equals(other.getCode())) {
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
               hash = 53 * hash + this.getCode().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AccelerateTask_7807 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AccelerateTask_7807)PARSER.parseFrom(data);
      }

      public static C2S_AccelerateTask_7807 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AccelerateTask_7807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AccelerateTask_7807 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AccelerateTask_7807)PARSER.parseFrom(data);
      }

      public static C2S_AccelerateTask_7807 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AccelerateTask_7807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AccelerateTask_7807 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AccelerateTask_7807)PARSER.parseFrom(data);
      }

      public static C2S_AccelerateTask_7807 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AccelerateTask_7807)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AccelerateTask_7807 parseFrom(InputStream input) throws IOException {
         return (C2S_AccelerateTask_7807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AccelerateTask_7807 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AccelerateTask_7807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AccelerateTask_7807 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AccelerateTask_7807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AccelerateTask_7807 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AccelerateTask_7807)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AccelerateTask_7807 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AccelerateTask_7807)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AccelerateTask_7807 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AccelerateTask_7807)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AccelerateTask_7807 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AccelerateTask_7807 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AccelerateTask_7807> parser() {
         return PARSER;
      }

      public Parser<C2S_AccelerateTask_7807> getParserForType() {
         return PARSER;
      }

      public C2S_AccelerateTask_7807 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AccelerateTask_7807OrBuilder {
         private int bitField0_;
         private Object code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AccelerateTask_7807_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AccelerateTask_7807_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AccelerateTask_7807.class, Builder.class);
         }

         private Builder() {
            this.code_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.code_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.C2S_AccelerateTask_7807.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AccelerateTask_7807_descriptor;
         }

         public C2S_AccelerateTask_7807 getDefaultInstanceForType() {
            return AdventureMsg.C2S_AccelerateTask_7807.getDefaultInstance();
         }

         public C2S_AccelerateTask_7807 build() {
            C2S_AccelerateTask_7807 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AccelerateTask_7807 buildPartial() {
            C2S_AccelerateTask_7807 result = new C2S_AccelerateTask_7807(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.code_ = this.code_;
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
            if (other instanceof C2S_AccelerateTask_7807) {
               return this.mergeFrom((C2S_AccelerateTask_7807)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AccelerateTask_7807 other) {
            if (other == AdventureMsg.C2S_AccelerateTask_7807.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.bitField0_ |= 1;
                  this.code_ = other.code_;
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
            C2S_AccelerateTask_7807 parsedMessage = null;

            try {
               parsedMessage = (C2S_AccelerateTask_7807)AdventureMsg.C2S_AccelerateTask_7807.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AccelerateTask_7807)e.getUnfinishedMessage();
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

         public String getCode() {
            Object ref = this.code_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.code_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getCodeBytes() {
            Object ref = this.code_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.code_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setCode(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.code_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = AdventureMsg.C2S_AccelerateTask_7807.getDefaultInstance().getCode();
            this.onChanged();
            return this;
         }

         public Builder setCodeBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.code_ = value;
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

   public static final class S2C_AccelerateTaskResult_7808 extends GeneratedMessageV3 implements S2C_AccelerateTaskResult_7808OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int INFO_FIELD_NUMBER = 2;
      private TaskInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_AccelerateTaskResult_7808 DEFAULT_INSTANCE = new S2C_AccelerateTaskResult_7808();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AccelerateTaskResult_7808> PARSER = new AbstractParser<S2C_AccelerateTaskResult_7808>() {
         public S2C_AccelerateTaskResult_7808 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AccelerateTaskResult_7808(input, extensionRegistry);
         }
      };

      private S2C_AccelerateTaskResult_7808(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AccelerateTaskResult_7808() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AccelerateTaskResult_7808();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AccelerateTaskResult_7808(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        TaskInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (TaskInfo)input.readMessage(AdventureMsg.TaskInfo.PARSER, extensionRegistry);
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
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AccelerateTaskResult_7808_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AccelerateTaskResult_7808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AccelerateTaskResult_7808.class, Builder.class);
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

      public TaskInfo getInfo() {
         return this.info_ == null ? AdventureMsg.TaskInfo.getDefaultInstance() : this.info_;
      }

      public TaskInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? AdventureMsg.TaskInfo.getDefaultInstance() : this.info_;
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
         } else if (!(obj instanceof S2C_AccelerateTaskResult_7808)) {
            return super.equals(obj);
         } else {
            S2C_AccelerateTaskResult_7808 other = (S2C_AccelerateTaskResult_7808)obj;
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

      public static S2C_AccelerateTaskResult_7808 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AccelerateTaskResult_7808)PARSER.parseFrom(data);
      }

      public static S2C_AccelerateTaskResult_7808 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AccelerateTaskResult_7808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AccelerateTaskResult_7808 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AccelerateTaskResult_7808)PARSER.parseFrom(data);
      }

      public static S2C_AccelerateTaskResult_7808 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AccelerateTaskResult_7808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AccelerateTaskResult_7808 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AccelerateTaskResult_7808)PARSER.parseFrom(data);
      }

      public static S2C_AccelerateTaskResult_7808 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AccelerateTaskResult_7808)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AccelerateTaskResult_7808 parseFrom(InputStream input) throws IOException {
         return (S2C_AccelerateTaskResult_7808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AccelerateTaskResult_7808 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AccelerateTaskResult_7808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AccelerateTaskResult_7808 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AccelerateTaskResult_7808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AccelerateTaskResult_7808 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AccelerateTaskResult_7808)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AccelerateTaskResult_7808 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AccelerateTaskResult_7808)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AccelerateTaskResult_7808 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AccelerateTaskResult_7808)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AccelerateTaskResult_7808 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AccelerateTaskResult_7808 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AccelerateTaskResult_7808> parser() {
         return PARSER;
      }

      public Parser<S2C_AccelerateTaskResult_7808> getParserForType() {
         return PARSER;
      }

      public S2C_AccelerateTaskResult_7808 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AccelerateTaskResult_7808OrBuilder {
         private int bitField0_;
         private int result_;
         private TaskInfo info_;
         private SingleFieldBuilderV3<TaskInfo, TaskInfo.Builder, TaskInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AccelerateTaskResult_7808_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AccelerateTaskResult_7808_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AccelerateTaskResult_7808.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.S2C_AccelerateTaskResult_7808.alwaysUseFieldBuilders) {
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
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AccelerateTaskResult_7808_descriptor;
         }

         public S2C_AccelerateTaskResult_7808 getDefaultInstanceForType() {
            return AdventureMsg.S2C_AccelerateTaskResult_7808.getDefaultInstance();
         }

         public S2C_AccelerateTaskResult_7808 build() {
            S2C_AccelerateTaskResult_7808 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AccelerateTaskResult_7808 buildPartial() {
            S2C_AccelerateTaskResult_7808 result = new S2C_AccelerateTaskResult_7808(this);
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
                  result.info_ = (TaskInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_AccelerateTaskResult_7808) {
               return this.mergeFrom((S2C_AccelerateTaskResult_7808)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AccelerateTaskResult_7808 other) {
            if (other == AdventureMsg.S2C_AccelerateTaskResult_7808.getDefaultInstance()) {
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
            S2C_AccelerateTaskResult_7808 parsedMessage = null;

            try {
               parsedMessage = (S2C_AccelerateTaskResult_7808)AdventureMsg.S2C_AccelerateTaskResult_7808.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AccelerateTaskResult_7808)e.getUnfinishedMessage();
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

         public TaskInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? AdventureMsg.TaskInfo.getDefaultInstance() : this.info_;
            } else {
               return (TaskInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(TaskInfo value) {
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

         public Builder setInfo(TaskInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeInfo(TaskInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.info_ != null && this.info_ != AdventureMsg.TaskInfo.getDefaultInstance()) {
                  this.info_ = AdventureMsg.TaskInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public TaskInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (TaskInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public TaskInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (TaskInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? AdventureMsg.TaskInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<TaskInfo, TaskInfo.Builder, TaskInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class C2S_TakeTask_7809 extends GeneratedMessageV3 implements C2S_TakeTask_7809OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private volatile Object code_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeTask_7809 DEFAULT_INSTANCE = new C2S_TakeTask_7809();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeTask_7809> PARSER = new AbstractParser<C2S_TakeTask_7809>() {
         public C2S_TakeTask_7809 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeTask_7809(input, extensionRegistry);
         }
      };

      private C2S_TakeTask_7809(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeTask_7809() {
         this.memoizedIsInitialized = -1;
         this.code_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeTask_7809();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeTask_7809(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.code_ = bs;
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
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_TakeTask_7809_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_TakeTask_7809_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeTask_7809.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getCode() {
         Object ref = this.code_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.code_ = s;
            }

            return s;
         }
      }

      public ByteString getCodeBytes() {
         Object ref = this.code_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.code_ = b;
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
            GeneratedMessageV3.writeString(output, 1, this.code_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.code_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TakeTask_7809)) {
            return super.equals(obj);
         } else {
            C2S_TakeTask_7809 other = (C2S_TakeTask_7809)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && !this.getCode().equals(other.getCode())) {
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
               hash = 53 * hash + this.getCode().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TakeTask_7809 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_7809)PARSER.parseFrom(data);
      }

      public static C2S_TakeTask_7809 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_7809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeTask_7809 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_7809)PARSER.parseFrom(data);
      }

      public static C2S_TakeTask_7809 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_7809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeTask_7809 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_7809)PARSER.parseFrom(data);
      }

      public static C2S_TakeTask_7809 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_7809)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeTask_7809 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeTask_7809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeTask_7809 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeTask_7809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeTask_7809 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeTask_7809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeTask_7809 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeTask_7809)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeTask_7809 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeTask_7809)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeTask_7809 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeTask_7809)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeTask_7809 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeTask_7809 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeTask_7809> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeTask_7809> getParserForType() {
         return PARSER;
      }

      public C2S_TakeTask_7809 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeTask_7809OrBuilder {
         private int bitField0_;
         private Object code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_TakeTask_7809_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_TakeTask_7809_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeTask_7809.class, Builder.class);
         }

         private Builder() {
            this.code_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.code_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.C2S_TakeTask_7809.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_TakeTask_7809_descriptor;
         }

         public C2S_TakeTask_7809 getDefaultInstanceForType() {
            return AdventureMsg.C2S_TakeTask_7809.getDefaultInstance();
         }

         public C2S_TakeTask_7809 build() {
            C2S_TakeTask_7809 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeTask_7809 buildPartial() {
            C2S_TakeTask_7809 result = new C2S_TakeTask_7809(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.code_ = this.code_;
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
            if (other instanceof C2S_TakeTask_7809) {
               return this.mergeFrom((C2S_TakeTask_7809)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeTask_7809 other) {
            if (other == AdventureMsg.C2S_TakeTask_7809.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.bitField0_ |= 1;
                  this.code_ = other.code_;
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
            C2S_TakeTask_7809 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeTask_7809)AdventureMsg.C2S_TakeTask_7809.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeTask_7809)e.getUnfinishedMessage();
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

         public String getCode() {
            Object ref = this.code_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.code_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getCodeBytes() {
            Object ref = this.code_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.code_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setCode(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.code_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearCode() {
            this.bitField0_ &= -2;
            this.code_ = AdventureMsg.C2S_TakeTask_7809.getDefaultInstance().getCode();
            this.onChanged();
            return this;
         }

         public Builder setCodeBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.code_ = value;
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

   public static final class S2C_TakeTaskResult_7810 extends GeneratedMessageV3 implements S2C_TakeTaskResult_7810OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int CODE_FIELD_NUMBER = 2;
      private volatile Object code_;
      private byte memoizedIsInitialized;
      private static final S2C_TakeTaskResult_7810 DEFAULT_INSTANCE = new S2C_TakeTaskResult_7810();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakeTaskResult_7810> PARSER = new AbstractParser<S2C_TakeTaskResult_7810>() {
         public S2C_TakeTaskResult_7810 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakeTaskResult_7810(input, extensionRegistry);
         }
      };

      private S2C_TakeTaskResult_7810(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakeTaskResult_7810() {
         this.memoizedIsInitialized = -1;
         this.code_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakeTaskResult_7810();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakeTaskResult_7810(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.code_ = bs;
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
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_TakeTaskResult_7810_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_TakeTaskResult_7810_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeTaskResult_7810.class, Builder.class);
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

      public String getCode() {
         Object ref = this.code_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.code_ = s;
            }

            return s;
         }
      }

      public ByteString getCodeBytes() {
         Object ref = this.code_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.code_ = b;
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
            GeneratedMessageV3.writeString(output, 2, this.code_);
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
               size += GeneratedMessageV3.computeStringSize(2, this.code_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TakeTaskResult_7810)) {
            return super.equals(obj);
         } else {
            S2C_TakeTaskResult_7810 other = (S2C_TakeTaskResult_7810)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && !this.getCode().equals(other.getCode())) {
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
               hash = 53 * hash + this.getCode().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TakeTaskResult_7810 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakeTaskResult_7810)PARSER.parseFrom(data);
      }

      public static S2C_TakeTaskResult_7810 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeTaskResult_7810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeTaskResult_7810 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakeTaskResult_7810)PARSER.parseFrom(data);
      }

      public static S2C_TakeTaskResult_7810 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeTaskResult_7810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeTaskResult_7810 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakeTaskResult_7810)PARSER.parseFrom(data);
      }

      public static S2C_TakeTaskResult_7810 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeTaskResult_7810)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeTaskResult_7810 parseFrom(InputStream input) throws IOException {
         return (S2C_TakeTaskResult_7810)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeTaskResult_7810 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeTaskResult_7810)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeTaskResult_7810 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakeTaskResult_7810)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakeTaskResult_7810 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeTaskResult_7810)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeTaskResult_7810 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakeTaskResult_7810)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeTaskResult_7810 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeTaskResult_7810)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakeTaskResult_7810 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakeTaskResult_7810 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakeTaskResult_7810> parser() {
         return PARSER;
      }

      public Parser<S2C_TakeTaskResult_7810> getParserForType() {
         return PARSER;
      }

      public S2C_TakeTaskResult_7810 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakeTaskResult_7810OrBuilder {
         private int bitField0_;
         private int result_;
         private Object code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_TakeTaskResult_7810_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_TakeTaskResult_7810_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeTaskResult_7810.class, Builder.class);
         }

         private Builder() {
            this.code_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.code_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.S2C_TakeTaskResult_7810.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.code_ = "";
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_TakeTaskResult_7810_descriptor;
         }

         public S2C_TakeTaskResult_7810 getDefaultInstanceForType() {
            return AdventureMsg.S2C_TakeTaskResult_7810.getDefaultInstance();
         }

         public S2C_TakeTaskResult_7810 build() {
            S2C_TakeTaskResult_7810 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakeTaskResult_7810 buildPartial() {
            S2C_TakeTaskResult_7810 result = new S2C_TakeTaskResult_7810(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.code_ = this.code_;
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
            if (other instanceof S2C_TakeTaskResult_7810) {
               return this.mergeFrom((S2C_TakeTaskResult_7810)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakeTaskResult_7810 other) {
            if (other == AdventureMsg.S2C_TakeTaskResult_7810.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasCode()) {
                  this.bitField0_ |= 2;
                  this.code_ = other.code_;
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
            } else {
               return this.hasCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TakeTaskResult_7810 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakeTaskResult_7810)AdventureMsg.S2C_TakeTaskResult_7810.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakeTaskResult_7810)e.getUnfinishedMessage();
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

         public String getCode() {
            Object ref = this.code_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.code_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getCodeBytes() {
            Object ref = this.code_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.code_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setCode(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.code_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearCode() {
            this.bitField0_ &= -3;
            this.code_ = AdventureMsg.S2C_TakeTaskResult_7810.getDefaultInstance().getCode();
            this.onChanged();
            return this;
         }

         public Builder setCodeBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.code_ = value;
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

   public static final class C2S_TakeAllTask_7811 extends GeneratedMessageV3 implements C2S_TakeAllTask_7811OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TakeAllTask_7811 DEFAULT_INSTANCE = new C2S_TakeAllTask_7811();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeAllTask_7811> PARSER = new AbstractParser<C2S_TakeAllTask_7811>() {
         public C2S_TakeAllTask_7811 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeAllTask_7811(input, extensionRegistry);
         }
      };

      private C2S_TakeAllTask_7811(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeAllTask_7811() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeAllTask_7811();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeAllTask_7811(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_TakeAllTask_7811_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_TakeAllTask_7811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeAllTask_7811.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TakeAllTask_7811)) {
            return super.equals(obj);
         } else {
            C2S_TakeAllTask_7811 other = (C2S_TakeAllTask_7811)obj;
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

      public static C2S_TakeAllTask_7811 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeAllTask_7811)PARSER.parseFrom(data);
      }

      public static C2S_TakeAllTask_7811 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeAllTask_7811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeAllTask_7811 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeAllTask_7811)PARSER.parseFrom(data);
      }

      public static C2S_TakeAllTask_7811 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeAllTask_7811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeAllTask_7811 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeAllTask_7811)PARSER.parseFrom(data);
      }

      public static C2S_TakeAllTask_7811 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeAllTask_7811)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeAllTask_7811 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeAllTask_7811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeAllTask_7811 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeAllTask_7811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeAllTask_7811 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeAllTask_7811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeAllTask_7811 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeAllTask_7811)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeAllTask_7811 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeAllTask_7811)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeAllTask_7811 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeAllTask_7811)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeAllTask_7811 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeAllTask_7811 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeAllTask_7811> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeAllTask_7811> getParserForType() {
         return PARSER;
      }

      public C2S_TakeAllTask_7811 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeAllTask_7811OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_TakeAllTask_7811_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_TakeAllTask_7811_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeAllTask_7811.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.C2S_TakeAllTask_7811.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_TakeAllTask_7811_descriptor;
         }

         public C2S_TakeAllTask_7811 getDefaultInstanceForType() {
            return AdventureMsg.C2S_TakeAllTask_7811.getDefaultInstance();
         }

         public C2S_TakeAllTask_7811 build() {
            C2S_TakeAllTask_7811 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeAllTask_7811 buildPartial() {
            C2S_TakeAllTask_7811 result = new C2S_TakeAllTask_7811(this);
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
            if (other instanceof C2S_TakeAllTask_7811) {
               return this.mergeFrom((C2S_TakeAllTask_7811)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeAllTask_7811 other) {
            if (other == AdventureMsg.C2S_TakeAllTask_7811.getDefaultInstance()) {
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
            C2S_TakeAllTask_7811 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeAllTask_7811)AdventureMsg.C2S_TakeAllTask_7811.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeAllTask_7811)e.getUnfinishedMessage();
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

   public static final class S2C_TakeAllTaskResult_7812 extends GeneratedMessageV3 implements S2C_TakeAllTaskResult_7812OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int CODES_FIELD_NUMBER = 2;
      private LazyStringList codes_;
      private byte memoizedIsInitialized;
      private static final S2C_TakeAllTaskResult_7812 DEFAULT_INSTANCE = new S2C_TakeAllTaskResult_7812();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakeAllTaskResult_7812> PARSER = new AbstractParser<S2C_TakeAllTaskResult_7812>() {
         public S2C_TakeAllTaskResult_7812 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakeAllTaskResult_7812(input, extensionRegistry);
         }
      };

      private S2C_TakeAllTaskResult_7812(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakeAllTaskResult_7812() {
         this.memoizedIsInitialized = -1;
         this.codes_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakeAllTaskResult_7812();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakeAllTaskResult_7812(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ByteString bs = input.readBytes();
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.codes_ = new LazyStringArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.codes_.add(bs);
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
                  this.codes_ = this.codes_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_TakeAllTaskResult_7812_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_TakeAllTaskResult_7812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeAllTaskResult_7812.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public ProtocolStringList getCodesList() {
         return this.codes_;
      }

      public int getCodesCount() {
         return this.codes_.size();
      }

      public String getCodes(int index) {
         return (String)this.codes_.get(index);
      }

      public ByteString getCodesBytes(int index) {
         return this.codes_.getByteString(index);
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
            GeneratedMessageV3.writeString(output, 2, this.codes_.getRaw(i));
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
               dataSize += computeStringSizeNoTag(this.codes_.getRaw(i));
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
         } else if (!(obj instanceof S2C_TakeAllTaskResult_7812)) {
            return super.equals(obj);
         } else {
            S2C_TakeAllTaskResult_7812 other = (S2C_TakeAllTaskResult_7812)obj;
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

      public static S2C_TakeAllTaskResult_7812 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakeAllTaskResult_7812)PARSER.parseFrom(data);
      }

      public static S2C_TakeAllTaskResult_7812 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeAllTaskResult_7812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeAllTaskResult_7812 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakeAllTaskResult_7812)PARSER.parseFrom(data);
      }

      public static S2C_TakeAllTaskResult_7812 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeAllTaskResult_7812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeAllTaskResult_7812 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakeAllTaskResult_7812)PARSER.parseFrom(data);
      }

      public static S2C_TakeAllTaskResult_7812 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeAllTaskResult_7812)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeAllTaskResult_7812 parseFrom(InputStream input) throws IOException {
         return (S2C_TakeAllTaskResult_7812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeAllTaskResult_7812 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeAllTaskResult_7812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeAllTaskResult_7812 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakeAllTaskResult_7812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakeAllTaskResult_7812 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeAllTaskResult_7812)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeAllTaskResult_7812 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakeAllTaskResult_7812)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeAllTaskResult_7812 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeAllTaskResult_7812)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakeAllTaskResult_7812 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakeAllTaskResult_7812 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakeAllTaskResult_7812> parser() {
         return PARSER;
      }

      public Parser<S2C_TakeAllTaskResult_7812> getParserForType() {
         return PARSER;
      }

      public S2C_TakeAllTaskResult_7812 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakeAllTaskResult_7812OrBuilder {
         private int bitField0_;
         private int result_;
         private LazyStringList codes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_TakeAllTaskResult_7812_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_TakeAllTaskResult_7812_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeAllTaskResult_7812.class, Builder.class);
         }

         private Builder() {
            this.codes_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codes_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.S2C_TakeAllTaskResult_7812.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.codes_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_TakeAllTaskResult_7812_descriptor;
         }

         public S2C_TakeAllTaskResult_7812 getDefaultInstanceForType() {
            return AdventureMsg.S2C_TakeAllTaskResult_7812.getDefaultInstance();
         }

         public S2C_TakeAllTaskResult_7812 build() {
            S2C_TakeAllTaskResult_7812 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakeAllTaskResult_7812 buildPartial() {
            S2C_TakeAllTaskResult_7812 result = new S2C_TakeAllTaskResult_7812(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.codes_ = this.codes_.getUnmodifiableView();
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
            if (other instanceof S2C_TakeAllTaskResult_7812) {
               return this.mergeFrom((S2C_TakeAllTaskResult_7812)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakeAllTaskResult_7812 other) {
            if (other == AdventureMsg.S2C_TakeAllTaskResult_7812.getDefaultInstance()) {
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
            S2C_TakeAllTaskResult_7812 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakeAllTaskResult_7812)AdventureMsg.S2C_TakeAllTaskResult_7812.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakeAllTaskResult_7812)e.getUnfinishedMessage();
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
               this.codes_ = new LazyStringArrayList(this.codes_);
               this.bitField0_ |= 2;
            }

         }

         public ProtocolStringList getCodesList() {
            return this.codes_.getUnmodifiableView();
         }

         public int getCodesCount() {
            return this.codes_.size();
         }

         public String getCodes(int index) {
            return (String)this.codes_.get(index);
         }

         public ByteString getCodesBytes(int index) {
            return this.codes_.getByteString(index);
         }

         public Builder setCodes(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureCodesIsMutable();
               this.codes_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addCodes(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureCodesIsMutable();
               this.codes_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllCodes(Iterable<String> values) {
            this.ensureCodesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.codes_);
            this.onChanged();
            return this;
         }

         public Builder clearCodes() {
            this.codes_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public Builder addCodesBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureCodesIsMutable();
               this.codes_.add(value);
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

   public static final class C2S_AutoAcceptQuality_7813 extends GeneratedMessageV3 implements C2S_AutoAcceptQuality_7813OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int QUALITY_FIELD_NUMBER = 1;
      private Internal.IntList quality_;
      private byte memoizedIsInitialized;
      private static final C2S_AutoAcceptQuality_7813 DEFAULT_INSTANCE = new C2S_AutoAcceptQuality_7813();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AutoAcceptQuality_7813> PARSER = new AbstractParser<C2S_AutoAcceptQuality_7813>() {
         public C2S_AutoAcceptQuality_7813 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AutoAcceptQuality_7813(input, extensionRegistry);
         }
      };

      private C2S_AutoAcceptQuality_7813(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AutoAcceptQuality_7813() {
         this.memoizedIsInitialized = -1;
         this.quality_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AutoAcceptQuality_7813();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AutoAcceptQuality_7813(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.quality_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.quality_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.quality_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.quality_.addInt(input.readInt32());
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
                  this.quality_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AutoAcceptQuality_7813_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AutoAcceptQuality_7813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AutoAcceptQuality_7813.class, Builder.class);
      }

      public List<Integer> getQualityList() {
         return this.quality_;
      }

      public int getQualityCount() {
         return this.quality_.size();
      }

      public int getQuality(int index) {
         return this.quality_.getInt(index);
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
         for(int i = 0; i < this.quality_.size(); ++i) {
            output.writeInt32(1, this.quality_.getInt(i));
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

            for(int i = 0; i < this.quality_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.quality_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getQualityList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_AutoAcceptQuality_7813)) {
            return super.equals(obj);
         } else {
            C2S_AutoAcceptQuality_7813 other = (C2S_AutoAcceptQuality_7813)obj;
            if (!this.getQualityList().equals(other.getQualityList())) {
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
            if (this.getQualityCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getQualityList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_AutoAcceptQuality_7813 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AutoAcceptQuality_7813)PARSER.parseFrom(data);
      }

      public static C2S_AutoAcceptQuality_7813 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AutoAcceptQuality_7813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AutoAcceptQuality_7813 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AutoAcceptQuality_7813)PARSER.parseFrom(data);
      }

      public static C2S_AutoAcceptQuality_7813 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AutoAcceptQuality_7813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AutoAcceptQuality_7813 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AutoAcceptQuality_7813)PARSER.parseFrom(data);
      }

      public static C2S_AutoAcceptQuality_7813 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AutoAcceptQuality_7813)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AutoAcceptQuality_7813 parseFrom(InputStream input) throws IOException {
         return (C2S_AutoAcceptQuality_7813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AutoAcceptQuality_7813 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AutoAcceptQuality_7813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AutoAcceptQuality_7813 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AutoAcceptQuality_7813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AutoAcceptQuality_7813 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AutoAcceptQuality_7813)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AutoAcceptQuality_7813 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AutoAcceptQuality_7813)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AutoAcceptQuality_7813 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AutoAcceptQuality_7813)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AutoAcceptQuality_7813 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AutoAcceptQuality_7813 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AutoAcceptQuality_7813> parser() {
         return PARSER;
      }

      public Parser<C2S_AutoAcceptQuality_7813> getParserForType() {
         return PARSER;
      }

      public C2S_AutoAcceptQuality_7813 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AutoAcceptQuality_7813OrBuilder {
         private int bitField0_;
         private Internal.IntList quality_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AutoAcceptQuality_7813_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AutoAcceptQuality_7813_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AutoAcceptQuality_7813.class, Builder.class);
         }

         private Builder() {
            this.quality_ = AdventureMsg.C2S_AutoAcceptQuality_7813.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.quality_ = AdventureMsg.C2S_AutoAcceptQuality_7813.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.C2S_AutoAcceptQuality_7813.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.quality_ = AdventureMsg.C2S_AutoAcceptQuality_7813.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AutoAcceptQuality_7813_descriptor;
         }

         public C2S_AutoAcceptQuality_7813 getDefaultInstanceForType() {
            return AdventureMsg.C2S_AutoAcceptQuality_7813.getDefaultInstance();
         }

         public C2S_AutoAcceptQuality_7813 build() {
            C2S_AutoAcceptQuality_7813 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AutoAcceptQuality_7813 buildPartial() {
            C2S_AutoAcceptQuality_7813 result = new C2S_AutoAcceptQuality_7813(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.quality_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.quality_ = this.quality_;
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
            if (other instanceof C2S_AutoAcceptQuality_7813) {
               return this.mergeFrom((C2S_AutoAcceptQuality_7813)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AutoAcceptQuality_7813 other) {
            if (other == AdventureMsg.C2S_AutoAcceptQuality_7813.getDefaultInstance()) {
               return this;
            } else {
               if (!other.quality_.isEmpty()) {
                  if (this.quality_.isEmpty()) {
                     this.quality_ = other.quality_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureQualityIsMutable();
                     this.quality_.addAll(other.quality_);
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
            C2S_AutoAcceptQuality_7813 parsedMessage = null;

            try {
               parsedMessage = (C2S_AutoAcceptQuality_7813)AdventureMsg.C2S_AutoAcceptQuality_7813.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AutoAcceptQuality_7813)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureQualityIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.quality_ = AdventureMsg.C2S_AutoAcceptQuality_7813.mutableCopy(this.quality_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getQualityList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.quality_) : this.quality_);
         }

         public int getQualityCount() {
            return this.quality_.size();
         }

         public int getQuality(int index) {
            return this.quality_.getInt(index);
         }

         public Builder setQuality(int index, int value) {
            this.ensureQualityIsMutable();
            this.quality_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addQuality(int value) {
            this.ensureQualityIsMutable();
            this.quality_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllQuality(Iterable<? extends Integer> values) {
            this.ensureQualityIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.quality_);
            this.onChanged();
            return this;
         }

         public Builder clearQuality() {
            this.quality_ = AdventureMsg.C2S_AutoAcceptQuality_7813.emptyIntList();
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

   public static final class S2C_AutoAcceptQuality_7814 extends GeneratedMessageV3 implements S2C_AutoAcceptQuality_7814OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int QUALITY_FIELD_NUMBER = 1;
      private Internal.IntList quality_;
      private byte memoizedIsInitialized;
      private static final S2C_AutoAcceptQuality_7814 DEFAULT_INSTANCE = new S2C_AutoAcceptQuality_7814();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AutoAcceptQuality_7814> PARSER = new AbstractParser<S2C_AutoAcceptQuality_7814>() {
         public S2C_AutoAcceptQuality_7814 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AutoAcceptQuality_7814(input, extensionRegistry);
         }
      };

      private S2C_AutoAcceptQuality_7814(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AutoAcceptQuality_7814() {
         this.memoizedIsInitialized = -1;
         this.quality_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AutoAcceptQuality_7814();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AutoAcceptQuality_7814(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.quality_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.quality_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.quality_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.quality_.addInt(input.readInt32());
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
                  this.quality_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AutoAcceptQuality_7814_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AutoAcceptQuality_7814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AutoAcceptQuality_7814.class, Builder.class);
      }

      public List<Integer> getQualityList() {
         return this.quality_;
      }

      public int getQualityCount() {
         return this.quality_.size();
      }

      public int getQuality(int index) {
         return this.quality_.getInt(index);
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
         for(int i = 0; i < this.quality_.size(); ++i) {
            output.writeInt32(1, this.quality_.getInt(i));
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

            for(int i = 0; i < this.quality_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.quality_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getQualityList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AutoAcceptQuality_7814)) {
            return super.equals(obj);
         } else {
            S2C_AutoAcceptQuality_7814 other = (S2C_AutoAcceptQuality_7814)obj;
            if (!this.getQualityList().equals(other.getQualityList())) {
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
            if (this.getQualityCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getQualityList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AutoAcceptQuality_7814 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AutoAcceptQuality_7814)PARSER.parseFrom(data);
      }

      public static S2C_AutoAcceptQuality_7814 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AutoAcceptQuality_7814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AutoAcceptQuality_7814 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AutoAcceptQuality_7814)PARSER.parseFrom(data);
      }

      public static S2C_AutoAcceptQuality_7814 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AutoAcceptQuality_7814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AutoAcceptQuality_7814 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AutoAcceptQuality_7814)PARSER.parseFrom(data);
      }

      public static S2C_AutoAcceptQuality_7814 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AutoAcceptQuality_7814)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AutoAcceptQuality_7814 parseFrom(InputStream input) throws IOException {
         return (S2C_AutoAcceptQuality_7814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AutoAcceptQuality_7814 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AutoAcceptQuality_7814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AutoAcceptQuality_7814 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AutoAcceptQuality_7814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AutoAcceptQuality_7814 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AutoAcceptQuality_7814)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AutoAcceptQuality_7814 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AutoAcceptQuality_7814)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AutoAcceptQuality_7814 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AutoAcceptQuality_7814)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AutoAcceptQuality_7814 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AutoAcceptQuality_7814 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AutoAcceptQuality_7814> parser() {
         return PARSER;
      }

      public Parser<S2C_AutoAcceptQuality_7814> getParserForType() {
         return PARSER;
      }

      public S2C_AutoAcceptQuality_7814 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AutoAcceptQuality_7814OrBuilder {
         private int bitField0_;
         private Internal.IntList quality_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AutoAcceptQuality_7814_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AutoAcceptQuality_7814_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AutoAcceptQuality_7814.class, Builder.class);
         }

         private Builder() {
            this.quality_ = AdventureMsg.S2C_AutoAcceptQuality_7814.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.quality_ = AdventureMsg.S2C_AutoAcceptQuality_7814.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.S2C_AutoAcceptQuality_7814.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.quality_ = AdventureMsg.S2C_AutoAcceptQuality_7814.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AutoAcceptQuality_7814_descriptor;
         }

         public S2C_AutoAcceptQuality_7814 getDefaultInstanceForType() {
            return AdventureMsg.S2C_AutoAcceptQuality_7814.getDefaultInstance();
         }

         public S2C_AutoAcceptQuality_7814 build() {
            S2C_AutoAcceptQuality_7814 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AutoAcceptQuality_7814 buildPartial() {
            S2C_AutoAcceptQuality_7814 result = new S2C_AutoAcceptQuality_7814(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.quality_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.quality_ = this.quality_;
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
            if (other instanceof S2C_AutoAcceptQuality_7814) {
               return this.mergeFrom((S2C_AutoAcceptQuality_7814)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AutoAcceptQuality_7814 other) {
            if (other == AdventureMsg.S2C_AutoAcceptQuality_7814.getDefaultInstance()) {
               return this;
            } else {
               if (!other.quality_.isEmpty()) {
                  if (this.quality_.isEmpty()) {
                     this.quality_ = other.quality_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureQualityIsMutable();
                     this.quality_.addAll(other.quality_);
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
            S2C_AutoAcceptQuality_7814 parsedMessage = null;

            try {
               parsedMessage = (S2C_AutoAcceptQuality_7814)AdventureMsg.S2C_AutoAcceptQuality_7814.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AutoAcceptQuality_7814)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureQualityIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.quality_ = AdventureMsg.S2C_AutoAcceptQuality_7814.mutableCopy(this.quality_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getQualityList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.quality_) : this.quality_);
         }

         public int getQualityCount() {
            return this.quality_.size();
         }

         public int getQuality(int index) {
            return this.quality_.getInt(index);
         }

         public Builder setQuality(int index, int value) {
            this.ensureQualityIsMutable();
            this.quality_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addQuality(int value) {
            this.ensureQualityIsMutable();
            this.quality_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllQuality(Iterable<? extends Integer> values) {
            this.ensureQualityIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.quality_);
            this.onChanged();
            return this;
         }

         public Builder clearQuality() {
            this.quality_ = AdventureMsg.S2C_AutoAcceptQuality_7814.emptyIntList();
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

   public static final class C2S_AutoAccept_7815 extends GeneratedMessageV3 implements C2S_AutoAccept_7815OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_AutoAccept_7815 DEFAULT_INSTANCE = new C2S_AutoAccept_7815();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_AutoAccept_7815> PARSER = new AbstractParser<C2S_AutoAccept_7815>() {
         public C2S_AutoAccept_7815 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_AutoAccept_7815(input, extensionRegistry);
         }
      };

      private C2S_AutoAccept_7815(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_AutoAccept_7815() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_AutoAccept_7815();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_AutoAccept_7815(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AutoAccept_7815_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AutoAccept_7815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AutoAccept_7815.class, Builder.class);
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
         } else if (!(obj instanceof C2S_AutoAccept_7815)) {
            return super.equals(obj);
         } else {
            C2S_AutoAccept_7815 other = (C2S_AutoAccept_7815)obj;
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

      public static C2S_AutoAccept_7815 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_AutoAccept_7815)PARSER.parseFrom(data);
      }

      public static C2S_AutoAccept_7815 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AutoAccept_7815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AutoAccept_7815 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_AutoAccept_7815)PARSER.parseFrom(data);
      }

      public static C2S_AutoAccept_7815 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AutoAccept_7815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AutoAccept_7815 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_AutoAccept_7815)PARSER.parseFrom(data);
      }

      public static C2S_AutoAccept_7815 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_AutoAccept_7815)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_AutoAccept_7815 parseFrom(InputStream input) throws IOException {
         return (C2S_AutoAccept_7815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AutoAccept_7815 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AutoAccept_7815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AutoAccept_7815 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_AutoAccept_7815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_AutoAccept_7815 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AutoAccept_7815)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_AutoAccept_7815 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_AutoAccept_7815)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_AutoAccept_7815 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_AutoAccept_7815)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_AutoAccept_7815 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_AutoAccept_7815 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_AutoAccept_7815> parser() {
         return PARSER;
      }

      public Parser<C2S_AutoAccept_7815> getParserForType() {
         return PARSER;
      }

      public C2S_AutoAccept_7815 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_AutoAccept_7815OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AutoAccept_7815_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AutoAccept_7815_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_AutoAccept_7815.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.C2S_AutoAccept_7815.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_C2S_AutoAccept_7815_descriptor;
         }

         public C2S_AutoAccept_7815 getDefaultInstanceForType() {
            return AdventureMsg.C2S_AutoAccept_7815.getDefaultInstance();
         }

         public C2S_AutoAccept_7815 build() {
            C2S_AutoAccept_7815 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_AutoAccept_7815 buildPartial() {
            C2S_AutoAccept_7815 result = new C2S_AutoAccept_7815(this);
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
            if (other instanceof C2S_AutoAccept_7815) {
               return this.mergeFrom((C2S_AutoAccept_7815)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_AutoAccept_7815 other) {
            if (other == AdventureMsg.C2S_AutoAccept_7815.getDefaultInstance()) {
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
            C2S_AutoAccept_7815 parsedMessage = null;

            try {
               parsedMessage = (C2S_AutoAccept_7815)AdventureMsg.C2S_AutoAccept_7815.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_AutoAccept_7815)e.getUnfinishedMessage();
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

   public static final class S2C_AutoAccept_7816 extends GeneratedMessageV3 implements S2C_AutoAccept_7816OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2C_AutoAccept_7816 DEFAULT_INSTANCE = new S2C_AutoAccept_7816();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AutoAccept_7816> PARSER = new AbstractParser<S2C_AutoAccept_7816>() {
         public S2C_AutoAccept_7816 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AutoAccept_7816(input, extensionRegistry);
         }
      };

      private S2C_AutoAccept_7816(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AutoAccept_7816() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AutoAccept_7816();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AutoAccept_7816(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AutoAccept_7816_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AutoAccept_7816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AutoAccept_7816.class, Builder.class);
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
         } else if (!(obj instanceof S2C_AutoAccept_7816)) {
            return super.equals(obj);
         } else {
            S2C_AutoAccept_7816 other = (S2C_AutoAccept_7816)obj;
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

      public static S2C_AutoAccept_7816 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AutoAccept_7816)PARSER.parseFrom(data);
      }

      public static S2C_AutoAccept_7816 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AutoAccept_7816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AutoAccept_7816 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AutoAccept_7816)PARSER.parseFrom(data);
      }

      public static S2C_AutoAccept_7816 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AutoAccept_7816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AutoAccept_7816 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AutoAccept_7816)PARSER.parseFrom(data);
      }

      public static S2C_AutoAccept_7816 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AutoAccept_7816)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AutoAccept_7816 parseFrom(InputStream input) throws IOException {
         return (S2C_AutoAccept_7816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AutoAccept_7816 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AutoAccept_7816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AutoAccept_7816 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AutoAccept_7816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AutoAccept_7816 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AutoAccept_7816)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AutoAccept_7816 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AutoAccept_7816)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AutoAccept_7816 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AutoAccept_7816)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AutoAccept_7816 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AutoAccept_7816 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AutoAccept_7816> parser() {
         return PARSER;
      }

      public Parser<S2C_AutoAccept_7816> getParserForType() {
         return PARSER;
      }

      public S2C_AutoAccept_7816 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AutoAccept_7816OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AutoAccept_7816_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AutoAccept_7816_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AutoAccept_7816.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (AdventureMsg.S2C_AutoAccept_7816.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return AdventureMsg.internal_static_adventure_com_gzbz_protobuf_S2C_AutoAccept_7816_descriptor;
         }

         public S2C_AutoAccept_7816 getDefaultInstanceForType() {
            return AdventureMsg.S2C_AutoAccept_7816.getDefaultInstance();
         }

         public S2C_AutoAccept_7816 build() {
            S2C_AutoAccept_7816 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AutoAccept_7816 buildPartial() {
            S2C_AutoAccept_7816 result = new S2C_AutoAccept_7816(this);
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
            if (other instanceof S2C_AutoAccept_7816) {
               return this.mergeFrom((S2C_AutoAccept_7816)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AutoAccept_7816 other) {
            if (other == AdventureMsg.S2C_AutoAccept_7816.getDefaultInstance()) {
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
            S2C_AutoAccept_7816 parsedMessage = null;

            try {
               parsedMessage = (S2C_AutoAccept_7816)AdventureMsg.S2C_AutoAccept_7816.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AutoAccept_7816)e.getUnfinishedMessage();
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

   public interface AdventureHeroOrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasId();

      int getId();

      boolean hasStar();

      int getStar();
   }

   public interface C2S_AccelerateTask_7807OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      String getCode();

      ByteString getCodeBytes();
   }

   public interface C2S_AcceptTask_7805OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      String getCode();

      ByteString getCodeBytes();

      List<Integer> getHeroCodeList();

      int getHeroCodeCount();

      int getHeroCode(int index);
   }

   public interface C2S_AutoAcceptQuality_7813OrBuilder extends MessageOrBuilder {
      List<Integer> getQualityList();

      int getQualityCount();

      int getQuality(int index);
   }

   public interface C2S_AutoAccept_7815OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_FlushTask_7803OrBuilder extends MessageOrBuilder {
      boolean hasIsMust();

      int getIsMust();
   }

   public interface C2S_OpenAdventureUi_7801OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TakeAllTask_7811OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TakeTask_7809OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      String getCode();

      ByteString getCodeBytes();
   }

   public interface S2C_AccelerateTaskResult_7808OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasInfo();

      TaskInfo getInfo();

      TaskInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_AcceptTaskResult_7806OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasInfo();

      TaskInfo getInfo();

      TaskInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_AutoAcceptQuality_7814OrBuilder extends MessageOrBuilder {
      List<Integer> getQualityList();

      int getQualityCount();

      int getQuality(int index);
   }

   public interface S2C_AutoAccept_7816OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface S2C_FlushTaskResult_7804OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_OpenAdventureUiResult_7802OrBuilder extends MessageOrBuilder {
      List<TaskInfo> getInfosList();

      TaskInfo getInfos(int index);

      int getInfosCount();

      List<? extends TaskInfoOrBuilder> getInfosOrBuilderList();

      TaskInfoOrBuilder getInfosOrBuilder(int index);

      boolean hasIsActivity();

      boolean getIsActivity();

      boolean hasUseFreeNum();

      int getUseFreeNum();

      List<Integer> getQualityList();

      int getQualityCount();

      int getQuality(int index);
   }

   public interface S2C_TakeAllTaskResult_7812OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      List<String> getCodesList();

      int getCodesCount();

      String getCodes(int index);

      ByteString getCodesBytes(int index);
   }

   public interface S2C_TakeTaskResult_7810OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasCode();

      String getCode();

      ByteString getCodeBytes();
   }

   public interface TaskInfoOrBuilder extends MessageOrBuilder {
      boolean hasCode();

      String getCode();

      ByteString getCodeBytes();

      boolean hasTaskId();

      int getTaskId();

      boolean hasState();

      int getState();

      boolean hasAcceptTime();

      long getAcceptTime();

      List<AdventureHero> getHeroInfosList();

      AdventureHero getHeroInfos(int index);

      int getHeroInfosCount();

      List<? extends AdventureHeroOrBuilder> getHeroInfosOrBuilderList();

      AdventureHeroOrBuilder getHeroInfosOrBuilder(int index);
   }
}
