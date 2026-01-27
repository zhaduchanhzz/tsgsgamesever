package com.gzbz.protobuf;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
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

public final class ArtifactMsg {
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_ArtifactInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_ArtifactInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_ArtifactProperty_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_ArtifactProperty_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_SoulInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_SoulInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_C2S_Main_7001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_C2S_Main_7001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_S2C_MainResult_7002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_S2C_MainResult_7002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_C2S_Strong_7005_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_C2S_Strong_7005_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_S2C_StrongResult_7006_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_S2C_StrongResult_7006_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_C2S_SkillUpgrade_7007_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_C2S_SkillUpgrade_7007_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_S2C_SkillUpgradeResult_7008_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_S2C_SkillUpgradeResult_7008_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_C2S_RefineUpgrade_7009_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_C2S_RefineUpgrade_7009_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_S2C_RefineUpgradeResult_7010_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_S2C_RefineUpgradeResult_7010_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_C2S_TakeTask_7011_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_C2S_TakeTask_7011_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_C2S_CastSoul_7013_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_C2S_CastSoul_7013_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_S2C_CastSoulResult_7014_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_S2C_CastSoulResult_7014_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_S2C_UpdateTask_7015_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_S2C_UpdateTask_7015_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_artifact_com_gzbz_protobuf_S2C_UnlockArtifact_7016_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_artifact_com_gzbz_protobuf_S2C_UnlockArtifact_7016_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ArtifactMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eArtifact.proto\u0012\u001aartifact.com.gzbz.protobuf\u001a\fcommon.proto\"G\n\fArtifactInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006unlock\u0018\u0002 \u0002(\u0005\u0012\u001b\n\u0005tasks\u0018\u0003 \u0003(\u000b2\f.common.Task\"æ\u0001\n\u0010ArtifactProperty\u0012\u0010\n\bstrongLv\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tstrongExp\u0018\u0002 \u0002(\u0005\u0012\u0010\n\brefineLv\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007skillLv\u0018\u0004 \u0002(\u0005\u0012)\n\u000blvPropertys\u0018\u0005 \u0003(\u000b2\u0014.common.PropertyInfo\u0012-\n\u000frefinepropertys\u0018\u0006 \u0003(\u000b2\u0014.common.PropertyInfo\u00120\n\u0012refinepropertysAdd\u0018\u0007 \u0003(\u000b2\u0014.common.PropertyInfo\"C\n\bSoulInfo\u0012\u000f\n\u0007soulNum\u0018\u0001 \u0002(\u0005\u0012&\n\bproperty\u0018\u0003 \u0003(\u000b2\u0014.common.PropertyInfo\"\u000f\n\rC2S_Main_7001\"Ö\u0001\n\u0013S2C_MainResult_7002\u0012?\n\rartifactInfos\u0018\u0001 \u0003(\u000b2(.artifact.com.gzbz.protobuf.ArtifactInfo\u00126\n\bsoulInfo\u0018\u0002 \u0002(\u000b2$.artifact.com.gzbz.protobuf.SoulInfo\u0012F\n\u0010artifactProperty\u0018\u0003 \u0002(\u000b2,.artifact.com.gzbz.protobuf.ArtifactProperty\"\u0011\n\u000fC2S_Strong_7005\"¹\u0001\n\u0015S2C_StrongResult_7006\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012>\n\bproperty\u0018\u0002 \u0002(\u000b2,.artifact.com.gzbz.protobuf.ArtifactProperty\u0012\f\n\u0004lvUp\u0018\u0003 \u0001(\u0005\u0012\u0013\n\u000bpowerChange\u0018\u0004 \u0002(\u0005\u0012-\n\u000fpropertyChanges\u0018\u0005 \u0003(\u000b2\u0014.common.PropertyInfo\"\u0017\n\u0015C2S_SkillUpgrade_7007\"m\n\u001bS2C_SkillUpgradeResult_7008\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012>\n\bproperty\u0018\u0002 \u0002(\u000b2,.artifact.com.gzbz.protobuf.ArtifactProperty\"\u0018\n\u0016C2S_RefineUpgrade_7009\"ò\u0001\n\u001cS2C_RefineUpgradeResult_7010\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012>\n\bproperty\u0018\u0002 \u0002(\u000b2,.artifact.com.gzbz.protobuf.ArtifactProperty\u0012\f\n\u0004lvUp\u0018\u0003 \u0001(\u0005\u0012\u0013\n\u000bpowerChange\u0018\u0004 \u0002(\u0005\u0012-\n\u000fpropertyChanges\u0018\u0005 \u0003(\u000b2\u0014.common.PropertyInfo\u00120\n\u0012propertyChangesAdd\u0018\u0006 \u0003(\u000b2\u0014.common.PropertyInfo\"B\n\u0011C2S_TakeTask_7011\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006taskId\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tguideStep\u0018\u0003 \u0001(\u0005\" \n\u0011C2S_CastSoul_7013\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\"¥\u0001\n\u0017S2C_CastSoulResult_7014\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u00126\n\bsoulInfo\u0018\u0002 \u0002(\u000b2$.artifact.com.gzbz.protobuf.SoulInfo\u0012\u0013\n\u000bpowerChange\u0018\u0003 \u0002(\u0005\u0012-\n\u000fpropertyChanges\u0018\u0004 \u0003(\u000b2\u0014.common.PropertyInfo\"2\n\u0013S2C_UpdateTask_7015\u0012\u001b\n\u0005tasks\u0018\u0001 \u0003(\u000b2\f.common.Task\"\u008c\u0001\n\u0017S2C_UnlockArtifact_7016\u00126\n\u0004info\u0018\u0001 \u0002(\u000b2(.artifact.com.gzbz.protobuf.ArtifactInfo\u0012\u000e\n\u0006nextId\u0018\u0002 \u0001(\u0005\u0012)\n\u000blvPropertys\u0018\u0003 \u0003(\u000b2\u0014.common.PropertyInfoB\"\n\u0011com.gzbz.protobufB\u000bArtifactMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_artifact_com_gzbz_protobuf_ArtifactInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_artifact_com_gzbz_protobuf_ArtifactInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_ArtifactInfo_descriptor, new String[]{"Id", "Unlock", "Tasks"});
      internal_static_artifact_com_gzbz_protobuf_ArtifactProperty_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_artifact_com_gzbz_protobuf_ArtifactProperty_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_ArtifactProperty_descriptor, new String[]{"StrongLv", "StrongExp", "RefineLv", "SkillLv", "LvPropertys", "Refinepropertys", "RefinepropertysAdd"});
      internal_static_artifact_com_gzbz_protobuf_SoulInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_artifact_com_gzbz_protobuf_SoulInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_SoulInfo_descriptor, new String[]{"SoulNum", "Property"});
      internal_static_artifact_com_gzbz_protobuf_C2S_Main_7001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_artifact_com_gzbz_protobuf_C2S_Main_7001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_C2S_Main_7001_descriptor, new String[0]);
      internal_static_artifact_com_gzbz_protobuf_S2C_MainResult_7002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_artifact_com_gzbz_protobuf_S2C_MainResult_7002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_S2C_MainResult_7002_descriptor, new String[]{"ArtifactInfos", "SoulInfo", "ArtifactProperty"});
      internal_static_artifact_com_gzbz_protobuf_C2S_Strong_7005_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_artifact_com_gzbz_protobuf_C2S_Strong_7005_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_C2S_Strong_7005_descriptor, new String[0]);
      internal_static_artifact_com_gzbz_protobuf_S2C_StrongResult_7006_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_artifact_com_gzbz_protobuf_S2C_StrongResult_7006_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_S2C_StrongResult_7006_descriptor, new String[]{"Result", "Property", "LvUp", "PowerChange", "PropertyChanges"});
      internal_static_artifact_com_gzbz_protobuf_C2S_SkillUpgrade_7007_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_artifact_com_gzbz_protobuf_C2S_SkillUpgrade_7007_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_C2S_SkillUpgrade_7007_descriptor, new String[0]);
      internal_static_artifact_com_gzbz_protobuf_S2C_SkillUpgradeResult_7008_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_artifact_com_gzbz_protobuf_S2C_SkillUpgradeResult_7008_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_S2C_SkillUpgradeResult_7008_descriptor, new String[]{"Result", "Property"});
      internal_static_artifact_com_gzbz_protobuf_C2S_RefineUpgrade_7009_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_artifact_com_gzbz_protobuf_C2S_RefineUpgrade_7009_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_C2S_RefineUpgrade_7009_descriptor, new String[0]);
      internal_static_artifact_com_gzbz_protobuf_S2C_RefineUpgradeResult_7010_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_artifact_com_gzbz_protobuf_S2C_RefineUpgradeResult_7010_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_S2C_RefineUpgradeResult_7010_descriptor, new String[]{"Result", "Property", "LvUp", "PowerChange", "PropertyChanges", "PropertyChangesAdd"});
      internal_static_artifact_com_gzbz_protobuf_C2S_TakeTask_7011_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_artifact_com_gzbz_protobuf_C2S_TakeTask_7011_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_C2S_TakeTask_7011_descriptor, new String[]{"Id", "TaskId", "GuideStep"});
      internal_static_artifact_com_gzbz_protobuf_C2S_CastSoul_7013_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_artifact_com_gzbz_protobuf_C2S_CastSoul_7013_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_C2S_CastSoul_7013_descriptor, new String[]{"Num"});
      internal_static_artifact_com_gzbz_protobuf_S2C_CastSoulResult_7014_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_artifact_com_gzbz_protobuf_S2C_CastSoulResult_7014_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_S2C_CastSoulResult_7014_descriptor, new String[]{"Result", "SoulInfo", "PowerChange", "PropertyChanges"});
      internal_static_artifact_com_gzbz_protobuf_S2C_UpdateTask_7015_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_artifact_com_gzbz_protobuf_S2C_UpdateTask_7015_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_S2C_UpdateTask_7015_descriptor, new String[]{"Tasks"});
      internal_static_artifact_com_gzbz_protobuf_S2C_UnlockArtifact_7016_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_artifact_com_gzbz_protobuf_S2C_UnlockArtifact_7016_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_artifact_com_gzbz_protobuf_S2C_UnlockArtifact_7016_descriptor, new String[]{"Info", "NextId", "LvPropertys"});
      CommonMsg.getDescriptor();
   }

   public static final class ArtifactInfo extends GeneratedMessageV3 implements ArtifactInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int UNLOCK_FIELD_NUMBER = 2;
      private int unlock_;
      public static final int TASKS_FIELD_NUMBER = 3;
      private List<CommonMsg.Task> tasks_;
      private byte memoizedIsInitialized;
      private static final ArtifactInfo DEFAULT_INSTANCE = new ArtifactInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<ArtifactInfo> PARSER = new AbstractParser<ArtifactInfo>() {
         public ArtifactInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ArtifactInfo(input, extensionRegistry);
         }
      };

      private ArtifactInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ArtifactInfo() {
         this.memoizedIsInitialized = -1;
         this.tasks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ArtifactInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ArtifactInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.unlock_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.tasks_ = new ArrayList();
                           mutable_bitField0_ |= 4;
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
               if ((mutable_bitField0_ & 4) != 0) {
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_ArtifactInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_ArtifactInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ArtifactInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasUnlock() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUnlock() {
         return this.unlock_;
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
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnlock()) {
            this.memoizedIsInitialized = 0;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.id_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.unlock_);
         }

         for(int i = 0; i < this.tasks_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.tasks_.get(i));
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.unlock_);
            }

            for(int i = 0; i < this.tasks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.tasks_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ArtifactInfo)) {
            return super.equals(obj);
         } else {
            ArtifactInfo other = (ArtifactInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasUnlock() != other.hasUnlock()) {
               return false;
            } else if (this.hasUnlock() && this.getUnlock() != other.getUnlock()) {
               return false;
            } else if (!this.getTasksList().equals(other.getTasksList())) {
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

            if (this.hasUnlock()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUnlock();
            }

            if (this.getTasksCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTasksList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ArtifactInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ArtifactInfo)PARSER.parseFrom(data);
      }

      public static ArtifactInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ArtifactInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ArtifactInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ArtifactInfo)PARSER.parseFrom(data);
      }

      public static ArtifactInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ArtifactInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ArtifactInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ArtifactInfo)PARSER.parseFrom(data);
      }

      public static ArtifactInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ArtifactInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ArtifactInfo parseFrom(InputStream input) throws IOException {
         return (ArtifactInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ArtifactInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ArtifactInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ArtifactInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (ArtifactInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ArtifactInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ArtifactInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ArtifactInfo parseFrom(CodedInputStream input) throws IOException {
         return (ArtifactInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ArtifactInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ArtifactInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ArtifactInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ArtifactInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ArtifactInfo> parser() {
         return PARSER;
      }

      public Parser<ArtifactInfo> getParserForType() {
         return PARSER;
      }

      public ArtifactInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ArtifactInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int unlock_;
         private List<CommonMsg.Task> tasks_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> tasksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_ArtifactInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_ArtifactInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ArtifactInfo.class, Builder.class);
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
            if (ArtifactMsg.ArtifactInfo.alwaysUseFieldBuilders) {
               this.getTasksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.unlock_ = 0;
            this.bitField0_ &= -3;
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_ArtifactInfo_descriptor;
         }

         public ArtifactInfo getDefaultInstanceForType() {
            return ArtifactMsg.ArtifactInfo.getDefaultInstance();
         }

         public ArtifactInfo build() {
            ArtifactInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ArtifactInfo buildPartial() {
            ArtifactInfo result = new ArtifactInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.unlock_ = this.unlock_;
               to_bitField0_ |= 2;
            }

            if (this.tasksBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
                  this.bitField0_ &= -5;
               }

               result.tasks_ = this.tasks_;
            } else {
               result.tasks_ = this.tasksBuilder_.build();
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
            if (other instanceof ArtifactInfo) {
               return this.mergeFrom((ArtifactInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ArtifactInfo other) {
            if (other == ArtifactMsg.ArtifactInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasUnlock()) {
                  this.setUnlock(other.getUnlock());
               }

               if (this.tasksBuilder_ == null) {
                  if (!other.tasks_.isEmpty()) {
                     if (this.tasks_.isEmpty()) {
                        this.tasks_ = other.tasks_;
                        this.bitField0_ &= -5;
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
                     this.bitField0_ &= -5;
                     this.tasksBuilder_ = ArtifactMsg.ArtifactInfo.alwaysUseFieldBuilders ? this.getTasksFieldBuilder() : null;
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
            if (!this.hasId()) {
               return false;
            } else if (!this.hasUnlock()) {
               return false;
            } else {
               for(int i = 0; i < this.getTasksCount(); ++i) {
                  if (!this.getTasks(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ArtifactInfo parsedMessage = null;

            try {
               parsedMessage = (ArtifactInfo)ArtifactMsg.ArtifactInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ArtifactInfo)e.getUnfinishedMessage();
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

         public boolean hasUnlock() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUnlock() {
            return this.unlock_;
         }

         public Builder setUnlock(int value) {
            this.bitField0_ |= 2;
            this.unlock_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnlock() {
            this.bitField0_ &= -3;
            this.unlock_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureTasksIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.tasks_ = new ArrayList(this.tasks_);
               this.bitField0_ |= 4;
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
               this.bitField0_ &= -5;
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
               this.tasksBuilder_ = new RepeatedFieldBuilderV3(this.tasks_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class ArtifactProperty extends GeneratedMessageV3 implements ArtifactPropertyOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STRONGLV_FIELD_NUMBER = 1;
      private int strongLv_;
      public static final int STRONGEXP_FIELD_NUMBER = 2;
      private int strongExp_;
      public static final int REFINELV_FIELD_NUMBER = 3;
      private int refineLv_;
      public static final int SKILLLV_FIELD_NUMBER = 4;
      private int skillLv_;
      public static final int LVPROPERTYS_FIELD_NUMBER = 5;
      private List<CommonMsg.PropertyInfo> lvPropertys_;
      public static final int REFINEPROPERTYS_FIELD_NUMBER = 6;
      private List<CommonMsg.PropertyInfo> refinepropertys_;
      public static final int REFINEPROPERTYSADD_FIELD_NUMBER = 7;
      private List<CommonMsg.PropertyInfo> refinepropertysAdd_;
      private byte memoizedIsInitialized;
      private static final ArtifactProperty DEFAULT_INSTANCE = new ArtifactProperty();
      /** @deprecated */
      @Deprecated
      public static final Parser<ArtifactProperty> PARSER = new AbstractParser<ArtifactProperty>() {
         public ArtifactProperty parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ArtifactProperty(input, extensionRegistry);
         }
      };

      private ArtifactProperty(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ArtifactProperty() {
         this.memoizedIsInitialized = -1;
         this.lvPropertys_ = Collections.emptyList();
         this.refinepropertys_ = Collections.emptyList();
         this.refinepropertysAdd_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ArtifactProperty();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ArtifactProperty(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.strongLv_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.strongExp_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.refineLv_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.skillLv_ = input.readInt32();
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.lvPropertys_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.lvPropertys_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
                        break;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.refinepropertys_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.refinepropertys_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
                        break;
                     case 58:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.refinepropertysAdd_ = new ArrayList();
                           mutable_bitField0_ |= 64;
                        }

                        this.refinepropertysAdd_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
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
                  this.lvPropertys_ = Collections.unmodifiableList(this.lvPropertys_);
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.refinepropertys_ = Collections.unmodifiableList(this.refinepropertys_);
               }

               if ((mutable_bitField0_ & 64) != 0) {
                  this.refinepropertysAdd_ = Collections.unmodifiableList(this.refinepropertysAdd_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_ArtifactProperty_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_ArtifactProperty_fieldAccessorTable.ensureFieldAccessorsInitialized(ArtifactProperty.class, Builder.class);
      }

      public boolean hasStrongLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStrongLv() {
         return this.strongLv_;
      }

      public boolean hasStrongExp() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStrongExp() {
         return this.strongExp_;
      }

      public boolean hasRefineLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRefineLv() {
         return this.refineLv_;
      }

      public boolean hasSkillLv() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSkillLv() {
         return this.skillLv_;
      }

      public List<CommonMsg.PropertyInfo> getLvPropertysList() {
         return this.lvPropertys_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getLvPropertysOrBuilderList() {
         return this.lvPropertys_;
      }

      public int getLvPropertysCount() {
         return this.lvPropertys_.size();
      }

      public CommonMsg.PropertyInfo getLvPropertys(int index) {
         return (CommonMsg.PropertyInfo)this.lvPropertys_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getLvPropertysOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.lvPropertys_.get(index);
      }

      public List<CommonMsg.PropertyInfo> getRefinepropertysList() {
         return this.refinepropertys_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getRefinepropertysOrBuilderList() {
         return this.refinepropertys_;
      }

      public int getRefinepropertysCount() {
         return this.refinepropertys_.size();
      }

      public CommonMsg.PropertyInfo getRefinepropertys(int index) {
         return (CommonMsg.PropertyInfo)this.refinepropertys_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getRefinepropertysOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.refinepropertys_.get(index);
      }

      public List<CommonMsg.PropertyInfo> getRefinepropertysAddList() {
         return this.refinepropertysAdd_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getRefinepropertysAddOrBuilderList() {
         return this.refinepropertysAdd_;
      }

      public int getRefinepropertysAddCount() {
         return this.refinepropertysAdd_.size();
      }

      public CommonMsg.PropertyInfo getRefinepropertysAdd(int index) {
         return (CommonMsg.PropertyInfo)this.refinepropertysAdd_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getRefinepropertysAddOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.refinepropertysAdd_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStrongLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStrongExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRefineLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSkillLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getLvPropertysCount(); ++i) {
               if (!this.getLvPropertys(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getRefinepropertysCount(); ++i) {
               if (!this.getRefinepropertys(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getRefinepropertysAddCount(); ++i) {
               if (!this.getRefinepropertysAdd(i).isInitialized()) {
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
            output.writeInt32(1, this.strongLv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.strongExp_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.refineLv_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.skillLv_);
         }

         for(int i = 0; i < this.lvPropertys_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.lvPropertys_.get(i));
         }

         for(int i = 0; i < this.refinepropertys_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.refinepropertys_.get(i));
         }

         for(int i = 0; i < this.refinepropertysAdd_.size(); ++i) {
            output.writeMessage(7, (MessageLite)this.refinepropertysAdd_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.strongLv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.strongExp_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.refineLv_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.skillLv_);
            }

            for(int i = 0; i < this.lvPropertys_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.lvPropertys_.get(i));
            }

            for(int i = 0; i < this.refinepropertys_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.refinepropertys_.get(i));
            }

            for(int i = 0; i < this.refinepropertysAdd_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(7, (MessageLite)this.refinepropertysAdd_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ArtifactProperty)) {
            return super.equals(obj);
         } else {
            ArtifactProperty other = (ArtifactProperty)obj;
            if (this.hasStrongLv() != other.hasStrongLv()) {
               return false;
            } else if (this.hasStrongLv() && this.getStrongLv() != other.getStrongLv()) {
               return false;
            } else if (this.hasStrongExp() != other.hasStrongExp()) {
               return false;
            } else if (this.hasStrongExp() && this.getStrongExp() != other.getStrongExp()) {
               return false;
            } else if (this.hasRefineLv() != other.hasRefineLv()) {
               return false;
            } else if (this.hasRefineLv() && this.getRefineLv() != other.getRefineLv()) {
               return false;
            } else if (this.hasSkillLv() != other.hasSkillLv()) {
               return false;
            } else if (this.hasSkillLv() && this.getSkillLv() != other.getSkillLv()) {
               return false;
            } else if (!this.getLvPropertysList().equals(other.getLvPropertysList())) {
               return false;
            } else if (!this.getRefinepropertysList().equals(other.getRefinepropertysList())) {
               return false;
            } else if (!this.getRefinepropertysAddList().equals(other.getRefinepropertysAddList())) {
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
            if (this.hasStrongLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStrongLv();
            }

            if (this.hasStrongExp()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStrongExp();
            }

            if (this.hasRefineLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRefineLv();
            }

            if (this.hasSkillLv()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSkillLv();
            }

            if (this.getLvPropertysCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getLvPropertysList().hashCode();
            }

            if (this.getRefinepropertysCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getRefinepropertysList().hashCode();
            }

            if (this.getRefinepropertysAddCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getRefinepropertysAddList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ArtifactProperty parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ArtifactProperty)PARSER.parseFrom(data);
      }

      public static ArtifactProperty parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ArtifactProperty)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ArtifactProperty parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ArtifactProperty)PARSER.parseFrom(data);
      }

      public static ArtifactProperty parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ArtifactProperty)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ArtifactProperty parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ArtifactProperty)PARSER.parseFrom(data);
      }

      public static ArtifactProperty parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ArtifactProperty)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ArtifactProperty parseFrom(InputStream input) throws IOException {
         return (ArtifactProperty)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ArtifactProperty parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ArtifactProperty)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ArtifactProperty parseDelimitedFrom(InputStream input) throws IOException {
         return (ArtifactProperty)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ArtifactProperty parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ArtifactProperty)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ArtifactProperty parseFrom(CodedInputStream input) throws IOException {
         return (ArtifactProperty)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ArtifactProperty parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ArtifactProperty)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ArtifactProperty prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ArtifactProperty getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ArtifactProperty> parser() {
         return PARSER;
      }

      public Parser<ArtifactProperty> getParserForType() {
         return PARSER;
      }

      public ArtifactProperty getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ArtifactPropertyOrBuilder {
         private int bitField0_;
         private int strongLv_;
         private int strongExp_;
         private int refineLv_;
         private int skillLv_;
         private List<CommonMsg.PropertyInfo> lvPropertys_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> lvPropertysBuilder_;
         private List<CommonMsg.PropertyInfo> refinepropertys_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> refinepropertysBuilder_;
         private List<CommonMsg.PropertyInfo> refinepropertysAdd_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> refinepropertysAddBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_ArtifactProperty_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_ArtifactProperty_fieldAccessorTable.ensureFieldAccessorsInitialized(ArtifactProperty.class, Builder.class);
         }

         private Builder() {
            this.lvPropertys_ = Collections.emptyList();
            this.refinepropertys_ = Collections.emptyList();
            this.refinepropertysAdd_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.lvPropertys_ = Collections.emptyList();
            this.refinepropertys_ = Collections.emptyList();
            this.refinepropertysAdd_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactMsg.ArtifactProperty.alwaysUseFieldBuilders) {
               this.getLvPropertysFieldBuilder();
               this.getRefinepropertysFieldBuilder();
               this.getRefinepropertysAddFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.strongLv_ = 0;
            this.bitField0_ &= -2;
            this.strongExp_ = 0;
            this.bitField0_ &= -3;
            this.refineLv_ = 0;
            this.bitField0_ &= -5;
            this.skillLv_ = 0;
            this.bitField0_ &= -9;
            if (this.lvPropertysBuilder_ == null) {
               this.lvPropertys_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.lvPropertysBuilder_.clear();
            }

            if (this.refinepropertysBuilder_ == null) {
               this.refinepropertys_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.refinepropertysBuilder_.clear();
            }

            if (this.refinepropertysAddBuilder_ == null) {
               this.refinepropertysAdd_ = Collections.emptyList();
               this.bitField0_ &= -65;
            } else {
               this.refinepropertysAddBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_ArtifactProperty_descriptor;
         }

         public ArtifactProperty getDefaultInstanceForType() {
            return ArtifactMsg.ArtifactProperty.getDefaultInstance();
         }

         public ArtifactProperty build() {
            ArtifactProperty result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ArtifactProperty buildPartial() {
            ArtifactProperty result = new ArtifactProperty(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.strongLv_ = this.strongLv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.strongExp_ = this.strongExp_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.refineLv_ = this.refineLv_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.skillLv_ = this.skillLv_;
               to_bitField0_ |= 8;
            }

            if (this.lvPropertysBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.lvPropertys_ = Collections.unmodifiableList(this.lvPropertys_);
                  this.bitField0_ &= -17;
               }

               result.lvPropertys_ = this.lvPropertys_;
            } else {
               result.lvPropertys_ = this.lvPropertysBuilder_.build();
            }

            if (this.refinepropertysBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.refinepropertys_ = Collections.unmodifiableList(this.refinepropertys_);
                  this.bitField0_ &= -33;
               }

               result.refinepropertys_ = this.refinepropertys_;
            } else {
               result.refinepropertys_ = this.refinepropertysBuilder_.build();
            }

            if (this.refinepropertysAddBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0) {
                  this.refinepropertysAdd_ = Collections.unmodifiableList(this.refinepropertysAdd_);
                  this.bitField0_ &= -65;
               }

               result.refinepropertysAdd_ = this.refinepropertysAdd_;
            } else {
               result.refinepropertysAdd_ = this.refinepropertysAddBuilder_.build();
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
            if (other instanceof ArtifactProperty) {
               return this.mergeFrom((ArtifactProperty)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ArtifactProperty other) {
            if (other == ArtifactMsg.ArtifactProperty.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStrongLv()) {
                  this.setStrongLv(other.getStrongLv());
               }

               if (other.hasStrongExp()) {
                  this.setStrongExp(other.getStrongExp());
               }

               if (other.hasRefineLv()) {
                  this.setRefineLv(other.getRefineLv());
               }

               if (other.hasSkillLv()) {
                  this.setSkillLv(other.getSkillLv());
               }

               if (this.lvPropertysBuilder_ == null) {
                  if (!other.lvPropertys_.isEmpty()) {
                     if (this.lvPropertys_.isEmpty()) {
                        this.lvPropertys_ = other.lvPropertys_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureLvPropertysIsMutable();
                        this.lvPropertys_.addAll(other.lvPropertys_);
                     }

                     this.onChanged();
                  }
               } else if (!other.lvPropertys_.isEmpty()) {
                  if (this.lvPropertysBuilder_.isEmpty()) {
                     this.lvPropertysBuilder_.dispose();
                     this.lvPropertysBuilder_ = null;
                     this.lvPropertys_ = other.lvPropertys_;
                     this.bitField0_ &= -17;
                     this.lvPropertysBuilder_ = ArtifactMsg.ArtifactProperty.alwaysUseFieldBuilders ? this.getLvPropertysFieldBuilder() : null;
                  } else {
                     this.lvPropertysBuilder_.addAllMessages(other.lvPropertys_);
                  }
               }

               if (this.refinepropertysBuilder_ == null) {
                  if (!other.refinepropertys_.isEmpty()) {
                     if (this.refinepropertys_.isEmpty()) {
                        this.refinepropertys_ = other.refinepropertys_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensureRefinepropertysIsMutable();
                        this.refinepropertys_.addAll(other.refinepropertys_);
                     }

                     this.onChanged();
                  }
               } else if (!other.refinepropertys_.isEmpty()) {
                  if (this.refinepropertysBuilder_.isEmpty()) {
                     this.refinepropertysBuilder_.dispose();
                     this.refinepropertysBuilder_ = null;
                     this.refinepropertys_ = other.refinepropertys_;
                     this.bitField0_ &= -33;
                     this.refinepropertysBuilder_ = ArtifactMsg.ArtifactProperty.alwaysUseFieldBuilders ? this.getRefinepropertysFieldBuilder() : null;
                  } else {
                     this.refinepropertysBuilder_.addAllMessages(other.refinepropertys_);
                  }
               }

               if (this.refinepropertysAddBuilder_ == null) {
                  if (!other.refinepropertysAdd_.isEmpty()) {
                     if (this.refinepropertysAdd_.isEmpty()) {
                        this.refinepropertysAdd_ = other.refinepropertysAdd_;
                        this.bitField0_ &= -65;
                     } else {
                        this.ensureRefinepropertysAddIsMutable();
                        this.refinepropertysAdd_.addAll(other.refinepropertysAdd_);
                     }

                     this.onChanged();
                  }
               } else if (!other.refinepropertysAdd_.isEmpty()) {
                  if (this.refinepropertysAddBuilder_.isEmpty()) {
                     this.refinepropertysAddBuilder_.dispose();
                     this.refinepropertysAddBuilder_ = null;
                     this.refinepropertysAdd_ = other.refinepropertysAdd_;
                     this.bitField0_ &= -65;
                     this.refinepropertysAddBuilder_ = ArtifactMsg.ArtifactProperty.alwaysUseFieldBuilders ? this.getRefinepropertysAddFieldBuilder() : null;
                  } else {
                     this.refinepropertysAddBuilder_.addAllMessages(other.refinepropertysAdd_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStrongLv()) {
               return false;
            } else if (!this.hasStrongExp()) {
               return false;
            } else if (!this.hasRefineLv()) {
               return false;
            } else if (!this.hasSkillLv()) {
               return false;
            } else {
               for(int i = 0; i < this.getLvPropertysCount(); ++i) {
                  if (!this.getLvPropertys(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getRefinepropertysCount(); ++i) {
                  if (!this.getRefinepropertys(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getRefinepropertysAddCount(); ++i) {
                  if (!this.getRefinepropertysAdd(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ArtifactProperty parsedMessage = null;

            try {
               parsedMessage = (ArtifactProperty)ArtifactMsg.ArtifactProperty.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ArtifactProperty)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStrongLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStrongLv() {
            return this.strongLv_;
         }

         public Builder setStrongLv(int value) {
            this.bitField0_ |= 1;
            this.strongLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStrongLv() {
            this.bitField0_ &= -2;
            this.strongLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStrongExp() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStrongExp() {
            return this.strongExp_;
         }

         public Builder setStrongExp(int value) {
            this.bitField0_ |= 2;
            this.strongExp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStrongExp() {
            this.bitField0_ &= -3;
            this.strongExp_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRefineLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRefineLv() {
            return this.refineLv_;
         }

         public Builder setRefineLv(int value) {
            this.bitField0_ |= 4;
            this.refineLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRefineLv() {
            this.bitField0_ &= -5;
            this.refineLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSkillLv() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSkillLv() {
            return this.skillLv_;
         }

         public Builder setSkillLv(int value) {
            this.bitField0_ |= 8;
            this.skillLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillLv() {
            this.bitField0_ &= -9;
            this.skillLv_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureLvPropertysIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.lvPropertys_ = new ArrayList(this.lvPropertys_);
               this.bitField0_ |= 16;
            }

         }

         public List<CommonMsg.PropertyInfo> getLvPropertysList() {
            return this.lvPropertysBuilder_ == null ? Collections.unmodifiableList(this.lvPropertys_) : this.lvPropertysBuilder_.getMessageList();
         }

         public int getLvPropertysCount() {
            return this.lvPropertysBuilder_ == null ? this.lvPropertys_.size() : this.lvPropertysBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getLvPropertys(int index) {
            return this.lvPropertysBuilder_ == null ? (CommonMsg.PropertyInfo)this.lvPropertys_.get(index) : (CommonMsg.PropertyInfo)this.lvPropertysBuilder_.getMessage(index);
         }

         public Builder setLvPropertys(int index, CommonMsg.PropertyInfo value) {
            if (this.lvPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLvPropertysIsMutable();
               this.lvPropertys_.set(index, value);
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setLvPropertys(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.lvPropertysBuilder_ == null) {
               this.ensureLvPropertysIsMutable();
               this.lvPropertys_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addLvPropertys(CommonMsg.PropertyInfo value) {
            if (this.lvPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLvPropertysIsMutable();
               this.lvPropertys_.add(value);
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addLvPropertys(int index, CommonMsg.PropertyInfo value) {
            if (this.lvPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLvPropertysIsMutable();
               this.lvPropertys_.add(index, value);
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addLvPropertys(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.lvPropertysBuilder_ == null) {
               this.ensureLvPropertysIsMutable();
               this.lvPropertys_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addLvPropertys(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.lvPropertysBuilder_ == null) {
               this.ensureLvPropertysIsMutable();
               this.lvPropertys_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllLvPropertys(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.lvPropertysBuilder_ == null) {
               this.ensureLvPropertysIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.lvPropertys_);
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearLvPropertys() {
            if (this.lvPropertysBuilder_ == null) {
               this.lvPropertys_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.clear();
            }

            return this;
         }

         public Builder removeLvPropertys(int index) {
            if (this.lvPropertysBuilder_ == null) {
               this.ensureLvPropertysIsMutable();
               this.lvPropertys_.remove(index);
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getLvPropertysBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getLvPropertysFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getLvPropertysOrBuilder(int index) {
            return this.lvPropertysBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.lvPropertys_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.lvPropertysBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getLvPropertysOrBuilderList() {
            return this.lvPropertysBuilder_ != null ? this.lvPropertysBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.lvPropertys_);
         }

         public CommonMsg.PropertyInfo.Builder addLvPropertysBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getLvPropertysFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addLvPropertysBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getLvPropertysFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getLvPropertysBuilderList() {
            return this.getLvPropertysFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getLvPropertysFieldBuilder() {
            if (this.lvPropertysBuilder_ == null) {
               this.lvPropertysBuilder_ = new RepeatedFieldBuilderV3(this.lvPropertys_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.lvPropertys_ = null;
            }

            return this.lvPropertysBuilder_;
         }

         private void ensureRefinepropertysIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.refinepropertys_ = new ArrayList(this.refinepropertys_);
               this.bitField0_ |= 32;
            }

         }

         public List<CommonMsg.PropertyInfo> getRefinepropertysList() {
            return this.refinepropertysBuilder_ == null ? Collections.unmodifiableList(this.refinepropertys_) : this.refinepropertysBuilder_.getMessageList();
         }

         public int getRefinepropertysCount() {
            return this.refinepropertysBuilder_ == null ? this.refinepropertys_.size() : this.refinepropertysBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getRefinepropertys(int index) {
            return this.refinepropertysBuilder_ == null ? (CommonMsg.PropertyInfo)this.refinepropertys_.get(index) : (CommonMsg.PropertyInfo)this.refinepropertysBuilder_.getMessage(index);
         }

         public Builder setRefinepropertys(int index, CommonMsg.PropertyInfo value) {
            if (this.refinepropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRefinepropertysIsMutable();
               this.refinepropertys_.set(index, value);
               this.onChanged();
            } else {
               this.refinepropertysBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRefinepropertys(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.refinepropertysBuilder_ == null) {
               this.ensureRefinepropertysIsMutable();
               this.refinepropertys_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.refinepropertysBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRefinepropertys(CommonMsg.PropertyInfo value) {
            if (this.refinepropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRefinepropertysIsMutable();
               this.refinepropertys_.add(value);
               this.onChanged();
            } else {
               this.refinepropertysBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRefinepropertys(int index, CommonMsg.PropertyInfo value) {
            if (this.refinepropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRefinepropertysIsMutable();
               this.refinepropertys_.add(index, value);
               this.onChanged();
            } else {
               this.refinepropertysBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRefinepropertys(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.refinepropertysBuilder_ == null) {
               this.ensureRefinepropertysIsMutable();
               this.refinepropertys_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.refinepropertysBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRefinepropertys(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.refinepropertysBuilder_ == null) {
               this.ensureRefinepropertysIsMutable();
               this.refinepropertys_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.refinepropertysBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRefinepropertys(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.refinepropertysBuilder_ == null) {
               this.ensureRefinepropertysIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.refinepropertys_);
               this.onChanged();
            } else {
               this.refinepropertysBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRefinepropertys() {
            if (this.refinepropertysBuilder_ == null) {
               this.refinepropertys_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.refinepropertysBuilder_.clear();
            }

            return this;
         }

         public Builder removeRefinepropertys(int index) {
            if (this.refinepropertysBuilder_ == null) {
               this.ensureRefinepropertysIsMutable();
               this.refinepropertys_.remove(index);
               this.onChanged();
            } else {
               this.refinepropertysBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getRefinepropertysBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getRefinepropertysFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getRefinepropertysOrBuilder(int index) {
            return this.refinepropertysBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.refinepropertys_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.refinepropertysBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getRefinepropertysOrBuilderList() {
            return this.refinepropertysBuilder_ != null ? this.refinepropertysBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.refinepropertys_);
         }

         public CommonMsg.PropertyInfo.Builder addRefinepropertysBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getRefinepropertysFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addRefinepropertysBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getRefinepropertysFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getRefinepropertysBuilderList() {
            return this.getRefinepropertysFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getRefinepropertysFieldBuilder() {
            if (this.refinepropertysBuilder_ == null) {
               this.refinepropertysBuilder_ = new RepeatedFieldBuilderV3(this.refinepropertys_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.refinepropertys_ = null;
            }

            return this.refinepropertysBuilder_;
         }

         private void ensureRefinepropertysAddIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.refinepropertysAdd_ = new ArrayList(this.refinepropertysAdd_);
               this.bitField0_ |= 64;
            }

         }

         public List<CommonMsg.PropertyInfo> getRefinepropertysAddList() {
            return this.refinepropertysAddBuilder_ == null ? Collections.unmodifiableList(this.refinepropertysAdd_) : this.refinepropertysAddBuilder_.getMessageList();
         }

         public int getRefinepropertysAddCount() {
            return this.refinepropertysAddBuilder_ == null ? this.refinepropertysAdd_.size() : this.refinepropertysAddBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getRefinepropertysAdd(int index) {
            return this.refinepropertysAddBuilder_ == null ? (CommonMsg.PropertyInfo)this.refinepropertysAdd_.get(index) : (CommonMsg.PropertyInfo)this.refinepropertysAddBuilder_.getMessage(index);
         }

         public Builder setRefinepropertysAdd(int index, CommonMsg.PropertyInfo value) {
            if (this.refinepropertysAddBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRefinepropertysAddIsMutable();
               this.refinepropertysAdd_.set(index, value);
               this.onChanged();
            } else {
               this.refinepropertysAddBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRefinepropertysAdd(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.refinepropertysAddBuilder_ == null) {
               this.ensureRefinepropertysAddIsMutable();
               this.refinepropertysAdd_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.refinepropertysAddBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRefinepropertysAdd(CommonMsg.PropertyInfo value) {
            if (this.refinepropertysAddBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRefinepropertysAddIsMutable();
               this.refinepropertysAdd_.add(value);
               this.onChanged();
            } else {
               this.refinepropertysAddBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRefinepropertysAdd(int index, CommonMsg.PropertyInfo value) {
            if (this.refinepropertysAddBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRefinepropertysAddIsMutable();
               this.refinepropertysAdd_.add(index, value);
               this.onChanged();
            } else {
               this.refinepropertysAddBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRefinepropertysAdd(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.refinepropertysAddBuilder_ == null) {
               this.ensureRefinepropertysAddIsMutable();
               this.refinepropertysAdd_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.refinepropertysAddBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRefinepropertysAdd(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.refinepropertysAddBuilder_ == null) {
               this.ensureRefinepropertysAddIsMutable();
               this.refinepropertysAdd_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.refinepropertysAddBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRefinepropertysAdd(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.refinepropertysAddBuilder_ == null) {
               this.ensureRefinepropertysAddIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.refinepropertysAdd_);
               this.onChanged();
            } else {
               this.refinepropertysAddBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRefinepropertysAdd() {
            if (this.refinepropertysAddBuilder_ == null) {
               this.refinepropertysAdd_ = Collections.emptyList();
               this.bitField0_ &= -65;
               this.onChanged();
            } else {
               this.refinepropertysAddBuilder_.clear();
            }

            return this;
         }

         public Builder removeRefinepropertysAdd(int index) {
            if (this.refinepropertysAddBuilder_ == null) {
               this.ensureRefinepropertysAddIsMutable();
               this.refinepropertysAdd_.remove(index);
               this.onChanged();
            } else {
               this.refinepropertysAddBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getRefinepropertysAddBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getRefinepropertysAddFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getRefinepropertysAddOrBuilder(int index) {
            return this.refinepropertysAddBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.refinepropertysAdd_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.refinepropertysAddBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getRefinepropertysAddOrBuilderList() {
            return this.refinepropertysAddBuilder_ != null ? this.refinepropertysAddBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.refinepropertysAdd_);
         }

         public CommonMsg.PropertyInfo.Builder addRefinepropertysAddBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getRefinepropertysAddFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addRefinepropertysAddBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getRefinepropertysAddFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getRefinepropertysAddBuilderList() {
            return this.getRefinepropertysAddFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getRefinepropertysAddFieldBuilder() {
            if (this.refinepropertysAddBuilder_ == null) {
               this.refinepropertysAddBuilder_ = new RepeatedFieldBuilderV3(this.refinepropertysAdd_, (this.bitField0_ & 64) != 0, this.getParentForChildren(), this.isClean());
               this.refinepropertysAdd_ = null;
            }

            return this.refinepropertysAddBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class SoulInfo extends GeneratedMessageV3 implements SoulInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SOULNUM_FIELD_NUMBER = 1;
      private int soulNum_;
      public static final int PROPERTY_FIELD_NUMBER = 3;
      private List<CommonMsg.PropertyInfo> property_;
      private byte memoizedIsInitialized;
      private static final SoulInfo DEFAULT_INSTANCE = new SoulInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<SoulInfo> PARSER = new AbstractParser<SoulInfo>() {
         public SoulInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new SoulInfo(input, extensionRegistry);
         }
      };

      private SoulInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private SoulInfo() {
         this.memoizedIsInitialized = -1;
         this.property_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new SoulInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private SoulInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.soulNum_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.property_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.property_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
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
                  this.property_ = Collections.unmodifiableList(this.property_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_SoulInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_SoulInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SoulInfo.class, Builder.class);
      }

      public boolean hasSoulNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSoulNum() {
         return this.soulNum_;
      }

      public List<CommonMsg.PropertyInfo> getPropertyList() {
         return this.property_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyOrBuilderList() {
         return this.property_;
      }

      public int getPropertyCount() {
         return this.property_.size();
      }

      public CommonMsg.PropertyInfo getProperty(int index) {
         return (CommonMsg.PropertyInfo)this.property_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getPropertyOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.property_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSoulNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPropertyCount(); ++i) {
               if (!this.getProperty(i).isInitialized()) {
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
            output.writeInt32(1, this.soulNum_);
         }

         for(int i = 0; i < this.property_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.property_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.soulNum_);
            }

            for(int i = 0; i < this.property_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.property_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof SoulInfo)) {
            return super.equals(obj);
         } else {
            SoulInfo other = (SoulInfo)obj;
            if (this.hasSoulNum() != other.hasSoulNum()) {
               return false;
            } else if (this.hasSoulNum() && this.getSoulNum() != other.getSoulNum()) {
               return false;
            } else if (!this.getPropertyList().equals(other.getPropertyList())) {
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
            if (this.hasSoulNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSoulNum();
            }

            if (this.getPropertyCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPropertyList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static SoulInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (SoulInfo)PARSER.parseFrom(data);
      }

      public static SoulInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SoulInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SoulInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (SoulInfo)PARSER.parseFrom(data);
      }

      public static SoulInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SoulInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SoulInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (SoulInfo)PARSER.parseFrom(data);
      }

      public static SoulInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SoulInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SoulInfo parseFrom(InputStream input) throws IOException {
         return (SoulInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SoulInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SoulInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static SoulInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (SoulInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static SoulInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SoulInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static SoulInfo parseFrom(CodedInputStream input) throws IOException {
         return (SoulInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SoulInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SoulInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(SoulInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static SoulInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<SoulInfo> parser() {
         return PARSER;
      }

      public Parser<SoulInfo> getParserForType() {
         return PARSER;
      }

      public SoulInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SoulInfoOrBuilder {
         private int bitField0_;
         private int soulNum_;
         private List<CommonMsg.PropertyInfo> property_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> propertyBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_SoulInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_SoulInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SoulInfo.class, Builder.class);
         }

         private Builder() {
            this.property_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.property_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactMsg.SoulInfo.alwaysUseFieldBuilders) {
               this.getPropertyFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.soulNum_ = 0;
            this.bitField0_ &= -2;
            if (this.propertyBuilder_ == null) {
               this.property_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.propertyBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_SoulInfo_descriptor;
         }

         public SoulInfo getDefaultInstanceForType() {
            return ArtifactMsg.SoulInfo.getDefaultInstance();
         }

         public SoulInfo build() {
            SoulInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public SoulInfo buildPartial() {
            SoulInfo result = new SoulInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.soulNum_ = this.soulNum_;
               to_bitField0_ |= 1;
            }

            if (this.propertyBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.property_ = Collections.unmodifiableList(this.property_);
                  this.bitField0_ &= -3;
               }

               result.property_ = this.property_;
            } else {
               result.property_ = this.propertyBuilder_.build();
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
            if (other instanceof SoulInfo) {
               return this.mergeFrom((SoulInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(SoulInfo other) {
            if (other == ArtifactMsg.SoulInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSoulNum()) {
                  this.setSoulNum(other.getSoulNum());
               }

               if (this.propertyBuilder_ == null) {
                  if (!other.property_.isEmpty()) {
                     if (this.property_.isEmpty()) {
                        this.property_ = other.property_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensurePropertyIsMutable();
                        this.property_.addAll(other.property_);
                     }

                     this.onChanged();
                  }
               } else if (!other.property_.isEmpty()) {
                  if (this.propertyBuilder_.isEmpty()) {
                     this.propertyBuilder_.dispose();
                     this.propertyBuilder_ = null;
                     this.property_ = other.property_;
                     this.bitField0_ &= -3;
                     this.propertyBuilder_ = ArtifactMsg.SoulInfo.alwaysUseFieldBuilders ? this.getPropertyFieldBuilder() : null;
                  } else {
                     this.propertyBuilder_.addAllMessages(other.property_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSoulNum()) {
               return false;
            } else {
               for(int i = 0; i < this.getPropertyCount(); ++i) {
                  if (!this.getProperty(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            SoulInfo parsedMessage = null;

            try {
               parsedMessage = (SoulInfo)ArtifactMsg.SoulInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (SoulInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSoulNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSoulNum() {
            return this.soulNum_;
         }

         public Builder setSoulNum(int value) {
            this.bitField0_ |= 1;
            this.soulNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSoulNum() {
            this.bitField0_ &= -2;
            this.soulNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePropertyIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.property_ = new ArrayList(this.property_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.PropertyInfo> getPropertyList() {
            return this.propertyBuilder_ == null ? Collections.unmodifiableList(this.property_) : this.propertyBuilder_.getMessageList();
         }

         public int getPropertyCount() {
            return this.propertyBuilder_ == null ? this.property_.size() : this.propertyBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getProperty(int index) {
            return this.propertyBuilder_ == null ? (CommonMsg.PropertyInfo)this.property_.get(index) : (CommonMsg.PropertyInfo)this.propertyBuilder_.getMessage(index);
         }

         public Builder setProperty(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyIsMutable();
               this.property_.set(index, value);
               this.onChanged();
            } else {
               this.propertyBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setProperty(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyBuilder_ == null) {
               this.ensurePropertyIsMutable();
               this.property_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addProperty(CommonMsg.PropertyInfo value) {
            if (this.propertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyIsMutable();
               this.property_.add(value);
               this.onChanged();
            } else {
               this.propertyBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addProperty(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyIsMutable();
               this.property_.add(index, value);
               this.onChanged();
            } else {
               this.propertyBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addProperty(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyBuilder_ == null) {
               this.ensurePropertyIsMutable();
               this.property_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.propertyBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addProperty(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyBuilder_ == null) {
               this.ensurePropertyIsMutable();
               this.property_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllProperty(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.propertyBuilder_ == null) {
               this.ensurePropertyIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.property_);
               this.onChanged();
            } else {
               this.propertyBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearProperty() {
            if (this.propertyBuilder_ == null) {
               this.property_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.propertyBuilder_.clear();
            }

            return this;
         }

         public Builder removeProperty(int index) {
            if (this.propertyBuilder_ == null) {
               this.ensurePropertyIsMutable();
               this.property_.remove(index);
               this.onChanged();
            } else {
               this.propertyBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getPropertyBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getPropertyOrBuilder(int index) {
            return this.propertyBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.property_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.propertyBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyOrBuilderList() {
            return this.propertyBuilder_ != null ? this.propertyBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.property_);
         }

         public CommonMsg.PropertyInfo.Builder addPropertyBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addPropertyBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getPropertyBuilderList() {
            return this.getPropertyFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getPropertyFieldBuilder() {
            if (this.propertyBuilder_ == null) {
               this.propertyBuilder_ = new RepeatedFieldBuilderV3(this.property_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.property_ = null;
            }

            return this.propertyBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Main_7001 extends GeneratedMessageV3 implements C2S_Main_7001OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Main_7001 DEFAULT_INSTANCE = new C2S_Main_7001();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Main_7001> PARSER = new AbstractParser<C2S_Main_7001>() {
         public C2S_Main_7001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Main_7001(input, extensionRegistry);
         }
      };

      private C2S_Main_7001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Main_7001() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Main_7001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Main_7001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_Main_7001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_Main_7001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_7001.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Main_7001)) {
            return super.equals(obj);
         } else {
            C2S_Main_7001 other = (C2S_Main_7001)obj;
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

      public static C2S_Main_7001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Main_7001)PARSER.parseFrom(data);
      }

      public static C2S_Main_7001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_7001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_7001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Main_7001)PARSER.parseFrom(data);
      }

      public static C2S_Main_7001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_7001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_7001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Main_7001)PARSER.parseFrom(data);
      }

      public static C2S_Main_7001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_7001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_7001 parseFrom(InputStream input) throws IOException {
         return (C2S_Main_7001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_7001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_7001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_7001 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Main_7001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Main_7001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_7001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_7001 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Main_7001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_7001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_7001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Main_7001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Main_7001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Main_7001> parser() {
         return PARSER;
      }

      public Parser<C2S_Main_7001> getParserForType() {
         return PARSER;
      }

      public C2S_Main_7001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Main_7001OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_Main_7001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_Main_7001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_7001.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactMsg.C2S_Main_7001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_Main_7001_descriptor;
         }

         public C2S_Main_7001 getDefaultInstanceForType() {
            return ArtifactMsg.C2S_Main_7001.getDefaultInstance();
         }

         public C2S_Main_7001 build() {
            C2S_Main_7001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Main_7001 buildPartial() {
            C2S_Main_7001 result = new C2S_Main_7001(this);
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
            if (other instanceof C2S_Main_7001) {
               return this.mergeFrom((C2S_Main_7001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Main_7001 other) {
            if (other == ArtifactMsg.C2S_Main_7001.getDefaultInstance()) {
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
            C2S_Main_7001 parsedMessage = null;

            try {
               parsedMessage = (C2S_Main_7001)ArtifactMsg.C2S_Main_7001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Main_7001)e.getUnfinishedMessage();
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

   public static final class S2C_MainResult_7002 extends GeneratedMessageV3 implements S2C_MainResult_7002OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARTIFACTINFOS_FIELD_NUMBER = 1;
      private List<ArtifactInfo> artifactInfos_;
      public static final int SOULINFO_FIELD_NUMBER = 2;
      private SoulInfo soulInfo_;
      public static final int ARTIFACTPROPERTY_FIELD_NUMBER = 3;
      private ArtifactProperty artifactProperty_;
      private byte memoizedIsInitialized;
      private static final S2C_MainResult_7002 DEFAULT_INSTANCE = new S2C_MainResult_7002();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MainResult_7002> PARSER = new AbstractParser<S2C_MainResult_7002>() {
         public S2C_MainResult_7002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MainResult_7002(input, extensionRegistry);
         }
      };

      private S2C_MainResult_7002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MainResult_7002() {
         this.memoizedIsInitialized = -1;
         this.artifactInfos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MainResult_7002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MainResult_7002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.artifactInfos_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.artifactInfos_.add(input.readMessage(ArtifactMsg.ArtifactInfo.PARSER, extensionRegistry));
                        break;
                     case 18:
                        SoulInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.soulInfo_.toBuilder();
                        }

                        this.soulInfo_ = (SoulInfo)input.readMessage(ArtifactMsg.SoulInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.soulInfo_);
                           this.soulInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 26:
                        ArtifactProperty.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.artifactProperty_.toBuilder();
                        }

                        this.artifactProperty_ = (ArtifactProperty)input.readMessage(ArtifactMsg.ArtifactProperty.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.artifactProperty_);
                           this.artifactProperty_ = subBuilder.buildPartial();
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.artifactInfos_ = Collections.unmodifiableList(this.artifactInfos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_MainResult_7002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_MainResult_7002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MainResult_7002.class, Builder.class);
      }

      public List<ArtifactInfo> getArtifactInfosList() {
         return this.artifactInfos_;
      }

      public List<? extends ArtifactInfoOrBuilder> getArtifactInfosOrBuilderList() {
         return this.artifactInfos_;
      }

      public int getArtifactInfosCount() {
         return this.artifactInfos_.size();
      }

      public ArtifactInfo getArtifactInfos(int index) {
         return (ArtifactInfo)this.artifactInfos_.get(index);
      }

      public ArtifactInfoOrBuilder getArtifactInfosOrBuilder(int index) {
         return (ArtifactInfoOrBuilder)this.artifactInfos_.get(index);
      }

      public boolean hasSoulInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public SoulInfo getSoulInfo() {
         return this.soulInfo_ == null ? ArtifactMsg.SoulInfo.getDefaultInstance() : this.soulInfo_;
      }

      public SoulInfoOrBuilder getSoulInfoOrBuilder() {
         return this.soulInfo_ == null ? ArtifactMsg.SoulInfo.getDefaultInstance() : this.soulInfo_;
      }

      public boolean hasArtifactProperty() {
         return (this.bitField0_ & 2) != 0;
      }

      public ArtifactProperty getArtifactProperty() {
         return this.artifactProperty_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.artifactProperty_;
      }

      public ArtifactPropertyOrBuilder getArtifactPropertyOrBuilder() {
         return this.artifactProperty_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.artifactProperty_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSoulInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasArtifactProperty()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getArtifactInfosCount(); ++i) {
               if (!this.getArtifactInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (!this.getSoulInfo().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else if (!this.getArtifactProperty().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else {
               this.memoizedIsInitialized = 1;
               return true;
            }
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.artifactInfos_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.artifactInfos_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(2, this.getSoulInfo());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(3, this.getArtifactProperty());
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.artifactInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.artifactInfos_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getSoulInfo());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getArtifactProperty());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MainResult_7002)) {
            return super.equals(obj);
         } else {
            S2C_MainResult_7002 other = (S2C_MainResult_7002)obj;
            if (!this.getArtifactInfosList().equals(other.getArtifactInfosList())) {
               return false;
            } else if (this.hasSoulInfo() != other.hasSoulInfo()) {
               return false;
            } else if (this.hasSoulInfo() && !this.getSoulInfo().equals(other.getSoulInfo())) {
               return false;
            } else if (this.hasArtifactProperty() != other.hasArtifactProperty()) {
               return false;
            } else if (this.hasArtifactProperty() && !this.getArtifactProperty().equals(other.getArtifactProperty())) {
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
            if (this.getArtifactInfosCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getArtifactInfosList().hashCode();
            }

            if (this.hasSoulInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSoulInfo().hashCode();
            }

            if (this.hasArtifactProperty()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getArtifactProperty().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MainResult_7002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MainResult_7002)PARSER.parseFrom(data);
      }

      public static S2C_MainResult_7002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MainResult_7002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MainResult_7002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MainResult_7002)PARSER.parseFrom(data);
      }

      public static S2C_MainResult_7002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MainResult_7002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MainResult_7002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MainResult_7002)PARSER.parseFrom(data);
      }

      public static S2C_MainResult_7002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MainResult_7002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MainResult_7002 parseFrom(InputStream input) throws IOException {
         return (S2C_MainResult_7002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MainResult_7002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MainResult_7002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MainResult_7002 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MainResult_7002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MainResult_7002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MainResult_7002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MainResult_7002 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MainResult_7002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MainResult_7002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MainResult_7002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MainResult_7002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MainResult_7002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MainResult_7002> parser() {
         return PARSER;
      }

      public Parser<S2C_MainResult_7002> getParserForType() {
         return PARSER;
      }

      public S2C_MainResult_7002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MainResult_7002OrBuilder {
         private int bitField0_;
         private List<ArtifactInfo> artifactInfos_;
         private RepeatedFieldBuilderV3<ArtifactInfo, ArtifactInfo.Builder, ArtifactInfoOrBuilder> artifactInfosBuilder_;
         private SoulInfo soulInfo_;
         private SingleFieldBuilderV3<SoulInfo, SoulInfo.Builder, SoulInfoOrBuilder> soulInfoBuilder_;
         private ArtifactProperty artifactProperty_;
         private SingleFieldBuilderV3<ArtifactProperty, ArtifactProperty.Builder, ArtifactPropertyOrBuilder> artifactPropertyBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_MainResult_7002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_MainResult_7002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MainResult_7002.class, Builder.class);
         }

         private Builder() {
            this.artifactInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.artifactInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactMsg.S2C_MainResult_7002.alwaysUseFieldBuilders) {
               this.getArtifactInfosFieldBuilder();
               this.getSoulInfoFieldBuilder();
               this.getArtifactPropertyFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.artifactInfosBuilder_ == null) {
               this.artifactInfos_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.artifactInfosBuilder_.clear();
            }

            if (this.soulInfoBuilder_ == null) {
               this.soulInfo_ = null;
            } else {
               this.soulInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.artifactPropertyBuilder_ == null) {
               this.artifactProperty_ = null;
            } else {
               this.artifactPropertyBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_MainResult_7002_descriptor;
         }

         public S2C_MainResult_7002 getDefaultInstanceForType() {
            return ArtifactMsg.S2C_MainResult_7002.getDefaultInstance();
         }

         public S2C_MainResult_7002 build() {
            S2C_MainResult_7002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MainResult_7002 buildPartial() {
            S2C_MainResult_7002 result = new S2C_MainResult_7002(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.artifactInfosBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.artifactInfos_ = Collections.unmodifiableList(this.artifactInfos_);
                  this.bitField0_ &= -2;
               }

               result.artifactInfos_ = this.artifactInfos_;
            } else {
               result.artifactInfos_ = this.artifactInfosBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.soulInfoBuilder_ == null) {
                  result.soulInfo_ = this.soulInfo_;
               } else {
                  result.soulInfo_ = (SoulInfo)this.soulInfoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.artifactPropertyBuilder_ == null) {
                  result.artifactProperty_ = this.artifactProperty_;
               } else {
                  result.artifactProperty_ = (ArtifactProperty)this.artifactPropertyBuilder_.build();
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
            if (other instanceof S2C_MainResult_7002) {
               return this.mergeFrom((S2C_MainResult_7002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MainResult_7002 other) {
            if (other == ArtifactMsg.S2C_MainResult_7002.getDefaultInstance()) {
               return this;
            } else {
               if (this.artifactInfosBuilder_ == null) {
                  if (!other.artifactInfos_.isEmpty()) {
                     if (this.artifactInfos_.isEmpty()) {
                        this.artifactInfos_ = other.artifactInfos_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureArtifactInfosIsMutable();
                        this.artifactInfos_.addAll(other.artifactInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.artifactInfos_.isEmpty()) {
                  if (this.artifactInfosBuilder_.isEmpty()) {
                     this.artifactInfosBuilder_.dispose();
                     this.artifactInfosBuilder_ = null;
                     this.artifactInfos_ = other.artifactInfos_;
                     this.bitField0_ &= -2;
                     this.artifactInfosBuilder_ = ArtifactMsg.S2C_MainResult_7002.alwaysUseFieldBuilders ? this.getArtifactInfosFieldBuilder() : null;
                  } else {
                     this.artifactInfosBuilder_.addAllMessages(other.artifactInfos_);
                  }
               }

               if (other.hasSoulInfo()) {
                  this.mergeSoulInfo(other.getSoulInfo());
               }

               if (other.hasArtifactProperty()) {
                  this.mergeArtifactProperty(other.getArtifactProperty());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSoulInfo()) {
               return false;
            } else if (!this.hasArtifactProperty()) {
               return false;
            } else {
               for(int i = 0; i < this.getArtifactInfosCount(); ++i) {
                  if (!this.getArtifactInfos(i).isInitialized()) {
                     return false;
                  }
               }

               if (!this.getSoulInfo().isInitialized()) {
                  return false;
               } else if (!this.getArtifactProperty().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MainResult_7002 parsedMessage = null;

            try {
               parsedMessage = (S2C_MainResult_7002)ArtifactMsg.S2C_MainResult_7002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MainResult_7002)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureArtifactInfosIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.artifactInfos_ = new ArrayList(this.artifactInfos_);
               this.bitField0_ |= 1;
            }

         }

         public List<ArtifactInfo> getArtifactInfosList() {
            return this.artifactInfosBuilder_ == null ? Collections.unmodifiableList(this.artifactInfos_) : this.artifactInfosBuilder_.getMessageList();
         }

         public int getArtifactInfosCount() {
            return this.artifactInfosBuilder_ == null ? this.artifactInfos_.size() : this.artifactInfosBuilder_.getCount();
         }

         public ArtifactInfo getArtifactInfos(int index) {
            return this.artifactInfosBuilder_ == null ? (ArtifactInfo)this.artifactInfos_.get(index) : (ArtifactInfo)this.artifactInfosBuilder_.getMessage(index);
         }

         public Builder setArtifactInfos(int index, ArtifactInfo value) {
            if (this.artifactInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArtifactInfosIsMutable();
               this.artifactInfos_.set(index, value);
               this.onChanged();
            } else {
               this.artifactInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setArtifactInfos(int index, ArtifactInfo.Builder builderForValue) {
            if (this.artifactInfosBuilder_ == null) {
               this.ensureArtifactInfosIsMutable();
               this.artifactInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.artifactInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addArtifactInfos(ArtifactInfo value) {
            if (this.artifactInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArtifactInfosIsMutable();
               this.artifactInfos_.add(value);
               this.onChanged();
            } else {
               this.artifactInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addArtifactInfos(int index, ArtifactInfo value) {
            if (this.artifactInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArtifactInfosIsMutable();
               this.artifactInfos_.add(index, value);
               this.onChanged();
            } else {
               this.artifactInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addArtifactInfos(ArtifactInfo.Builder builderForValue) {
            if (this.artifactInfosBuilder_ == null) {
               this.ensureArtifactInfosIsMutable();
               this.artifactInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.artifactInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addArtifactInfos(int index, ArtifactInfo.Builder builderForValue) {
            if (this.artifactInfosBuilder_ == null) {
               this.ensureArtifactInfosIsMutable();
               this.artifactInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.artifactInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllArtifactInfos(Iterable<? extends ArtifactInfo> values) {
            if (this.artifactInfosBuilder_ == null) {
               this.ensureArtifactInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.artifactInfos_);
               this.onChanged();
            } else {
               this.artifactInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearArtifactInfos() {
            if (this.artifactInfosBuilder_ == null) {
               this.artifactInfos_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.artifactInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removeArtifactInfos(int index) {
            if (this.artifactInfosBuilder_ == null) {
               this.ensureArtifactInfosIsMutable();
               this.artifactInfos_.remove(index);
               this.onChanged();
            } else {
               this.artifactInfosBuilder_.remove(index);
            }

            return this;
         }

         public ArtifactInfo.Builder getArtifactInfosBuilder(int index) {
            return (ArtifactInfo.Builder)this.getArtifactInfosFieldBuilder().getBuilder(index);
         }

         public ArtifactInfoOrBuilder getArtifactInfosOrBuilder(int index) {
            return this.artifactInfosBuilder_ == null ? (ArtifactInfoOrBuilder)this.artifactInfos_.get(index) : (ArtifactInfoOrBuilder)this.artifactInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ArtifactInfoOrBuilder> getArtifactInfosOrBuilderList() {
            return this.artifactInfosBuilder_ != null ? this.artifactInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.artifactInfos_);
         }

         public ArtifactInfo.Builder addArtifactInfosBuilder() {
            return (ArtifactInfo.Builder)this.getArtifactInfosFieldBuilder().addBuilder(ArtifactMsg.ArtifactInfo.getDefaultInstance());
         }

         public ArtifactInfo.Builder addArtifactInfosBuilder(int index) {
            return (ArtifactInfo.Builder)this.getArtifactInfosFieldBuilder().addBuilder(index, ArtifactMsg.ArtifactInfo.getDefaultInstance());
         }

         public List<ArtifactInfo.Builder> getArtifactInfosBuilderList() {
            return this.getArtifactInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ArtifactInfo, ArtifactInfo.Builder, ArtifactInfoOrBuilder> getArtifactInfosFieldBuilder() {
            if (this.artifactInfosBuilder_ == null) {
               this.artifactInfosBuilder_ = new RepeatedFieldBuilderV3(this.artifactInfos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.artifactInfos_ = null;
            }

            return this.artifactInfosBuilder_;
         }

         public boolean hasSoulInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public SoulInfo getSoulInfo() {
            if (this.soulInfoBuilder_ == null) {
               return this.soulInfo_ == null ? ArtifactMsg.SoulInfo.getDefaultInstance() : this.soulInfo_;
            } else {
               return (SoulInfo)this.soulInfoBuilder_.getMessage();
            }
         }

         public Builder setSoulInfo(SoulInfo value) {
            if (this.soulInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.soulInfo_ = value;
               this.onChanged();
            } else {
               this.soulInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setSoulInfo(SoulInfo.Builder builderForValue) {
            if (this.soulInfoBuilder_ == null) {
               this.soulInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.soulInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeSoulInfo(SoulInfo value) {
            if (this.soulInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.soulInfo_ != null && this.soulInfo_ != ArtifactMsg.SoulInfo.getDefaultInstance()) {
                  this.soulInfo_ = ArtifactMsg.SoulInfo.newBuilder(this.soulInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.soulInfo_ = value;
               }

               this.onChanged();
            } else {
               this.soulInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearSoulInfo() {
            if (this.soulInfoBuilder_ == null) {
               this.soulInfo_ = null;
               this.onChanged();
            } else {
               this.soulInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public SoulInfo.Builder getSoulInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (SoulInfo.Builder)this.getSoulInfoFieldBuilder().getBuilder();
         }

         public SoulInfoOrBuilder getSoulInfoOrBuilder() {
            if (this.soulInfoBuilder_ != null) {
               return (SoulInfoOrBuilder)this.soulInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.soulInfo_ == null ? ArtifactMsg.SoulInfo.getDefaultInstance() : this.soulInfo_;
            }
         }

         private SingleFieldBuilderV3<SoulInfo, SoulInfo.Builder, SoulInfoOrBuilder> getSoulInfoFieldBuilder() {
            if (this.soulInfoBuilder_ == null) {
               this.soulInfoBuilder_ = new SingleFieldBuilderV3(this.getSoulInfo(), this.getParentForChildren(), this.isClean());
               this.soulInfo_ = null;
            }

            return this.soulInfoBuilder_;
         }

         public boolean hasArtifactProperty() {
            return (this.bitField0_ & 4) != 0;
         }

         public ArtifactProperty getArtifactProperty() {
            if (this.artifactPropertyBuilder_ == null) {
               return this.artifactProperty_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.artifactProperty_;
            } else {
               return (ArtifactProperty)this.artifactPropertyBuilder_.getMessage();
            }
         }

         public Builder setArtifactProperty(ArtifactProperty value) {
            if (this.artifactPropertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.artifactProperty_ = value;
               this.onChanged();
            } else {
               this.artifactPropertyBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setArtifactProperty(ArtifactProperty.Builder builderForValue) {
            if (this.artifactPropertyBuilder_ == null) {
               this.artifactProperty_ = builderForValue.build();
               this.onChanged();
            } else {
               this.artifactPropertyBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeArtifactProperty(ArtifactProperty value) {
            if (this.artifactPropertyBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.artifactProperty_ != null && this.artifactProperty_ != ArtifactMsg.ArtifactProperty.getDefaultInstance()) {
                  this.artifactProperty_ = ArtifactMsg.ArtifactProperty.newBuilder(this.artifactProperty_).mergeFrom(value).buildPartial();
               } else {
                  this.artifactProperty_ = value;
               }

               this.onChanged();
            } else {
               this.artifactPropertyBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearArtifactProperty() {
            if (this.artifactPropertyBuilder_ == null) {
               this.artifactProperty_ = null;
               this.onChanged();
            } else {
               this.artifactPropertyBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public ArtifactProperty.Builder getArtifactPropertyBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (ArtifactProperty.Builder)this.getArtifactPropertyFieldBuilder().getBuilder();
         }

         public ArtifactPropertyOrBuilder getArtifactPropertyOrBuilder() {
            if (this.artifactPropertyBuilder_ != null) {
               return (ArtifactPropertyOrBuilder)this.artifactPropertyBuilder_.getMessageOrBuilder();
            } else {
               return this.artifactProperty_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.artifactProperty_;
            }
         }

         private SingleFieldBuilderV3<ArtifactProperty, ArtifactProperty.Builder, ArtifactPropertyOrBuilder> getArtifactPropertyFieldBuilder() {
            if (this.artifactPropertyBuilder_ == null) {
               this.artifactPropertyBuilder_ = new SingleFieldBuilderV3(this.getArtifactProperty(), this.getParentForChildren(), this.isClean());
               this.artifactProperty_ = null;
            }

            return this.artifactPropertyBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_Strong_7005 extends GeneratedMessageV3 implements C2S_Strong_7005OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Strong_7005 DEFAULT_INSTANCE = new C2S_Strong_7005();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Strong_7005> PARSER = new AbstractParser<C2S_Strong_7005>() {
         public C2S_Strong_7005 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Strong_7005(input, extensionRegistry);
         }
      };

      private C2S_Strong_7005(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Strong_7005() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Strong_7005();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Strong_7005(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_Strong_7005_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_Strong_7005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Strong_7005.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Strong_7005)) {
            return super.equals(obj);
         } else {
            C2S_Strong_7005 other = (C2S_Strong_7005)obj;
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

      public static C2S_Strong_7005 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Strong_7005)PARSER.parseFrom(data);
      }

      public static C2S_Strong_7005 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Strong_7005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Strong_7005 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Strong_7005)PARSER.parseFrom(data);
      }

      public static C2S_Strong_7005 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Strong_7005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Strong_7005 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Strong_7005)PARSER.parseFrom(data);
      }

      public static C2S_Strong_7005 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Strong_7005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Strong_7005 parseFrom(InputStream input) throws IOException {
         return (C2S_Strong_7005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Strong_7005 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Strong_7005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Strong_7005 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Strong_7005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Strong_7005 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Strong_7005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Strong_7005 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Strong_7005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Strong_7005 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Strong_7005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Strong_7005 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Strong_7005 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Strong_7005> parser() {
         return PARSER;
      }

      public Parser<C2S_Strong_7005> getParserForType() {
         return PARSER;
      }

      public C2S_Strong_7005 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Strong_7005OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_Strong_7005_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_Strong_7005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Strong_7005.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactMsg.C2S_Strong_7005.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_Strong_7005_descriptor;
         }

         public C2S_Strong_7005 getDefaultInstanceForType() {
            return ArtifactMsg.C2S_Strong_7005.getDefaultInstance();
         }

         public C2S_Strong_7005 build() {
            C2S_Strong_7005 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Strong_7005 buildPartial() {
            C2S_Strong_7005 result = new C2S_Strong_7005(this);
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
            if (other instanceof C2S_Strong_7005) {
               return this.mergeFrom((C2S_Strong_7005)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Strong_7005 other) {
            if (other == ArtifactMsg.C2S_Strong_7005.getDefaultInstance()) {
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
            C2S_Strong_7005 parsedMessage = null;

            try {
               parsedMessage = (C2S_Strong_7005)ArtifactMsg.C2S_Strong_7005.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Strong_7005)e.getUnfinishedMessage();
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

   public static final class S2C_StrongResult_7006 extends GeneratedMessageV3 implements S2C_StrongResult_7006OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int PROPERTY_FIELD_NUMBER = 2;
      private ArtifactProperty property_;
      public static final int LVUP_FIELD_NUMBER = 3;
      private int lvUp_;
      public static final int POWERCHANGE_FIELD_NUMBER = 4;
      private int powerChange_;
      public static final int PROPERTYCHANGES_FIELD_NUMBER = 5;
      private List<CommonMsg.PropertyInfo> propertyChanges_;
      private byte memoizedIsInitialized;
      private static final S2C_StrongResult_7006 DEFAULT_INSTANCE = new S2C_StrongResult_7006();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StrongResult_7006> PARSER = new AbstractParser<S2C_StrongResult_7006>() {
         public S2C_StrongResult_7006 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StrongResult_7006(input, extensionRegistry);
         }
      };

      private S2C_StrongResult_7006(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StrongResult_7006() {
         this.memoizedIsInitialized = -1;
         this.propertyChanges_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StrongResult_7006();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StrongResult_7006(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ArtifactProperty.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.property_.toBuilder();
                        }

                        this.property_ = (ArtifactProperty)input.readMessage(ArtifactMsg.ArtifactProperty.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.property_);
                           this.property_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.lvUp_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.powerChange_ = input.readInt32();
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.propertyChanges_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.propertyChanges_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
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
                  this.propertyChanges_ = Collections.unmodifiableList(this.propertyChanges_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_StrongResult_7006_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_StrongResult_7006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StrongResult_7006.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasProperty() {
         return (this.bitField0_ & 2) != 0;
      }

      public ArtifactProperty getProperty() {
         return this.property_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.property_;
      }

      public ArtifactPropertyOrBuilder getPropertyOrBuilder() {
         return this.property_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.property_;
      }

      public boolean hasLvUp() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLvUp() {
         return this.lvUp_;
      }

      public boolean hasPowerChange() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getPowerChange() {
         return this.powerChange_;
      }

      public List<CommonMsg.PropertyInfo> getPropertyChangesList() {
         return this.propertyChanges_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList() {
         return this.propertyChanges_;
      }

      public int getPropertyChangesCount() {
         return this.propertyChanges_.size();
      }

      public CommonMsg.PropertyInfo getPropertyChanges(int index) {
         return (CommonMsg.PropertyInfo)this.propertyChanges_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.propertyChanges_.get(index);
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
         } else if (!this.hasProperty()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPowerChange()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getProperty().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPropertyChangesCount(); ++i) {
               if (!this.getPropertyChanges(i).isInitialized()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getProperty());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.lvUp_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.powerChange_);
         }

         for(int i = 0; i < this.propertyChanges_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.propertyChanges_.get(i));
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
               size += CodedOutputStream.computeMessageSize(2, this.getProperty());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.lvUp_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.powerChange_);
            }

            for(int i = 0; i < this.propertyChanges_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.propertyChanges_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_StrongResult_7006)) {
            return super.equals(obj);
         } else {
            S2C_StrongResult_7006 other = (S2C_StrongResult_7006)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasProperty() != other.hasProperty()) {
               return false;
            } else if (this.hasProperty() && !this.getProperty().equals(other.getProperty())) {
               return false;
            } else if (this.hasLvUp() != other.hasLvUp()) {
               return false;
            } else if (this.hasLvUp() && this.getLvUp() != other.getLvUp()) {
               return false;
            } else if (this.hasPowerChange() != other.hasPowerChange()) {
               return false;
            } else if (this.hasPowerChange() && this.getPowerChange() != other.getPowerChange()) {
               return false;
            } else if (!this.getPropertyChangesList().equals(other.getPropertyChangesList())) {
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

            if (this.hasProperty()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getProperty().hashCode();
            }

            if (this.hasLvUp()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLvUp();
            }

            if (this.hasPowerChange()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPowerChange();
            }

            if (this.getPropertyChangesCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getPropertyChangesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_StrongResult_7006 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StrongResult_7006)PARSER.parseFrom(data);
      }

      public static S2C_StrongResult_7006 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StrongResult_7006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StrongResult_7006 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StrongResult_7006)PARSER.parseFrom(data);
      }

      public static S2C_StrongResult_7006 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StrongResult_7006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StrongResult_7006 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StrongResult_7006)PARSER.parseFrom(data);
      }

      public static S2C_StrongResult_7006 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StrongResult_7006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StrongResult_7006 parseFrom(InputStream input) throws IOException {
         return (S2C_StrongResult_7006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StrongResult_7006 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StrongResult_7006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StrongResult_7006 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StrongResult_7006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StrongResult_7006 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StrongResult_7006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StrongResult_7006 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StrongResult_7006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StrongResult_7006 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StrongResult_7006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StrongResult_7006 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StrongResult_7006 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StrongResult_7006> parser() {
         return PARSER;
      }

      public Parser<S2C_StrongResult_7006> getParserForType() {
         return PARSER;
      }

      public S2C_StrongResult_7006 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StrongResult_7006OrBuilder {
         private int bitField0_;
         private int result_;
         private ArtifactProperty property_;
         private SingleFieldBuilderV3<ArtifactProperty, ArtifactProperty.Builder, ArtifactPropertyOrBuilder> propertyBuilder_;
         private int lvUp_;
         private int powerChange_;
         private List<CommonMsg.PropertyInfo> propertyChanges_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> propertyChangesBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_StrongResult_7006_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_StrongResult_7006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StrongResult_7006.class, Builder.class);
         }

         private Builder() {
            this.propertyChanges_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.propertyChanges_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactMsg.S2C_StrongResult_7006.alwaysUseFieldBuilders) {
               this.getPropertyFieldBuilder();
               this.getPropertyChangesFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.propertyBuilder_ == null) {
               this.property_ = null;
            } else {
               this.propertyBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.lvUp_ = 0;
            this.bitField0_ &= -5;
            this.powerChange_ = 0;
            this.bitField0_ &= -9;
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChanges_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.propertyChangesBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_StrongResult_7006_descriptor;
         }

         public S2C_StrongResult_7006 getDefaultInstanceForType() {
            return ArtifactMsg.S2C_StrongResult_7006.getDefaultInstance();
         }

         public S2C_StrongResult_7006 build() {
            S2C_StrongResult_7006 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StrongResult_7006 buildPartial() {
            S2C_StrongResult_7006 result = new S2C_StrongResult_7006(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.propertyBuilder_ == null) {
                  result.property_ = this.property_;
               } else {
                  result.property_ = (ArtifactProperty)this.propertyBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.lvUp_ = this.lvUp_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.powerChange_ = this.powerChange_;
               to_bitField0_ |= 8;
            }

            if (this.propertyChangesBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.propertyChanges_ = Collections.unmodifiableList(this.propertyChanges_);
                  this.bitField0_ &= -17;
               }

               result.propertyChanges_ = this.propertyChanges_;
            } else {
               result.propertyChanges_ = this.propertyChangesBuilder_.build();
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
            if (other instanceof S2C_StrongResult_7006) {
               return this.mergeFrom((S2C_StrongResult_7006)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StrongResult_7006 other) {
            if (other == ArtifactMsg.S2C_StrongResult_7006.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasProperty()) {
                  this.mergeProperty(other.getProperty());
               }

               if (other.hasLvUp()) {
                  this.setLvUp(other.getLvUp());
               }

               if (other.hasPowerChange()) {
                  this.setPowerChange(other.getPowerChange());
               }

               if (this.propertyChangesBuilder_ == null) {
                  if (!other.propertyChanges_.isEmpty()) {
                     if (this.propertyChanges_.isEmpty()) {
                        this.propertyChanges_ = other.propertyChanges_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensurePropertyChangesIsMutable();
                        this.propertyChanges_.addAll(other.propertyChanges_);
                     }

                     this.onChanged();
                  }
               } else if (!other.propertyChanges_.isEmpty()) {
                  if (this.propertyChangesBuilder_.isEmpty()) {
                     this.propertyChangesBuilder_.dispose();
                     this.propertyChangesBuilder_ = null;
                     this.propertyChanges_ = other.propertyChanges_;
                     this.bitField0_ &= -17;
                     this.propertyChangesBuilder_ = ArtifactMsg.S2C_StrongResult_7006.alwaysUseFieldBuilders ? this.getPropertyChangesFieldBuilder() : null;
                  } else {
                     this.propertyChangesBuilder_.addAllMessages(other.propertyChanges_);
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
            } else if (!this.hasProperty()) {
               return false;
            } else if (!this.hasPowerChange()) {
               return false;
            } else if (!this.getProperty().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getPropertyChangesCount(); ++i) {
                  if (!this.getPropertyChanges(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_StrongResult_7006 parsedMessage = null;

            try {
               parsedMessage = (S2C_StrongResult_7006)ArtifactMsg.S2C_StrongResult_7006.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StrongResult_7006)e.getUnfinishedMessage();
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

         public boolean hasProperty() {
            return (this.bitField0_ & 2) != 0;
         }

         public ArtifactProperty getProperty() {
            if (this.propertyBuilder_ == null) {
               return this.property_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.property_;
            } else {
               return (ArtifactProperty)this.propertyBuilder_.getMessage();
            }
         }

         public Builder setProperty(ArtifactProperty value) {
            if (this.propertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.property_ = value;
               this.onChanged();
            } else {
               this.propertyBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setProperty(ArtifactProperty.Builder builderForValue) {
            if (this.propertyBuilder_ == null) {
               this.property_ = builderForValue.build();
               this.onChanged();
            } else {
               this.propertyBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeProperty(ArtifactProperty value) {
            if (this.propertyBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.property_ != null && this.property_ != ArtifactMsg.ArtifactProperty.getDefaultInstance()) {
                  this.property_ = ArtifactMsg.ArtifactProperty.newBuilder(this.property_).mergeFrom(value).buildPartial();
               } else {
                  this.property_ = value;
               }

               this.onChanged();
            } else {
               this.propertyBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearProperty() {
            if (this.propertyBuilder_ == null) {
               this.property_ = null;
               this.onChanged();
            } else {
               this.propertyBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public ArtifactProperty.Builder getPropertyBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (ArtifactProperty.Builder)this.getPropertyFieldBuilder().getBuilder();
         }

         public ArtifactPropertyOrBuilder getPropertyOrBuilder() {
            if (this.propertyBuilder_ != null) {
               return (ArtifactPropertyOrBuilder)this.propertyBuilder_.getMessageOrBuilder();
            } else {
               return this.property_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.property_;
            }
         }

         private SingleFieldBuilderV3<ArtifactProperty, ArtifactProperty.Builder, ArtifactPropertyOrBuilder> getPropertyFieldBuilder() {
            if (this.propertyBuilder_ == null) {
               this.propertyBuilder_ = new SingleFieldBuilderV3(this.getProperty(), this.getParentForChildren(), this.isClean());
               this.property_ = null;
            }

            return this.propertyBuilder_;
         }

         public boolean hasLvUp() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLvUp() {
            return this.lvUp_;
         }

         public Builder setLvUp(int value) {
            this.bitField0_ |= 4;
            this.lvUp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLvUp() {
            this.bitField0_ &= -5;
            this.lvUp_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPowerChange() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPowerChange() {
            return this.powerChange_;
         }

         public Builder setPowerChange(int value) {
            this.bitField0_ |= 8;
            this.powerChange_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPowerChange() {
            this.bitField0_ &= -9;
            this.powerChange_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePropertyChangesIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.propertyChanges_ = new ArrayList(this.propertyChanges_);
               this.bitField0_ |= 16;
            }

         }

         public List<CommonMsg.PropertyInfo> getPropertyChangesList() {
            return this.propertyChangesBuilder_ == null ? Collections.unmodifiableList(this.propertyChanges_) : this.propertyChangesBuilder_.getMessageList();
         }

         public int getPropertyChangesCount() {
            return this.propertyChangesBuilder_ == null ? this.propertyChanges_.size() : this.propertyChangesBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getPropertyChanges(int index) {
            return this.propertyChangesBuilder_ == null ? (CommonMsg.PropertyInfo)this.propertyChanges_.get(index) : (CommonMsg.PropertyInfo)this.propertyChangesBuilder_.getMessage(index);
         }

         public Builder setPropertyChanges(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.set(index, value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPropertyChanges(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChanges(CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPropertyChanges(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(index, value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPropertyChanges(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChanges(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPropertyChanges(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.propertyChanges_);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPropertyChanges() {
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChanges_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.clear();
            }

            return this;
         }

         public Builder removePropertyChanges(int index) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.remove(index);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getPropertyChangesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index) {
            return this.propertyChangesBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.propertyChanges_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.propertyChangesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList() {
            return this.propertyChangesBuilder_ != null ? this.propertyChangesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.propertyChanges_);
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getPropertyChangesBuilderList() {
            return this.getPropertyChangesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getPropertyChangesFieldBuilder() {
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChangesBuilder_ = new RepeatedFieldBuilderV3(this.propertyChanges_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.propertyChanges_ = null;
            }

            return this.propertyChangesBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_SkillUpgrade_7007 extends GeneratedMessageV3 implements C2S_SkillUpgrade_7007OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SkillUpgrade_7007 DEFAULT_INSTANCE = new C2S_SkillUpgrade_7007();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SkillUpgrade_7007> PARSER = new AbstractParser<C2S_SkillUpgrade_7007>() {
         public C2S_SkillUpgrade_7007 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SkillUpgrade_7007(input, extensionRegistry);
         }
      };

      private C2S_SkillUpgrade_7007(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SkillUpgrade_7007() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SkillUpgrade_7007();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SkillUpgrade_7007(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_SkillUpgrade_7007_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_SkillUpgrade_7007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SkillUpgrade_7007.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SkillUpgrade_7007)) {
            return super.equals(obj);
         } else {
            C2S_SkillUpgrade_7007 other = (C2S_SkillUpgrade_7007)obj;
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

      public static C2S_SkillUpgrade_7007 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SkillUpgrade_7007)PARSER.parseFrom(data);
      }

      public static C2S_SkillUpgrade_7007 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkillUpgrade_7007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkillUpgrade_7007 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SkillUpgrade_7007)PARSER.parseFrom(data);
      }

      public static C2S_SkillUpgrade_7007 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkillUpgrade_7007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkillUpgrade_7007 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SkillUpgrade_7007)PARSER.parseFrom(data);
      }

      public static C2S_SkillUpgrade_7007 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SkillUpgrade_7007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SkillUpgrade_7007 parseFrom(InputStream input) throws IOException {
         return (C2S_SkillUpgrade_7007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SkillUpgrade_7007 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkillUpgrade_7007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SkillUpgrade_7007 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SkillUpgrade_7007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SkillUpgrade_7007 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkillUpgrade_7007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SkillUpgrade_7007 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SkillUpgrade_7007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SkillUpgrade_7007 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SkillUpgrade_7007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SkillUpgrade_7007 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SkillUpgrade_7007 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SkillUpgrade_7007> parser() {
         return PARSER;
      }

      public Parser<C2S_SkillUpgrade_7007> getParserForType() {
         return PARSER;
      }

      public C2S_SkillUpgrade_7007 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SkillUpgrade_7007OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_SkillUpgrade_7007_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_SkillUpgrade_7007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SkillUpgrade_7007.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactMsg.C2S_SkillUpgrade_7007.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_SkillUpgrade_7007_descriptor;
         }

         public C2S_SkillUpgrade_7007 getDefaultInstanceForType() {
            return ArtifactMsg.C2S_SkillUpgrade_7007.getDefaultInstance();
         }

         public C2S_SkillUpgrade_7007 build() {
            C2S_SkillUpgrade_7007 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SkillUpgrade_7007 buildPartial() {
            C2S_SkillUpgrade_7007 result = new C2S_SkillUpgrade_7007(this);
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
            if (other instanceof C2S_SkillUpgrade_7007) {
               return this.mergeFrom((C2S_SkillUpgrade_7007)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SkillUpgrade_7007 other) {
            if (other == ArtifactMsg.C2S_SkillUpgrade_7007.getDefaultInstance()) {
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
            C2S_SkillUpgrade_7007 parsedMessage = null;

            try {
               parsedMessage = (C2S_SkillUpgrade_7007)ArtifactMsg.C2S_SkillUpgrade_7007.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SkillUpgrade_7007)e.getUnfinishedMessage();
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

   public static final class S2C_SkillUpgradeResult_7008 extends GeneratedMessageV3 implements S2C_SkillUpgradeResult_7008OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int PROPERTY_FIELD_NUMBER = 2;
      private ArtifactProperty property_;
      private byte memoizedIsInitialized;
      private static final S2C_SkillUpgradeResult_7008 DEFAULT_INSTANCE = new S2C_SkillUpgradeResult_7008();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SkillUpgradeResult_7008> PARSER = new AbstractParser<S2C_SkillUpgradeResult_7008>() {
         public S2C_SkillUpgradeResult_7008 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SkillUpgradeResult_7008(input, extensionRegistry);
         }
      };

      private S2C_SkillUpgradeResult_7008(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SkillUpgradeResult_7008() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SkillUpgradeResult_7008();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SkillUpgradeResult_7008(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ArtifactProperty.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.property_.toBuilder();
                        }

                        this.property_ = (ArtifactProperty)input.readMessage(ArtifactMsg.ArtifactProperty.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.property_);
                           this.property_ = subBuilder.buildPartial();
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
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_SkillUpgradeResult_7008_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_SkillUpgradeResult_7008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SkillUpgradeResult_7008.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasProperty() {
         return (this.bitField0_ & 2) != 0;
      }

      public ArtifactProperty getProperty() {
         return this.property_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.property_;
      }

      public ArtifactPropertyOrBuilder getPropertyOrBuilder() {
         return this.property_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.property_;
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
         } else if (!this.hasProperty()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getProperty().isInitialized()) {
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
            output.writeMessage(2, this.getProperty());
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
               size += CodedOutputStream.computeMessageSize(2, this.getProperty());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SkillUpgradeResult_7008)) {
            return super.equals(obj);
         } else {
            S2C_SkillUpgradeResult_7008 other = (S2C_SkillUpgradeResult_7008)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasProperty() != other.hasProperty()) {
               return false;
            } else if (this.hasProperty() && !this.getProperty().equals(other.getProperty())) {
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

            if (this.hasProperty()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getProperty().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SkillUpgradeResult_7008 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SkillUpgradeResult_7008)PARSER.parseFrom(data);
      }

      public static S2C_SkillUpgradeResult_7008 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkillUpgradeResult_7008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkillUpgradeResult_7008 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SkillUpgradeResult_7008)PARSER.parseFrom(data);
      }

      public static S2C_SkillUpgradeResult_7008 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkillUpgradeResult_7008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkillUpgradeResult_7008 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SkillUpgradeResult_7008)PARSER.parseFrom(data);
      }

      public static S2C_SkillUpgradeResult_7008 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SkillUpgradeResult_7008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SkillUpgradeResult_7008 parseFrom(InputStream input) throws IOException {
         return (S2C_SkillUpgradeResult_7008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SkillUpgradeResult_7008 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkillUpgradeResult_7008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SkillUpgradeResult_7008 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SkillUpgradeResult_7008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SkillUpgradeResult_7008 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkillUpgradeResult_7008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SkillUpgradeResult_7008 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SkillUpgradeResult_7008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SkillUpgradeResult_7008 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SkillUpgradeResult_7008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SkillUpgradeResult_7008 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SkillUpgradeResult_7008 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SkillUpgradeResult_7008> parser() {
         return PARSER;
      }

      public Parser<S2C_SkillUpgradeResult_7008> getParserForType() {
         return PARSER;
      }

      public S2C_SkillUpgradeResult_7008 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SkillUpgradeResult_7008OrBuilder {
         private int bitField0_;
         private int result_;
         private ArtifactProperty property_;
         private SingleFieldBuilderV3<ArtifactProperty, ArtifactProperty.Builder, ArtifactPropertyOrBuilder> propertyBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_SkillUpgradeResult_7008_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_SkillUpgradeResult_7008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SkillUpgradeResult_7008.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactMsg.S2C_SkillUpgradeResult_7008.alwaysUseFieldBuilders) {
               this.getPropertyFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.propertyBuilder_ == null) {
               this.property_ = null;
            } else {
               this.propertyBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_SkillUpgradeResult_7008_descriptor;
         }

         public S2C_SkillUpgradeResult_7008 getDefaultInstanceForType() {
            return ArtifactMsg.S2C_SkillUpgradeResult_7008.getDefaultInstance();
         }

         public S2C_SkillUpgradeResult_7008 build() {
            S2C_SkillUpgradeResult_7008 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SkillUpgradeResult_7008 buildPartial() {
            S2C_SkillUpgradeResult_7008 result = new S2C_SkillUpgradeResult_7008(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.propertyBuilder_ == null) {
                  result.property_ = this.property_;
               } else {
                  result.property_ = (ArtifactProperty)this.propertyBuilder_.build();
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
            if (other instanceof S2C_SkillUpgradeResult_7008) {
               return this.mergeFrom((S2C_SkillUpgradeResult_7008)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SkillUpgradeResult_7008 other) {
            if (other == ArtifactMsg.S2C_SkillUpgradeResult_7008.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasProperty()) {
                  this.mergeProperty(other.getProperty());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasProperty()) {
               return false;
            } else {
               return this.getProperty().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SkillUpgradeResult_7008 parsedMessage = null;

            try {
               parsedMessage = (S2C_SkillUpgradeResult_7008)ArtifactMsg.S2C_SkillUpgradeResult_7008.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SkillUpgradeResult_7008)e.getUnfinishedMessage();
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

         public boolean hasProperty() {
            return (this.bitField0_ & 2) != 0;
         }

         public ArtifactProperty getProperty() {
            if (this.propertyBuilder_ == null) {
               return this.property_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.property_;
            } else {
               return (ArtifactProperty)this.propertyBuilder_.getMessage();
            }
         }

         public Builder setProperty(ArtifactProperty value) {
            if (this.propertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.property_ = value;
               this.onChanged();
            } else {
               this.propertyBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setProperty(ArtifactProperty.Builder builderForValue) {
            if (this.propertyBuilder_ == null) {
               this.property_ = builderForValue.build();
               this.onChanged();
            } else {
               this.propertyBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeProperty(ArtifactProperty value) {
            if (this.propertyBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.property_ != null && this.property_ != ArtifactMsg.ArtifactProperty.getDefaultInstance()) {
                  this.property_ = ArtifactMsg.ArtifactProperty.newBuilder(this.property_).mergeFrom(value).buildPartial();
               } else {
                  this.property_ = value;
               }

               this.onChanged();
            } else {
               this.propertyBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearProperty() {
            if (this.propertyBuilder_ == null) {
               this.property_ = null;
               this.onChanged();
            } else {
               this.propertyBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public ArtifactProperty.Builder getPropertyBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (ArtifactProperty.Builder)this.getPropertyFieldBuilder().getBuilder();
         }

         public ArtifactPropertyOrBuilder getPropertyOrBuilder() {
            if (this.propertyBuilder_ != null) {
               return (ArtifactPropertyOrBuilder)this.propertyBuilder_.getMessageOrBuilder();
            } else {
               return this.property_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.property_;
            }
         }

         private SingleFieldBuilderV3<ArtifactProperty, ArtifactProperty.Builder, ArtifactPropertyOrBuilder> getPropertyFieldBuilder() {
            if (this.propertyBuilder_ == null) {
               this.propertyBuilder_ = new SingleFieldBuilderV3(this.getProperty(), this.getParentForChildren(), this.isClean());
               this.property_ = null;
            }

            return this.propertyBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RefineUpgrade_7009 extends GeneratedMessageV3 implements C2S_RefineUpgrade_7009OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_RefineUpgrade_7009 DEFAULT_INSTANCE = new C2S_RefineUpgrade_7009();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RefineUpgrade_7009> PARSER = new AbstractParser<C2S_RefineUpgrade_7009>() {
         public C2S_RefineUpgrade_7009 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RefineUpgrade_7009(input, extensionRegistry);
         }
      };

      private C2S_RefineUpgrade_7009(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RefineUpgrade_7009() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RefineUpgrade_7009();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RefineUpgrade_7009(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_RefineUpgrade_7009_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_RefineUpgrade_7009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefineUpgrade_7009.class, Builder.class);
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
         } else if (!(obj instanceof C2S_RefineUpgrade_7009)) {
            return super.equals(obj);
         } else {
            C2S_RefineUpgrade_7009 other = (C2S_RefineUpgrade_7009)obj;
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

      public static C2S_RefineUpgrade_7009 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RefineUpgrade_7009)PARSER.parseFrom(data);
      }

      public static C2S_RefineUpgrade_7009 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefineUpgrade_7009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefineUpgrade_7009 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RefineUpgrade_7009)PARSER.parseFrom(data);
      }

      public static C2S_RefineUpgrade_7009 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefineUpgrade_7009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefineUpgrade_7009 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RefineUpgrade_7009)PARSER.parseFrom(data);
      }

      public static C2S_RefineUpgrade_7009 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RefineUpgrade_7009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RefineUpgrade_7009 parseFrom(InputStream input) throws IOException {
         return (C2S_RefineUpgrade_7009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefineUpgrade_7009 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefineUpgrade_7009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefineUpgrade_7009 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RefineUpgrade_7009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RefineUpgrade_7009 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefineUpgrade_7009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RefineUpgrade_7009 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RefineUpgrade_7009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RefineUpgrade_7009 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RefineUpgrade_7009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RefineUpgrade_7009 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RefineUpgrade_7009 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RefineUpgrade_7009> parser() {
         return PARSER;
      }

      public Parser<C2S_RefineUpgrade_7009> getParserForType() {
         return PARSER;
      }

      public C2S_RefineUpgrade_7009 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RefineUpgrade_7009OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_RefineUpgrade_7009_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_RefineUpgrade_7009_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RefineUpgrade_7009.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactMsg.C2S_RefineUpgrade_7009.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_RefineUpgrade_7009_descriptor;
         }

         public C2S_RefineUpgrade_7009 getDefaultInstanceForType() {
            return ArtifactMsg.C2S_RefineUpgrade_7009.getDefaultInstance();
         }

         public C2S_RefineUpgrade_7009 build() {
            C2S_RefineUpgrade_7009 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RefineUpgrade_7009 buildPartial() {
            C2S_RefineUpgrade_7009 result = new C2S_RefineUpgrade_7009(this);
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
            if (other instanceof C2S_RefineUpgrade_7009) {
               return this.mergeFrom((C2S_RefineUpgrade_7009)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RefineUpgrade_7009 other) {
            if (other == ArtifactMsg.C2S_RefineUpgrade_7009.getDefaultInstance()) {
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
            C2S_RefineUpgrade_7009 parsedMessage = null;

            try {
               parsedMessage = (C2S_RefineUpgrade_7009)ArtifactMsg.C2S_RefineUpgrade_7009.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RefineUpgrade_7009)e.getUnfinishedMessage();
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

   public static final class S2C_RefineUpgradeResult_7010 extends GeneratedMessageV3 implements S2C_RefineUpgradeResult_7010OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int PROPERTY_FIELD_NUMBER = 2;
      private ArtifactProperty property_;
      public static final int LVUP_FIELD_NUMBER = 3;
      private int lvUp_;
      public static final int POWERCHANGE_FIELD_NUMBER = 4;
      private int powerChange_;
      public static final int PROPERTYCHANGES_FIELD_NUMBER = 5;
      private List<CommonMsg.PropertyInfo> propertyChanges_;
      public static final int PROPERTYCHANGESADD_FIELD_NUMBER = 6;
      private List<CommonMsg.PropertyInfo> propertyChangesAdd_;
      private byte memoizedIsInitialized;
      private static final S2C_RefineUpgradeResult_7010 DEFAULT_INSTANCE = new S2C_RefineUpgradeResult_7010();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RefineUpgradeResult_7010> PARSER = new AbstractParser<S2C_RefineUpgradeResult_7010>() {
         public S2C_RefineUpgradeResult_7010 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RefineUpgradeResult_7010(input, extensionRegistry);
         }
      };

      private S2C_RefineUpgradeResult_7010(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RefineUpgradeResult_7010() {
         this.memoizedIsInitialized = -1;
         this.propertyChanges_ = Collections.emptyList();
         this.propertyChangesAdd_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RefineUpgradeResult_7010();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RefineUpgradeResult_7010(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ArtifactProperty.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.property_.toBuilder();
                        }

                        this.property_ = (ArtifactProperty)input.readMessage(ArtifactMsg.ArtifactProperty.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.property_);
                           this.property_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.lvUp_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.powerChange_ = input.readInt32();
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.propertyChanges_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.propertyChanges_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
                        break;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.propertyChangesAdd_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.propertyChangesAdd_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
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
                  this.propertyChanges_ = Collections.unmodifiableList(this.propertyChanges_);
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.propertyChangesAdd_ = Collections.unmodifiableList(this.propertyChangesAdd_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_RefineUpgradeResult_7010_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_RefineUpgradeResult_7010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefineUpgradeResult_7010.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasProperty() {
         return (this.bitField0_ & 2) != 0;
      }

      public ArtifactProperty getProperty() {
         return this.property_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.property_;
      }

      public ArtifactPropertyOrBuilder getPropertyOrBuilder() {
         return this.property_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.property_;
      }

      public boolean hasLvUp() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLvUp() {
         return this.lvUp_;
      }

      public boolean hasPowerChange() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getPowerChange() {
         return this.powerChange_;
      }

      public List<CommonMsg.PropertyInfo> getPropertyChangesList() {
         return this.propertyChanges_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList() {
         return this.propertyChanges_;
      }

      public int getPropertyChangesCount() {
         return this.propertyChanges_.size();
      }

      public CommonMsg.PropertyInfo getPropertyChanges(int index) {
         return (CommonMsg.PropertyInfo)this.propertyChanges_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.propertyChanges_.get(index);
      }

      public List<CommonMsg.PropertyInfo> getPropertyChangesAddList() {
         return this.propertyChangesAdd_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesAddOrBuilderList() {
         return this.propertyChangesAdd_;
      }

      public int getPropertyChangesAddCount() {
         return this.propertyChangesAdd_.size();
      }

      public CommonMsg.PropertyInfo getPropertyChangesAdd(int index) {
         return (CommonMsg.PropertyInfo)this.propertyChangesAdd_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getPropertyChangesAddOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.propertyChangesAdd_.get(index);
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
         } else if (!this.hasProperty()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPowerChange()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getProperty().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPropertyChangesCount(); ++i) {
               if (!this.getPropertyChanges(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getPropertyChangesAddCount(); ++i) {
               if (!this.getPropertyChangesAdd(i).isInitialized()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getProperty());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.lvUp_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.powerChange_);
         }

         for(int i = 0; i < this.propertyChanges_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.propertyChanges_.get(i));
         }

         for(int i = 0; i < this.propertyChangesAdd_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.propertyChangesAdd_.get(i));
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
               size += CodedOutputStream.computeMessageSize(2, this.getProperty());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.lvUp_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.powerChange_);
            }

            for(int i = 0; i < this.propertyChanges_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.propertyChanges_.get(i));
            }

            for(int i = 0; i < this.propertyChangesAdd_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.propertyChangesAdd_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RefineUpgradeResult_7010)) {
            return super.equals(obj);
         } else {
            S2C_RefineUpgradeResult_7010 other = (S2C_RefineUpgradeResult_7010)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasProperty() != other.hasProperty()) {
               return false;
            } else if (this.hasProperty() && !this.getProperty().equals(other.getProperty())) {
               return false;
            } else if (this.hasLvUp() != other.hasLvUp()) {
               return false;
            } else if (this.hasLvUp() && this.getLvUp() != other.getLvUp()) {
               return false;
            } else if (this.hasPowerChange() != other.hasPowerChange()) {
               return false;
            } else if (this.hasPowerChange() && this.getPowerChange() != other.getPowerChange()) {
               return false;
            } else if (!this.getPropertyChangesList().equals(other.getPropertyChangesList())) {
               return false;
            } else if (!this.getPropertyChangesAddList().equals(other.getPropertyChangesAddList())) {
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

            if (this.hasProperty()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getProperty().hashCode();
            }

            if (this.hasLvUp()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLvUp();
            }

            if (this.hasPowerChange()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPowerChange();
            }

            if (this.getPropertyChangesCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getPropertyChangesList().hashCode();
            }

            if (this.getPropertyChangesAddCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getPropertyChangesAddList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RefineUpgradeResult_7010 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RefineUpgradeResult_7010)PARSER.parseFrom(data);
      }

      public static S2C_RefineUpgradeResult_7010 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefineUpgradeResult_7010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefineUpgradeResult_7010 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RefineUpgradeResult_7010)PARSER.parseFrom(data);
      }

      public static S2C_RefineUpgradeResult_7010 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefineUpgradeResult_7010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefineUpgradeResult_7010 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RefineUpgradeResult_7010)PARSER.parseFrom(data);
      }

      public static S2C_RefineUpgradeResult_7010 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RefineUpgradeResult_7010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RefineUpgradeResult_7010 parseFrom(InputStream input) throws IOException {
         return (S2C_RefineUpgradeResult_7010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefineUpgradeResult_7010 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefineUpgradeResult_7010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefineUpgradeResult_7010 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RefineUpgradeResult_7010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RefineUpgradeResult_7010 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefineUpgradeResult_7010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RefineUpgradeResult_7010 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RefineUpgradeResult_7010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RefineUpgradeResult_7010 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RefineUpgradeResult_7010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RefineUpgradeResult_7010 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RefineUpgradeResult_7010 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RefineUpgradeResult_7010> parser() {
         return PARSER;
      }

      public Parser<S2C_RefineUpgradeResult_7010> getParserForType() {
         return PARSER;
      }

      public S2C_RefineUpgradeResult_7010 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RefineUpgradeResult_7010OrBuilder {
         private int bitField0_;
         private int result_;
         private ArtifactProperty property_;
         private SingleFieldBuilderV3<ArtifactProperty, ArtifactProperty.Builder, ArtifactPropertyOrBuilder> propertyBuilder_;
         private int lvUp_;
         private int powerChange_;
         private List<CommonMsg.PropertyInfo> propertyChanges_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> propertyChangesBuilder_;
         private List<CommonMsg.PropertyInfo> propertyChangesAdd_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> propertyChangesAddBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_RefineUpgradeResult_7010_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_RefineUpgradeResult_7010_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RefineUpgradeResult_7010.class, Builder.class);
         }

         private Builder() {
            this.propertyChanges_ = Collections.emptyList();
            this.propertyChangesAdd_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.propertyChanges_ = Collections.emptyList();
            this.propertyChangesAdd_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactMsg.S2C_RefineUpgradeResult_7010.alwaysUseFieldBuilders) {
               this.getPropertyFieldBuilder();
               this.getPropertyChangesFieldBuilder();
               this.getPropertyChangesAddFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.propertyBuilder_ == null) {
               this.property_ = null;
            } else {
               this.propertyBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.lvUp_ = 0;
            this.bitField0_ &= -5;
            this.powerChange_ = 0;
            this.bitField0_ &= -9;
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChanges_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.propertyChangesBuilder_.clear();
            }

            if (this.propertyChangesAddBuilder_ == null) {
               this.propertyChangesAdd_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.propertyChangesAddBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_RefineUpgradeResult_7010_descriptor;
         }

         public S2C_RefineUpgradeResult_7010 getDefaultInstanceForType() {
            return ArtifactMsg.S2C_RefineUpgradeResult_7010.getDefaultInstance();
         }

         public S2C_RefineUpgradeResult_7010 build() {
            S2C_RefineUpgradeResult_7010 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RefineUpgradeResult_7010 buildPartial() {
            S2C_RefineUpgradeResult_7010 result = new S2C_RefineUpgradeResult_7010(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.propertyBuilder_ == null) {
                  result.property_ = this.property_;
               } else {
                  result.property_ = (ArtifactProperty)this.propertyBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.lvUp_ = this.lvUp_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.powerChange_ = this.powerChange_;
               to_bitField0_ |= 8;
            }

            if (this.propertyChangesBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.propertyChanges_ = Collections.unmodifiableList(this.propertyChanges_);
                  this.bitField0_ &= -17;
               }

               result.propertyChanges_ = this.propertyChanges_;
            } else {
               result.propertyChanges_ = this.propertyChangesBuilder_.build();
            }

            if (this.propertyChangesAddBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.propertyChangesAdd_ = Collections.unmodifiableList(this.propertyChangesAdd_);
                  this.bitField0_ &= -33;
               }

               result.propertyChangesAdd_ = this.propertyChangesAdd_;
            } else {
               result.propertyChangesAdd_ = this.propertyChangesAddBuilder_.build();
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
            if (other instanceof S2C_RefineUpgradeResult_7010) {
               return this.mergeFrom((S2C_RefineUpgradeResult_7010)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RefineUpgradeResult_7010 other) {
            if (other == ArtifactMsg.S2C_RefineUpgradeResult_7010.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasProperty()) {
                  this.mergeProperty(other.getProperty());
               }

               if (other.hasLvUp()) {
                  this.setLvUp(other.getLvUp());
               }

               if (other.hasPowerChange()) {
                  this.setPowerChange(other.getPowerChange());
               }

               if (this.propertyChangesBuilder_ == null) {
                  if (!other.propertyChanges_.isEmpty()) {
                     if (this.propertyChanges_.isEmpty()) {
                        this.propertyChanges_ = other.propertyChanges_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensurePropertyChangesIsMutable();
                        this.propertyChanges_.addAll(other.propertyChanges_);
                     }

                     this.onChanged();
                  }
               } else if (!other.propertyChanges_.isEmpty()) {
                  if (this.propertyChangesBuilder_.isEmpty()) {
                     this.propertyChangesBuilder_.dispose();
                     this.propertyChangesBuilder_ = null;
                     this.propertyChanges_ = other.propertyChanges_;
                     this.bitField0_ &= -17;
                     this.propertyChangesBuilder_ = ArtifactMsg.S2C_RefineUpgradeResult_7010.alwaysUseFieldBuilders ? this.getPropertyChangesFieldBuilder() : null;
                  } else {
                     this.propertyChangesBuilder_.addAllMessages(other.propertyChanges_);
                  }
               }

               if (this.propertyChangesAddBuilder_ == null) {
                  if (!other.propertyChangesAdd_.isEmpty()) {
                     if (this.propertyChangesAdd_.isEmpty()) {
                        this.propertyChangesAdd_ = other.propertyChangesAdd_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensurePropertyChangesAddIsMutable();
                        this.propertyChangesAdd_.addAll(other.propertyChangesAdd_);
                     }

                     this.onChanged();
                  }
               } else if (!other.propertyChangesAdd_.isEmpty()) {
                  if (this.propertyChangesAddBuilder_.isEmpty()) {
                     this.propertyChangesAddBuilder_.dispose();
                     this.propertyChangesAddBuilder_ = null;
                     this.propertyChangesAdd_ = other.propertyChangesAdd_;
                     this.bitField0_ &= -33;
                     this.propertyChangesAddBuilder_ = ArtifactMsg.S2C_RefineUpgradeResult_7010.alwaysUseFieldBuilders ? this.getPropertyChangesAddFieldBuilder() : null;
                  } else {
                     this.propertyChangesAddBuilder_.addAllMessages(other.propertyChangesAdd_);
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
            } else if (!this.hasProperty()) {
               return false;
            } else if (!this.hasPowerChange()) {
               return false;
            } else if (!this.getProperty().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getPropertyChangesCount(); ++i) {
                  if (!this.getPropertyChanges(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getPropertyChangesAddCount(); ++i) {
                  if (!this.getPropertyChangesAdd(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RefineUpgradeResult_7010 parsedMessage = null;

            try {
               parsedMessage = (S2C_RefineUpgradeResult_7010)ArtifactMsg.S2C_RefineUpgradeResult_7010.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RefineUpgradeResult_7010)e.getUnfinishedMessage();
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

         public boolean hasProperty() {
            return (this.bitField0_ & 2) != 0;
         }

         public ArtifactProperty getProperty() {
            if (this.propertyBuilder_ == null) {
               return this.property_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.property_;
            } else {
               return (ArtifactProperty)this.propertyBuilder_.getMessage();
            }
         }

         public Builder setProperty(ArtifactProperty value) {
            if (this.propertyBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.property_ = value;
               this.onChanged();
            } else {
               this.propertyBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setProperty(ArtifactProperty.Builder builderForValue) {
            if (this.propertyBuilder_ == null) {
               this.property_ = builderForValue.build();
               this.onChanged();
            } else {
               this.propertyBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeProperty(ArtifactProperty value) {
            if (this.propertyBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.property_ != null && this.property_ != ArtifactMsg.ArtifactProperty.getDefaultInstance()) {
                  this.property_ = ArtifactMsg.ArtifactProperty.newBuilder(this.property_).mergeFrom(value).buildPartial();
               } else {
                  this.property_ = value;
               }

               this.onChanged();
            } else {
               this.propertyBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearProperty() {
            if (this.propertyBuilder_ == null) {
               this.property_ = null;
               this.onChanged();
            } else {
               this.propertyBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public ArtifactProperty.Builder getPropertyBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (ArtifactProperty.Builder)this.getPropertyFieldBuilder().getBuilder();
         }

         public ArtifactPropertyOrBuilder getPropertyOrBuilder() {
            if (this.propertyBuilder_ != null) {
               return (ArtifactPropertyOrBuilder)this.propertyBuilder_.getMessageOrBuilder();
            } else {
               return this.property_ == null ? ArtifactMsg.ArtifactProperty.getDefaultInstance() : this.property_;
            }
         }

         private SingleFieldBuilderV3<ArtifactProperty, ArtifactProperty.Builder, ArtifactPropertyOrBuilder> getPropertyFieldBuilder() {
            if (this.propertyBuilder_ == null) {
               this.propertyBuilder_ = new SingleFieldBuilderV3(this.getProperty(), this.getParentForChildren(), this.isClean());
               this.property_ = null;
            }

            return this.propertyBuilder_;
         }

         public boolean hasLvUp() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLvUp() {
            return this.lvUp_;
         }

         public Builder setLvUp(int value) {
            this.bitField0_ |= 4;
            this.lvUp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLvUp() {
            this.bitField0_ &= -5;
            this.lvUp_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPowerChange() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPowerChange() {
            return this.powerChange_;
         }

         public Builder setPowerChange(int value) {
            this.bitField0_ |= 8;
            this.powerChange_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPowerChange() {
            this.bitField0_ &= -9;
            this.powerChange_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePropertyChangesIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.propertyChanges_ = new ArrayList(this.propertyChanges_);
               this.bitField0_ |= 16;
            }

         }

         public List<CommonMsg.PropertyInfo> getPropertyChangesList() {
            return this.propertyChangesBuilder_ == null ? Collections.unmodifiableList(this.propertyChanges_) : this.propertyChangesBuilder_.getMessageList();
         }

         public int getPropertyChangesCount() {
            return this.propertyChangesBuilder_ == null ? this.propertyChanges_.size() : this.propertyChangesBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getPropertyChanges(int index) {
            return this.propertyChangesBuilder_ == null ? (CommonMsg.PropertyInfo)this.propertyChanges_.get(index) : (CommonMsg.PropertyInfo)this.propertyChangesBuilder_.getMessage(index);
         }

         public Builder setPropertyChanges(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.set(index, value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPropertyChanges(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChanges(CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPropertyChanges(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(index, value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPropertyChanges(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChanges(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPropertyChanges(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.propertyChanges_);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPropertyChanges() {
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChanges_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.clear();
            }

            return this;
         }

         public Builder removePropertyChanges(int index) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.remove(index);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getPropertyChangesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index) {
            return this.propertyChangesBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.propertyChanges_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.propertyChangesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList() {
            return this.propertyChangesBuilder_ != null ? this.propertyChangesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.propertyChanges_);
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getPropertyChangesBuilderList() {
            return this.getPropertyChangesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getPropertyChangesFieldBuilder() {
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChangesBuilder_ = new RepeatedFieldBuilderV3(this.propertyChanges_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.propertyChanges_ = null;
            }

            return this.propertyChangesBuilder_;
         }

         private void ensurePropertyChangesAddIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.propertyChangesAdd_ = new ArrayList(this.propertyChangesAdd_);
               this.bitField0_ |= 32;
            }

         }

         public List<CommonMsg.PropertyInfo> getPropertyChangesAddList() {
            return this.propertyChangesAddBuilder_ == null ? Collections.unmodifiableList(this.propertyChangesAdd_) : this.propertyChangesAddBuilder_.getMessageList();
         }

         public int getPropertyChangesAddCount() {
            return this.propertyChangesAddBuilder_ == null ? this.propertyChangesAdd_.size() : this.propertyChangesAddBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getPropertyChangesAdd(int index) {
            return this.propertyChangesAddBuilder_ == null ? (CommonMsg.PropertyInfo)this.propertyChangesAdd_.get(index) : (CommonMsg.PropertyInfo)this.propertyChangesAddBuilder_.getMessage(index);
         }

         public Builder setPropertyChangesAdd(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesAddBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesAddIsMutable();
               this.propertyChangesAdd_.set(index, value);
               this.onChanged();
            } else {
               this.propertyChangesAddBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPropertyChangesAdd(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesAddBuilder_ == null) {
               this.ensurePropertyChangesAddIsMutable();
               this.propertyChangesAdd_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesAddBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChangesAdd(CommonMsg.PropertyInfo value) {
            if (this.propertyChangesAddBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesAddIsMutable();
               this.propertyChangesAdd_.add(value);
               this.onChanged();
            } else {
               this.propertyChangesAddBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPropertyChangesAdd(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesAddBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesAddIsMutable();
               this.propertyChangesAdd_.add(index, value);
               this.onChanged();
            } else {
               this.propertyChangesAddBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPropertyChangesAdd(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesAddBuilder_ == null) {
               this.ensurePropertyChangesAddIsMutable();
               this.propertyChangesAdd_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesAddBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChangesAdd(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesAddBuilder_ == null) {
               this.ensurePropertyChangesAddIsMutable();
               this.propertyChangesAdd_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesAddBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPropertyChangesAdd(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.propertyChangesAddBuilder_ == null) {
               this.ensurePropertyChangesAddIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.propertyChangesAdd_);
               this.onChanged();
            } else {
               this.propertyChangesAddBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPropertyChangesAdd() {
            if (this.propertyChangesAddBuilder_ == null) {
               this.propertyChangesAdd_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.propertyChangesAddBuilder_.clear();
            }

            return this;
         }

         public Builder removePropertyChangesAdd(int index) {
            if (this.propertyChangesAddBuilder_ == null) {
               this.ensurePropertyChangesAddIsMutable();
               this.propertyChangesAdd_.remove(index);
               this.onChanged();
            } else {
               this.propertyChangesAddBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getPropertyChangesAddBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesAddFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getPropertyChangesAddOrBuilder(int index) {
            return this.propertyChangesAddBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.propertyChangesAdd_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.propertyChangesAddBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesAddOrBuilderList() {
            return this.propertyChangesAddBuilder_ != null ? this.propertyChangesAddBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.propertyChangesAdd_);
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesAddBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesAddFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesAddBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesAddFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getPropertyChangesAddBuilderList() {
            return this.getPropertyChangesAddFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getPropertyChangesAddFieldBuilder() {
            if (this.propertyChangesAddBuilder_ == null) {
               this.propertyChangesAddBuilder_ = new RepeatedFieldBuilderV3(this.propertyChangesAdd_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.propertyChangesAdd_ = null;
            }

            return this.propertyChangesAddBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TakeTask_7011 extends GeneratedMessageV3 implements C2S_TakeTask_7011OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int TASKID_FIELD_NUMBER = 2;
      private int taskId_;
      public static final int GUIDESTEP_FIELD_NUMBER = 3;
      private int guideStep_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeTask_7011 DEFAULT_INSTANCE = new C2S_TakeTask_7011();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeTask_7011> PARSER = new AbstractParser<C2S_TakeTask_7011>() {
         public C2S_TakeTask_7011 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeTask_7011(input, extensionRegistry);
         }
      };

      private C2S_TakeTask_7011(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeTask_7011() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeTask_7011();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeTask_7011(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.taskId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.guideStep_ = input.readInt32();
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
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_TakeTask_7011_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_TakeTask_7011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeTask_7011.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public boolean hasGuideStep() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getGuideStep() {
         return this.guideStep_;
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
            output.writeInt32(1, this.id_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.taskId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.guideStep_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.taskId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.guideStep_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TakeTask_7011)) {
            return super.equals(obj);
         } else {
            C2S_TakeTask_7011 other = (C2S_TakeTask_7011)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
               return false;
            } else if (this.hasGuideStep() != other.hasGuideStep()) {
               return false;
            } else if (this.hasGuideStep() && this.getGuideStep() != other.getGuideStep()) {
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

            if (this.hasTaskId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTaskId();
            }

            if (this.hasGuideStep()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGuideStep();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TakeTask_7011 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_7011)PARSER.parseFrom(data);
      }

      public static C2S_TakeTask_7011 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_7011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeTask_7011 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_7011)PARSER.parseFrom(data);
      }

      public static C2S_TakeTask_7011 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_7011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeTask_7011 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_7011)PARSER.parseFrom(data);
      }

      public static C2S_TakeTask_7011 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeTask_7011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeTask_7011 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeTask_7011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeTask_7011 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeTask_7011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeTask_7011 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeTask_7011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeTask_7011 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeTask_7011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeTask_7011 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeTask_7011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeTask_7011 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeTask_7011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeTask_7011 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeTask_7011 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeTask_7011> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeTask_7011> getParserForType() {
         return PARSER;
      }

      public C2S_TakeTask_7011 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeTask_7011OrBuilder {
         private int bitField0_;
         private int id_;
         private int taskId_;
         private int guideStep_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_TakeTask_7011_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_TakeTask_7011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeTask_7011.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactMsg.C2S_TakeTask_7011.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.taskId_ = 0;
            this.bitField0_ &= -3;
            this.guideStep_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_TakeTask_7011_descriptor;
         }

         public C2S_TakeTask_7011 getDefaultInstanceForType() {
            return ArtifactMsg.C2S_TakeTask_7011.getDefaultInstance();
         }

         public C2S_TakeTask_7011 build() {
            C2S_TakeTask_7011 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeTask_7011 buildPartial() {
            C2S_TakeTask_7011 result = new C2S_TakeTask_7011(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.taskId_ = this.taskId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.guideStep_ = this.guideStep_;
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
            if (other instanceof C2S_TakeTask_7011) {
               return this.mergeFrom((C2S_TakeTask_7011)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeTask_7011 other) {
            if (other == ArtifactMsg.C2S_TakeTask_7011.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               if (other.hasGuideStep()) {
                  this.setGuideStep(other.getGuideStep());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else {
               return this.hasTaskId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TakeTask_7011 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeTask_7011)ArtifactMsg.C2S_TakeTask_7011.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeTask_7011)e.getUnfinishedMessage();
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

         public boolean hasGuideStep() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getGuideStep() {
            return this.guideStep_;
         }

         public Builder setGuideStep(int value) {
            this.bitField0_ |= 4;
            this.guideStep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGuideStep() {
            this.bitField0_ &= -5;
            this.guideStep_ = 0;
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

   public static final class C2S_CastSoul_7013 extends GeneratedMessageV3 implements C2S_CastSoul_7013OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_CastSoul_7013 DEFAULT_INSTANCE = new C2S_CastSoul_7013();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CastSoul_7013> PARSER = new AbstractParser<C2S_CastSoul_7013>() {
         public C2S_CastSoul_7013 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CastSoul_7013(input, extensionRegistry);
         }
      };

      private C2S_CastSoul_7013(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CastSoul_7013() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CastSoul_7013();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CastSoul_7013(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_CastSoul_7013_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_CastSoul_7013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CastSoul_7013.class, Builder.class);
      }

      public boolean hasNum() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.num_);
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
               size += CodedOutputStream.computeInt32Size(1, this.num_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CastSoul_7013)) {
            return super.equals(obj);
         } else {
            C2S_CastSoul_7013 other = (C2S_CastSoul_7013)obj;
            if (this.hasNum() != other.hasNum()) {
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
            if (this.hasNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CastSoul_7013 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CastSoul_7013)PARSER.parseFrom(data);
      }

      public static C2S_CastSoul_7013 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CastSoul_7013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CastSoul_7013 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CastSoul_7013)PARSER.parseFrom(data);
      }

      public static C2S_CastSoul_7013 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CastSoul_7013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CastSoul_7013 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CastSoul_7013)PARSER.parseFrom(data);
      }

      public static C2S_CastSoul_7013 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CastSoul_7013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CastSoul_7013 parseFrom(InputStream input) throws IOException {
         return (C2S_CastSoul_7013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CastSoul_7013 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CastSoul_7013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CastSoul_7013 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CastSoul_7013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CastSoul_7013 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CastSoul_7013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CastSoul_7013 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CastSoul_7013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CastSoul_7013 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CastSoul_7013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CastSoul_7013 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CastSoul_7013 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CastSoul_7013> parser() {
         return PARSER;
      }

      public Parser<C2S_CastSoul_7013> getParserForType() {
         return PARSER;
      }

      public C2S_CastSoul_7013 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CastSoul_7013OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_CastSoul_7013_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_CastSoul_7013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CastSoul_7013.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactMsg.C2S_CastSoul_7013.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_C2S_CastSoul_7013_descriptor;
         }

         public C2S_CastSoul_7013 getDefaultInstanceForType() {
            return ArtifactMsg.C2S_CastSoul_7013.getDefaultInstance();
         }

         public C2S_CastSoul_7013 build() {
            C2S_CastSoul_7013 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CastSoul_7013 buildPartial() {
            C2S_CastSoul_7013 result = new C2S_CastSoul_7013(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_CastSoul_7013) {
               return this.mergeFrom((C2S_CastSoul_7013)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CastSoul_7013 other) {
            if (other == ArtifactMsg.C2S_CastSoul_7013.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CastSoul_7013 parsedMessage = null;

            try {
               parsedMessage = (C2S_CastSoul_7013)ArtifactMsg.C2S_CastSoul_7013.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CastSoul_7013)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getNum() {
            return this.num_;
         }

         public Builder setNum(int value) {
            this.bitField0_ |= 1;
            this.num_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNum() {
            this.bitField0_ &= -2;
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

   public static final class S2C_CastSoulResult_7014 extends GeneratedMessageV3 implements S2C_CastSoulResult_7014OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int SOULINFO_FIELD_NUMBER = 2;
      private SoulInfo soulInfo_;
      public static final int POWERCHANGE_FIELD_NUMBER = 3;
      private int powerChange_;
      public static final int PROPERTYCHANGES_FIELD_NUMBER = 4;
      private List<CommonMsg.PropertyInfo> propertyChanges_;
      private byte memoizedIsInitialized;
      private static final S2C_CastSoulResult_7014 DEFAULT_INSTANCE = new S2C_CastSoulResult_7014();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CastSoulResult_7014> PARSER = new AbstractParser<S2C_CastSoulResult_7014>() {
         public S2C_CastSoulResult_7014 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CastSoulResult_7014(input, extensionRegistry);
         }
      };

      private S2C_CastSoulResult_7014(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CastSoulResult_7014() {
         this.memoizedIsInitialized = -1;
         this.propertyChanges_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CastSoulResult_7014();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CastSoulResult_7014(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        SoulInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.soulInfo_.toBuilder();
                        }

                        this.soulInfo_ = (SoulInfo)input.readMessage(ArtifactMsg.SoulInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.soulInfo_);
                           this.soulInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.powerChange_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.propertyChanges_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.propertyChanges_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
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
                  this.propertyChanges_ = Collections.unmodifiableList(this.propertyChanges_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_CastSoulResult_7014_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_CastSoulResult_7014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CastSoulResult_7014.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasSoulInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public SoulInfo getSoulInfo() {
         return this.soulInfo_ == null ? ArtifactMsg.SoulInfo.getDefaultInstance() : this.soulInfo_;
      }

      public SoulInfoOrBuilder getSoulInfoOrBuilder() {
         return this.soulInfo_ == null ? ArtifactMsg.SoulInfo.getDefaultInstance() : this.soulInfo_;
      }

      public boolean hasPowerChange() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPowerChange() {
         return this.powerChange_;
      }

      public List<CommonMsg.PropertyInfo> getPropertyChangesList() {
         return this.propertyChanges_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList() {
         return this.propertyChanges_;
      }

      public int getPropertyChangesCount() {
         return this.propertyChanges_.size();
      }

      public CommonMsg.PropertyInfo getPropertyChanges(int index) {
         return (CommonMsg.PropertyInfo)this.propertyChanges_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.propertyChanges_.get(index);
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
         } else if (!this.hasSoulInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPowerChange()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getSoulInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPropertyChangesCount(); ++i) {
               if (!this.getPropertyChanges(i).isInitialized()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getSoulInfo());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.powerChange_);
         }

         for(int i = 0; i < this.propertyChanges_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.propertyChanges_.get(i));
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
               size += CodedOutputStream.computeMessageSize(2, this.getSoulInfo());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.powerChange_);
            }

            for(int i = 0; i < this.propertyChanges_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.propertyChanges_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CastSoulResult_7014)) {
            return super.equals(obj);
         } else {
            S2C_CastSoulResult_7014 other = (S2C_CastSoulResult_7014)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasSoulInfo() != other.hasSoulInfo()) {
               return false;
            } else if (this.hasSoulInfo() && !this.getSoulInfo().equals(other.getSoulInfo())) {
               return false;
            } else if (this.hasPowerChange() != other.hasPowerChange()) {
               return false;
            } else if (this.hasPowerChange() && this.getPowerChange() != other.getPowerChange()) {
               return false;
            } else if (!this.getPropertyChangesList().equals(other.getPropertyChangesList())) {
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

            if (this.hasSoulInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSoulInfo().hashCode();
            }

            if (this.hasPowerChange()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPowerChange();
            }

            if (this.getPropertyChangesCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPropertyChangesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CastSoulResult_7014 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CastSoulResult_7014)PARSER.parseFrom(data);
      }

      public static S2C_CastSoulResult_7014 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CastSoulResult_7014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CastSoulResult_7014 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CastSoulResult_7014)PARSER.parseFrom(data);
      }

      public static S2C_CastSoulResult_7014 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CastSoulResult_7014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CastSoulResult_7014 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CastSoulResult_7014)PARSER.parseFrom(data);
      }

      public static S2C_CastSoulResult_7014 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CastSoulResult_7014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CastSoulResult_7014 parseFrom(InputStream input) throws IOException {
         return (S2C_CastSoulResult_7014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CastSoulResult_7014 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CastSoulResult_7014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CastSoulResult_7014 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CastSoulResult_7014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CastSoulResult_7014 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CastSoulResult_7014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CastSoulResult_7014 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CastSoulResult_7014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CastSoulResult_7014 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CastSoulResult_7014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CastSoulResult_7014 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CastSoulResult_7014 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CastSoulResult_7014> parser() {
         return PARSER;
      }

      public Parser<S2C_CastSoulResult_7014> getParserForType() {
         return PARSER;
      }

      public S2C_CastSoulResult_7014 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CastSoulResult_7014OrBuilder {
         private int bitField0_;
         private int result_;
         private SoulInfo soulInfo_;
         private SingleFieldBuilderV3<SoulInfo, SoulInfo.Builder, SoulInfoOrBuilder> soulInfoBuilder_;
         private int powerChange_;
         private List<CommonMsg.PropertyInfo> propertyChanges_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> propertyChangesBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_CastSoulResult_7014_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_CastSoulResult_7014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CastSoulResult_7014.class, Builder.class);
         }

         private Builder() {
            this.propertyChanges_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.propertyChanges_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactMsg.S2C_CastSoulResult_7014.alwaysUseFieldBuilders) {
               this.getSoulInfoFieldBuilder();
               this.getPropertyChangesFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            if (this.soulInfoBuilder_ == null) {
               this.soulInfo_ = null;
            } else {
               this.soulInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            this.powerChange_ = 0;
            this.bitField0_ &= -5;
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChanges_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.propertyChangesBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_CastSoulResult_7014_descriptor;
         }

         public S2C_CastSoulResult_7014 getDefaultInstanceForType() {
            return ArtifactMsg.S2C_CastSoulResult_7014.getDefaultInstance();
         }

         public S2C_CastSoulResult_7014 build() {
            S2C_CastSoulResult_7014 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CastSoulResult_7014 buildPartial() {
            S2C_CastSoulResult_7014 result = new S2C_CastSoulResult_7014(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.soulInfoBuilder_ == null) {
                  result.soulInfo_ = this.soulInfo_;
               } else {
                  result.soulInfo_ = (SoulInfo)this.soulInfoBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.powerChange_ = this.powerChange_;
               to_bitField0_ |= 4;
            }

            if (this.propertyChangesBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.propertyChanges_ = Collections.unmodifiableList(this.propertyChanges_);
                  this.bitField0_ &= -9;
               }

               result.propertyChanges_ = this.propertyChanges_;
            } else {
               result.propertyChanges_ = this.propertyChangesBuilder_.build();
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
            if (other instanceof S2C_CastSoulResult_7014) {
               return this.mergeFrom((S2C_CastSoulResult_7014)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CastSoulResult_7014 other) {
            if (other == ArtifactMsg.S2C_CastSoulResult_7014.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasSoulInfo()) {
                  this.mergeSoulInfo(other.getSoulInfo());
               }

               if (other.hasPowerChange()) {
                  this.setPowerChange(other.getPowerChange());
               }

               if (this.propertyChangesBuilder_ == null) {
                  if (!other.propertyChanges_.isEmpty()) {
                     if (this.propertyChanges_.isEmpty()) {
                        this.propertyChanges_ = other.propertyChanges_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensurePropertyChangesIsMutable();
                        this.propertyChanges_.addAll(other.propertyChanges_);
                     }

                     this.onChanged();
                  }
               } else if (!other.propertyChanges_.isEmpty()) {
                  if (this.propertyChangesBuilder_.isEmpty()) {
                     this.propertyChangesBuilder_.dispose();
                     this.propertyChangesBuilder_ = null;
                     this.propertyChanges_ = other.propertyChanges_;
                     this.bitField0_ &= -9;
                     this.propertyChangesBuilder_ = ArtifactMsg.S2C_CastSoulResult_7014.alwaysUseFieldBuilders ? this.getPropertyChangesFieldBuilder() : null;
                  } else {
                     this.propertyChangesBuilder_.addAllMessages(other.propertyChanges_);
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
            } else if (!this.hasSoulInfo()) {
               return false;
            } else if (!this.hasPowerChange()) {
               return false;
            } else if (!this.getSoulInfo().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getPropertyChangesCount(); ++i) {
                  if (!this.getPropertyChanges(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CastSoulResult_7014 parsedMessage = null;

            try {
               parsedMessage = (S2C_CastSoulResult_7014)ArtifactMsg.S2C_CastSoulResult_7014.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CastSoulResult_7014)e.getUnfinishedMessage();
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

         public boolean hasSoulInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public SoulInfo getSoulInfo() {
            if (this.soulInfoBuilder_ == null) {
               return this.soulInfo_ == null ? ArtifactMsg.SoulInfo.getDefaultInstance() : this.soulInfo_;
            } else {
               return (SoulInfo)this.soulInfoBuilder_.getMessage();
            }
         }

         public Builder setSoulInfo(SoulInfo value) {
            if (this.soulInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.soulInfo_ = value;
               this.onChanged();
            } else {
               this.soulInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setSoulInfo(SoulInfo.Builder builderForValue) {
            if (this.soulInfoBuilder_ == null) {
               this.soulInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.soulInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeSoulInfo(SoulInfo value) {
            if (this.soulInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.soulInfo_ != null && this.soulInfo_ != ArtifactMsg.SoulInfo.getDefaultInstance()) {
                  this.soulInfo_ = ArtifactMsg.SoulInfo.newBuilder(this.soulInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.soulInfo_ = value;
               }

               this.onChanged();
            } else {
               this.soulInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearSoulInfo() {
            if (this.soulInfoBuilder_ == null) {
               this.soulInfo_ = null;
               this.onChanged();
            } else {
               this.soulInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public SoulInfo.Builder getSoulInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (SoulInfo.Builder)this.getSoulInfoFieldBuilder().getBuilder();
         }

         public SoulInfoOrBuilder getSoulInfoOrBuilder() {
            if (this.soulInfoBuilder_ != null) {
               return (SoulInfoOrBuilder)this.soulInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.soulInfo_ == null ? ArtifactMsg.SoulInfo.getDefaultInstance() : this.soulInfo_;
            }
         }

         private SingleFieldBuilderV3<SoulInfo, SoulInfo.Builder, SoulInfoOrBuilder> getSoulInfoFieldBuilder() {
            if (this.soulInfoBuilder_ == null) {
               this.soulInfoBuilder_ = new SingleFieldBuilderV3(this.getSoulInfo(), this.getParentForChildren(), this.isClean());
               this.soulInfo_ = null;
            }

            return this.soulInfoBuilder_;
         }

         public boolean hasPowerChange() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPowerChange() {
            return this.powerChange_;
         }

         public Builder setPowerChange(int value) {
            this.bitField0_ |= 4;
            this.powerChange_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPowerChange() {
            this.bitField0_ &= -5;
            this.powerChange_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePropertyChangesIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.propertyChanges_ = new ArrayList(this.propertyChanges_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommonMsg.PropertyInfo> getPropertyChangesList() {
            return this.propertyChangesBuilder_ == null ? Collections.unmodifiableList(this.propertyChanges_) : this.propertyChangesBuilder_.getMessageList();
         }

         public int getPropertyChangesCount() {
            return this.propertyChangesBuilder_ == null ? this.propertyChanges_.size() : this.propertyChangesBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getPropertyChanges(int index) {
            return this.propertyChangesBuilder_ == null ? (CommonMsg.PropertyInfo)this.propertyChanges_.get(index) : (CommonMsg.PropertyInfo)this.propertyChangesBuilder_.getMessage(index);
         }

         public Builder setPropertyChanges(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.set(index, value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPropertyChanges(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChanges(CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPropertyChanges(int index, CommonMsg.PropertyInfo value) {
            if (this.propertyChangesBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(index, value);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPropertyChanges(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPropertyChanges(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPropertyChanges(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.propertyChanges_);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPropertyChanges() {
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChanges_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.clear();
            }

            return this;
         }

         public Builder removePropertyChanges(int index) {
            if (this.propertyChangesBuilder_ == null) {
               this.ensurePropertyChangesIsMutable();
               this.propertyChanges_.remove(index);
               this.onChanged();
            } else {
               this.propertyChangesBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getPropertyChangesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index) {
            return this.propertyChangesBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.propertyChanges_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.propertyChangesBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList() {
            return this.propertyChangesBuilder_ != null ? this.propertyChangesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.propertyChanges_);
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addPropertyChangesBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getPropertyChangesFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getPropertyChangesBuilderList() {
            return this.getPropertyChangesFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getPropertyChangesFieldBuilder() {
            if (this.propertyChangesBuilder_ == null) {
               this.propertyChangesBuilder_ = new RepeatedFieldBuilderV3(this.propertyChanges_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.propertyChanges_ = null;
            }

            return this.propertyChangesBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_UpdateTask_7015 extends GeneratedMessageV3 implements S2C_UpdateTask_7015OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKS_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> tasks_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateTask_7015 DEFAULT_INSTANCE = new S2C_UpdateTask_7015();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateTask_7015> PARSER = new AbstractParser<S2C_UpdateTask_7015>() {
         public S2C_UpdateTask_7015 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateTask_7015(input, extensionRegistry);
         }
      };

      private S2C_UpdateTask_7015(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateTask_7015() {
         this.memoizedIsInitialized = -1;
         this.tasks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateTask_7015();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateTask_7015(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_UpdateTask_7015_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_UpdateTask_7015_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTask_7015.class, Builder.class);
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
         } else if (!(obj instanceof S2C_UpdateTask_7015)) {
            return super.equals(obj);
         } else {
            S2C_UpdateTask_7015 other = (S2C_UpdateTask_7015)obj;
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

      public static S2C_UpdateTask_7015 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_7015)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTask_7015 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_7015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTask_7015 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_7015)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTask_7015 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_7015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTask_7015 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_7015)PARSER.parseFrom(data);
      }

      public static S2C_UpdateTask_7015 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateTask_7015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateTask_7015 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateTask_7015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTask_7015 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTask_7015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTask_7015 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateTask_7015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateTask_7015 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTask_7015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateTask_7015 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateTask_7015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateTask_7015 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateTask_7015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateTask_7015 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateTask_7015 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateTask_7015> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateTask_7015> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateTask_7015 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateTask_7015OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> tasks_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> tasksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_UpdateTask_7015_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_UpdateTask_7015_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateTask_7015.class, Builder.class);
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
            if (ArtifactMsg.S2C_UpdateTask_7015.alwaysUseFieldBuilders) {
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
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_UpdateTask_7015_descriptor;
         }

         public S2C_UpdateTask_7015 getDefaultInstanceForType() {
            return ArtifactMsg.S2C_UpdateTask_7015.getDefaultInstance();
         }

         public S2C_UpdateTask_7015 build() {
            S2C_UpdateTask_7015 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateTask_7015 buildPartial() {
            S2C_UpdateTask_7015 result = new S2C_UpdateTask_7015(this);
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
            if (other instanceof S2C_UpdateTask_7015) {
               return this.mergeFrom((S2C_UpdateTask_7015)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateTask_7015 other) {
            if (other == ArtifactMsg.S2C_UpdateTask_7015.getDefaultInstance()) {
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
                     this.tasksBuilder_ = ArtifactMsg.S2C_UpdateTask_7015.alwaysUseFieldBuilders ? this.getTasksFieldBuilder() : null;
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
            S2C_UpdateTask_7015 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateTask_7015)ArtifactMsg.S2C_UpdateTask_7015.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateTask_7015)e.getUnfinishedMessage();
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

   public static final class S2C_UnlockArtifact_7016 extends GeneratedMessageV3 implements S2C_UnlockArtifact_7016OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private ArtifactInfo info_;
      public static final int NEXTID_FIELD_NUMBER = 2;
      private int nextId_;
      public static final int LVPROPERTYS_FIELD_NUMBER = 3;
      private List<CommonMsg.PropertyInfo> lvPropertys_;
      private byte memoizedIsInitialized;
      private static final S2C_UnlockArtifact_7016 DEFAULT_INSTANCE = new S2C_UnlockArtifact_7016();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnlockArtifact_7016> PARSER = new AbstractParser<S2C_UnlockArtifact_7016>() {
         public S2C_UnlockArtifact_7016 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnlockArtifact_7016(input, extensionRegistry);
         }
      };

      private S2C_UnlockArtifact_7016(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnlockArtifact_7016() {
         this.memoizedIsInitialized = -1;
         this.lvPropertys_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnlockArtifact_7016();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnlockArtifact_7016(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ArtifactInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (ArtifactInfo)input.readMessage(ArtifactMsg.ArtifactInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.nextId_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.lvPropertys_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.lvPropertys_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
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
                  this.lvPropertys_ = Collections.unmodifiableList(this.lvPropertys_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_UnlockArtifact_7016_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_UnlockArtifact_7016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockArtifact_7016.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public ArtifactInfo getInfo() {
         return this.info_ == null ? ArtifactMsg.ArtifactInfo.getDefaultInstance() : this.info_;
      }

      public ArtifactInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? ArtifactMsg.ArtifactInfo.getDefaultInstance() : this.info_;
      }

      public boolean hasNextId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getNextId() {
         return this.nextId_;
      }

      public List<CommonMsg.PropertyInfo> getLvPropertysList() {
         return this.lvPropertys_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getLvPropertysOrBuilderList() {
         return this.lvPropertys_;
      }

      public int getLvPropertysCount() {
         return this.lvPropertys_.size();
      }

      public CommonMsg.PropertyInfo getLvPropertys(int index) {
         return (CommonMsg.PropertyInfo)this.lvPropertys_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getLvPropertysOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.lvPropertys_.get(index);
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
            for(int i = 0; i < this.getLvPropertysCount(); ++i) {
               if (!this.getLvPropertys(i).isInitialized()) {
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
            output.writeMessage(1, this.getInfo());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.nextId_);
         }

         for(int i = 0; i < this.lvPropertys_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.lvPropertys_.get(i));
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.nextId_);
            }

            for(int i = 0; i < this.lvPropertys_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.lvPropertys_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UnlockArtifact_7016)) {
            return super.equals(obj);
         } else {
            S2C_UnlockArtifact_7016 other = (S2C_UnlockArtifact_7016)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else if (this.hasNextId() != other.hasNextId()) {
               return false;
            } else if (this.hasNextId() && this.getNextId() != other.getNextId()) {
               return false;
            } else if (!this.getLvPropertysList().equals(other.getLvPropertysList())) {
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

            if (this.hasNextId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNextId();
            }

            if (this.getLvPropertysCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLvPropertysList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UnlockArtifact_7016 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnlockArtifact_7016)PARSER.parseFrom(data);
      }

      public static S2C_UnlockArtifact_7016 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockArtifact_7016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockArtifact_7016 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnlockArtifact_7016)PARSER.parseFrom(data);
      }

      public static S2C_UnlockArtifact_7016 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockArtifact_7016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockArtifact_7016 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnlockArtifact_7016)PARSER.parseFrom(data);
      }

      public static S2C_UnlockArtifact_7016 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockArtifact_7016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockArtifact_7016 parseFrom(InputStream input) throws IOException {
         return (S2C_UnlockArtifact_7016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockArtifact_7016 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockArtifact_7016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockArtifact_7016 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnlockArtifact_7016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnlockArtifact_7016 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockArtifact_7016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockArtifact_7016 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnlockArtifact_7016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockArtifact_7016 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockArtifact_7016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnlockArtifact_7016 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnlockArtifact_7016 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnlockArtifact_7016> parser() {
         return PARSER;
      }

      public Parser<S2C_UnlockArtifact_7016> getParserForType() {
         return PARSER;
      }

      public S2C_UnlockArtifact_7016 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnlockArtifact_7016OrBuilder {
         private int bitField0_;
         private ArtifactInfo info_;
         private SingleFieldBuilderV3<ArtifactInfo, ArtifactInfo.Builder, ArtifactInfoOrBuilder> infoBuilder_;
         private int nextId_;
         private List<CommonMsg.PropertyInfo> lvPropertys_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> lvPropertysBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_UnlockArtifact_7016_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_UnlockArtifact_7016_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockArtifact_7016.class, Builder.class);
         }

         private Builder() {
            this.lvPropertys_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.lvPropertys_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ArtifactMsg.S2C_UnlockArtifact_7016.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
               this.getLvPropertysFieldBuilder();
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
            this.nextId_ = 0;
            this.bitField0_ &= -3;
            if (this.lvPropertysBuilder_ == null) {
               this.lvPropertys_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.lvPropertysBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ArtifactMsg.internal_static_artifact_com_gzbz_protobuf_S2C_UnlockArtifact_7016_descriptor;
         }

         public S2C_UnlockArtifact_7016 getDefaultInstanceForType() {
            return ArtifactMsg.S2C_UnlockArtifact_7016.getDefaultInstance();
         }

         public S2C_UnlockArtifact_7016 build() {
            S2C_UnlockArtifact_7016 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnlockArtifact_7016 buildPartial() {
            S2C_UnlockArtifact_7016 result = new S2C_UnlockArtifact_7016(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (ArtifactInfo)this.infoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.nextId_ = this.nextId_;
               to_bitField0_ |= 2;
            }

            if (this.lvPropertysBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.lvPropertys_ = Collections.unmodifiableList(this.lvPropertys_);
                  this.bitField0_ &= -5;
               }

               result.lvPropertys_ = this.lvPropertys_;
            } else {
               result.lvPropertys_ = this.lvPropertysBuilder_.build();
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
            if (other instanceof S2C_UnlockArtifact_7016) {
               return this.mergeFrom((S2C_UnlockArtifact_7016)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnlockArtifact_7016 other) {
            if (other == ArtifactMsg.S2C_UnlockArtifact_7016.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               if (other.hasNextId()) {
                  this.setNextId(other.getNextId());
               }

               if (this.lvPropertysBuilder_ == null) {
                  if (!other.lvPropertys_.isEmpty()) {
                     if (this.lvPropertys_.isEmpty()) {
                        this.lvPropertys_ = other.lvPropertys_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureLvPropertysIsMutable();
                        this.lvPropertys_.addAll(other.lvPropertys_);
                     }

                     this.onChanged();
                  }
               } else if (!other.lvPropertys_.isEmpty()) {
                  if (this.lvPropertysBuilder_.isEmpty()) {
                     this.lvPropertysBuilder_.dispose();
                     this.lvPropertysBuilder_ = null;
                     this.lvPropertys_ = other.lvPropertys_;
                     this.bitField0_ &= -5;
                     this.lvPropertysBuilder_ = ArtifactMsg.S2C_UnlockArtifact_7016.alwaysUseFieldBuilders ? this.getLvPropertysFieldBuilder() : null;
                  } else {
                     this.lvPropertysBuilder_.addAllMessages(other.lvPropertys_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else if (!this.getInfo().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getLvPropertysCount(); ++i) {
                  if (!this.getLvPropertys(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UnlockArtifact_7016 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnlockArtifact_7016)ArtifactMsg.S2C_UnlockArtifact_7016.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnlockArtifact_7016)e.getUnfinishedMessage();
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

         public ArtifactInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? ArtifactMsg.ArtifactInfo.getDefaultInstance() : this.info_;
            } else {
               return (ArtifactInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(ArtifactInfo value) {
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

         public Builder setInfo(ArtifactInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(ArtifactInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != ArtifactMsg.ArtifactInfo.getDefaultInstance()) {
                  this.info_ = ArtifactMsg.ArtifactInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public ArtifactInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (ArtifactInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public ArtifactInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (ArtifactInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? ArtifactMsg.ArtifactInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<ArtifactInfo, ArtifactInfo.Builder, ArtifactInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public boolean hasNextId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getNextId() {
            return this.nextId_;
         }

         public Builder setNextId(int value) {
            this.bitField0_ |= 2;
            this.nextId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNextId() {
            this.bitField0_ &= -3;
            this.nextId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureLvPropertysIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.lvPropertys_ = new ArrayList(this.lvPropertys_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.PropertyInfo> getLvPropertysList() {
            return this.lvPropertysBuilder_ == null ? Collections.unmodifiableList(this.lvPropertys_) : this.lvPropertysBuilder_.getMessageList();
         }

         public int getLvPropertysCount() {
            return this.lvPropertysBuilder_ == null ? this.lvPropertys_.size() : this.lvPropertysBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getLvPropertys(int index) {
            return this.lvPropertysBuilder_ == null ? (CommonMsg.PropertyInfo)this.lvPropertys_.get(index) : (CommonMsg.PropertyInfo)this.lvPropertysBuilder_.getMessage(index);
         }

         public Builder setLvPropertys(int index, CommonMsg.PropertyInfo value) {
            if (this.lvPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLvPropertysIsMutable();
               this.lvPropertys_.set(index, value);
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setLvPropertys(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.lvPropertysBuilder_ == null) {
               this.ensureLvPropertysIsMutable();
               this.lvPropertys_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addLvPropertys(CommonMsg.PropertyInfo value) {
            if (this.lvPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLvPropertysIsMutable();
               this.lvPropertys_.add(value);
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addLvPropertys(int index, CommonMsg.PropertyInfo value) {
            if (this.lvPropertysBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLvPropertysIsMutable();
               this.lvPropertys_.add(index, value);
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addLvPropertys(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.lvPropertysBuilder_ == null) {
               this.ensureLvPropertysIsMutable();
               this.lvPropertys_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addLvPropertys(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.lvPropertysBuilder_ == null) {
               this.ensureLvPropertysIsMutable();
               this.lvPropertys_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllLvPropertys(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.lvPropertysBuilder_ == null) {
               this.ensureLvPropertysIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.lvPropertys_);
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearLvPropertys() {
            if (this.lvPropertysBuilder_ == null) {
               this.lvPropertys_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.clear();
            }

            return this;
         }

         public Builder removeLvPropertys(int index) {
            if (this.lvPropertysBuilder_ == null) {
               this.ensureLvPropertysIsMutable();
               this.lvPropertys_.remove(index);
               this.onChanged();
            } else {
               this.lvPropertysBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getLvPropertysBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getLvPropertysFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getLvPropertysOrBuilder(int index) {
            return this.lvPropertysBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.lvPropertys_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.lvPropertysBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getLvPropertysOrBuilderList() {
            return this.lvPropertysBuilder_ != null ? this.lvPropertysBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.lvPropertys_);
         }

         public CommonMsg.PropertyInfo.Builder addLvPropertysBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getLvPropertysFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addLvPropertysBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getLvPropertysFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getLvPropertysBuilderList() {
            return this.getLvPropertysFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getLvPropertysFieldBuilder() {
            if (this.lvPropertysBuilder_ == null) {
               this.lvPropertysBuilder_ = new RepeatedFieldBuilderV3(this.lvPropertys_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.lvPropertys_ = null;
            }

            return this.lvPropertysBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface ArtifactInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasUnlock();

      int getUnlock();

      List<CommonMsg.Task> getTasksList();

      CommonMsg.Task getTasks(int index);

      int getTasksCount();

      List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList();

      CommonMsg.TaskOrBuilder getTasksOrBuilder(int index);
   }

   public interface ArtifactPropertyOrBuilder extends MessageOrBuilder {
      boolean hasStrongLv();

      int getStrongLv();

      boolean hasStrongExp();

      int getStrongExp();

      boolean hasRefineLv();

      int getRefineLv();

      boolean hasSkillLv();

      int getSkillLv();

      List<CommonMsg.PropertyInfo> getLvPropertysList();

      CommonMsg.PropertyInfo getLvPropertys(int index);

      int getLvPropertysCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getLvPropertysOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getLvPropertysOrBuilder(int index);

      List<CommonMsg.PropertyInfo> getRefinepropertysList();

      CommonMsg.PropertyInfo getRefinepropertys(int index);

      int getRefinepropertysCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getRefinepropertysOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getRefinepropertysOrBuilder(int index);

      List<CommonMsg.PropertyInfo> getRefinepropertysAddList();

      CommonMsg.PropertyInfo getRefinepropertysAdd(int index);

      int getRefinepropertysAddCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getRefinepropertysAddOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getRefinepropertysAddOrBuilder(int index);
   }

   public interface C2S_CastSoul_7013OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_Main_7001OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_RefineUpgrade_7009OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SkillUpgrade_7007OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Strong_7005OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TakeTask_7011OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasTaskId();

      int getTaskId();

      boolean hasGuideStep();

      int getGuideStep();
   }

   public interface S2C_CastSoulResult_7014OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasSoulInfo();

      SoulInfo getSoulInfo();

      SoulInfoOrBuilder getSoulInfoOrBuilder();

      boolean hasPowerChange();

      int getPowerChange();

      List<CommonMsg.PropertyInfo> getPropertyChangesList();

      CommonMsg.PropertyInfo getPropertyChanges(int index);

      int getPropertyChangesCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index);
   }

   public interface S2C_MainResult_7002OrBuilder extends MessageOrBuilder {
      List<ArtifactInfo> getArtifactInfosList();

      ArtifactInfo getArtifactInfos(int index);

      int getArtifactInfosCount();

      List<? extends ArtifactInfoOrBuilder> getArtifactInfosOrBuilderList();

      ArtifactInfoOrBuilder getArtifactInfosOrBuilder(int index);

      boolean hasSoulInfo();

      SoulInfo getSoulInfo();

      SoulInfoOrBuilder getSoulInfoOrBuilder();

      boolean hasArtifactProperty();

      ArtifactProperty getArtifactProperty();

      ArtifactPropertyOrBuilder getArtifactPropertyOrBuilder();
   }

   public interface S2C_RefineUpgradeResult_7010OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasProperty();

      ArtifactProperty getProperty();

      ArtifactPropertyOrBuilder getPropertyOrBuilder();

      boolean hasLvUp();

      int getLvUp();

      boolean hasPowerChange();

      int getPowerChange();

      List<CommonMsg.PropertyInfo> getPropertyChangesList();

      CommonMsg.PropertyInfo getPropertyChanges(int index);

      int getPropertyChangesCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index);

      List<CommonMsg.PropertyInfo> getPropertyChangesAddList();

      CommonMsg.PropertyInfo getPropertyChangesAdd(int index);

      int getPropertyChangesAddCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesAddOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getPropertyChangesAddOrBuilder(int index);
   }

   public interface S2C_SkillUpgradeResult_7008OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasProperty();

      ArtifactProperty getProperty();

      ArtifactPropertyOrBuilder getPropertyOrBuilder();
   }

   public interface S2C_StrongResult_7006OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasProperty();

      ArtifactProperty getProperty();

      ArtifactPropertyOrBuilder getPropertyOrBuilder();

      boolean hasLvUp();

      int getLvUp();

      boolean hasPowerChange();

      int getPowerChange();

      List<CommonMsg.PropertyInfo> getPropertyChangesList();

      CommonMsg.PropertyInfo getPropertyChanges(int index);

      int getPropertyChangesCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyChangesOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getPropertyChangesOrBuilder(int index);
   }

   public interface S2C_UnlockArtifact_7016OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      ArtifactInfo getInfo();

      ArtifactInfoOrBuilder getInfoOrBuilder();

      boolean hasNextId();

      int getNextId();

      List<CommonMsg.PropertyInfo> getLvPropertysList();

      CommonMsg.PropertyInfo getLvPropertys(int index);

      int getLvPropertysCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getLvPropertysOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getLvPropertysOrBuilder(int index);
   }

   public interface S2C_UpdateTask_7015OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTasksList();

      CommonMsg.Task getTasks(int index);

      int getTasksCount();

      List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList();

      CommonMsg.TaskOrBuilder getTasksOrBuilder(int index);
   }

   public interface SoulInfoOrBuilder extends MessageOrBuilder {
      boolean hasSoulNum();

      int getSoulNum();

      List<CommonMsg.PropertyInfo> getPropertyList();

      CommonMsg.PropertyInfo getProperty(int index);

      int getPropertyCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getPropertyOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getPropertyOrBuilder(int index);
   }
}
