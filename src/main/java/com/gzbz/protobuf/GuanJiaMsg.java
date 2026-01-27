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

public final class GuanJiaMsg {
   private static final Descriptors.Descriptor internal_static_guanJia_com_gzbz_protobuf_CellInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_guanJia_com_gzbz_protobuf_CellInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_guanJia_com_gzbz_protobuf_CompleteInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_guanJia_com_gzbz_protobuf_CompleteInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_guanJia_com_gzbz_protobuf_C2S_GuanJiaInfo_16601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_guanJia_com_gzbz_protobuf_C2S_GuanJiaInfo_16601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_guanJia_com_gzbz_protobuf_S2C_GuanJiaInfo_16602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_guanJia_com_gzbz_protobuf_S2C_GuanJiaInfo_16602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_guanJia_com_gzbz_protobuf_C2S_SelectSystem_16603_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_guanJia_com_gzbz_protobuf_C2S_SelectSystem_16603_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_guanJia_com_gzbz_protobuf_S2C_Complete_16608_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_guanJia_com_gzbz_protobuf_S2C_Complete_16608_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_guanJia_com_gzbz_protobuf_C2S_CompleteInfo_16609_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_guanJia_com_gzbz_protobuf_C2S_CompleteInfo_16609_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_guanJia_com_gzbz_protobuf_S2C_CompleteInfo_16610_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_guanJia_com_gzbz_protobuf_S2C_CompleteInfo_16610_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private GuanJiaMsg() {
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
      String[] descriptorData = new String[]{"\n\rGuanJia.proto\u0012\u0019guanJia.com.gzbz.protobuf\u001a\fcommon.proto\"Q\n\bCellInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005misc1\u0018\u0002 \u0003(\u0005\u0012\r\n\u0005count\u0018\u0003 \u0002(\t\u0012\r\n\u0005state\u0018\u0004 \u0001(\u0005\u0012\f\n\u0004mark\u0018\u0005 \u0001(\u0005\"P\n\fCompleteInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012!\n\u0007rewards\u0018\u0002 \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0011\n\thurtValue\u0018\u0003 \u0001(\u0003\"\u0017\n\u0015C2S_GuanJiaInfo_16601\"N\n\u0015S2C_GuanJiaInfo_16602\u00125\n\bcellInfo\u0018\u0001 \u0003(\u000b2#.guanJia.com.gzbz.protobuf.CellInfo\"O\n\u0016C2S_SelectSystem_16603\u00125\n\bcellInfo\u0018\u0001 \u0003(\u000b2#.guanJia.com.gzbz.protobuf.CellInfo\"K\n\u0012S2C_Complete_16608\u00125\n\u0004info\u0018\u0001 \u0002(\u000b2'.guanJia.com.gzbz.protobuf.CompleteInfo\"\u0018\n\u0016C2S_CompleteInfo_16609\"O\n\u0016S2C_CompleteInfo_16610\u00125\n\u0004info\u0018\u0001 \u0003(\u000b2'.guanJia.com.gzbz.protobuf.CompleteInfoB!\n\u0011com.gzbz.protobufB\nGuanJiaMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_guanJia_com_gzbz_protobuf_CellInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_guanJia_com_gzbz_protobuf_CellInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_guanJia_com_gzbz_protobuf_CellInfo_descriptor, new String[]{"Id", "Misc1", "Count", "State", "Mark"});
      internal_static_guanJia_com_gzbz_protobuf_CompleteInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_guanJia_com_gzbz_protobuf_CompleteInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_guanJia_com_gzbz_protobuf_CompleteInfo_descriptor, new String[]{"Id", "Rewards", "HurtValue"});
      internal_static_guanJia_com_gzbz_protobuf_C2S_GuanJiaInfo_16601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_guanJia_com_gzbz_protobuf_C2S_GuanJiaInfo_16601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_guanJia_com_gzbz_protobuf_C2S_GuanJiaInfo_16601_descriptor, new String[0]);
      internal_static_guanJia_com_gzbz_protobuf_S2C_GuanJiaInfo_16602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_guanJia_com_gzbz_protobuf_S2C_GuanJiaInfo_16602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_guanJia_com_gzbz_protobuf_S2C_GuanJiaInfo_16602_descriptor, new String[]{"CellInfo"});
      internal_static_guanJia_com_gzbz_protobuf_C2S_SelectSystem_16603_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_guanJia_com_gzbz_protobuf_C2S_SelectSystem_16603_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_guanJia_com_gzbz_protobuf_C2S_SelectSystem_16603_descriptor, new String[]{"CellInfo"});
      internal_static_guanJia_com_gzbz_protobuf_S2C_Complete_16608_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_guanJia_com_gzbz_protobuf_S2C_Complete_16608_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_guanJia_com_gzbz_protobuf_S2C_Complete_16608_descriptor, new String[]{"Info"});
      internal_static_guanJia_com_gzbz_protobuf_C2S_CompleteInfo_16609_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_guanJia_com_gzbz_protobuf_C2S_CompleteInfo_16609_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_guanJia_com_gzbz_protobuf_C2S_CompleteInfo_16609_descriptor, new String[0]);
      internal_static_guanJia_com_gzbz_protobuf_S2C_CompleteInfo_16610_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_guanJia_com_gzbz_protobuf_S2C_CompleteInfo_16610_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_guanJia_com_gzbz_protobuf_S2C_CompleteInfo_16610_descriptor, new String[]{"Info"});
      CommonMsg.getDescriptor();
   }

   public static final class CellInfo extends GeneratedMessageV3 implements CellInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int MISC1_FIELD_NUMBER = 2;
      private Internal.IntList misc1_;
      public static final int COUNT_FIELD_NUMBER = 3;
      private volatile Object count_;
      public static final int STATE_FIELD_NUMBER = 4;
      private int state_;
      public static final int MARK_FIELD_NUMBER = 5;
      private int mark_;
      private byte memoizedIsInitialized;
      private static final CellInfo DEFAULT_INSTANCE = new CellInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<CellInfo> PARSER = new AbstractParser<CellInfo>() {
         public CellInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CellInfo(input, extensionRegistry);
         }
      };

      private CellInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CellInfo() {
         this.memoizedIsInitialized = -1;
         this.misc1_ = emptyIntList();
         this.count_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CellInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CellInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.id_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.misc1_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.misc1_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.misc1_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.count_ = bs;
                        continue;
                     case 32:
                        this.bitField0_ |= 4;
                        this.state_ = input.readInt32();
                        continue;
                     case 40:
                        this.bitField0_ |= 8;
                        this.mark_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.misc1_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.misc1_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_CellInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_CellInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CellInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<Integer> getMisc1List() {
         return this.misc1_;
      }

      public int getMisc1Count() {
         return this.misc1_.size();
      }

      public int getMisc1(int index) {
         return this.misc1_.getInt(index);
      }

      public boolean hasCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getCount() {
         Object ref = this.count_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.count_ = s;
            }

            return s;
         }
      }

      public ByteString getCountBytes() {
         Object ref = this.count_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.count_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasState() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getState() {
         return this.state_;
      }

      public boolean hasMark() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getMark() {
         return this.mark_;
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
         } else if (!this.hasCount()) {
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

         for(int i = 0; i < this.misc1_.size(); ++i) {
            output.writeInt32(2, this.misc1_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.count_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.state_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.mark_);
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

            int dataSize = 0;

            for(int i = 0; i < this.misc1_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.misc1_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getMisc1List().size();
            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.count_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.state_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.mark_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CellInfo)) {
            return super.equals(obj);
         } else {
            CellInfo other = (CellInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getMisc1List().equals(other.getMisc1List())) {
               return false;
            } else if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && !this.getCount().equals(other.getCount())) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.getState() != other.getState()) {
               return false;
            } else if (this.hasMark() != other.hasMark()) {
               return false;
            } else if (this.hasMark() && this.getMark() != other.getMark()) {
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

            if (this.getMisc1Count() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMisc1List().hashCode();
            }

            if (this.hasCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCount().hashCode();
            }

            if (this.hasState()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getState();
            }

            if (this.hasMark()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getMark();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CellInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CellInfo)PARSER.parseFrom(data);
      }

      public static CellInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CellInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CellInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CellInfo)PARSER.parseFrom(data);
      }

      public static CellInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CellInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CellInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CellInfo)PARSER.parseFrom(data);
      }

      public static CellInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CellInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CellInfo parseFrom(InputStream input) throws IOException {
         return (CellInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CellInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CellInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CellInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (CellInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CellInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CellInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CellInfo parseFrom(CodedInputStream input) throws IOException {
         return (CellInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CellInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CellInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CellInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CellInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CellInfo> parser() {
         return PARSER;
      }

      public Parser<CellInfo> getParserForType() {
         return PARSER;
      }

      public CellInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CellInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private Internal.IntList misc1_;
         private Object count_;
         private int state_;
         private int mark_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_CellInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_CellInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CellInfo.class, Builder.class);
         }

         private Builder() {
            this.misc1_ = GuanJiaMsg.CellInfo.emptyIntList();
            this.count_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.misc1_ = GuanJiaMsg.CellInfo.emptyIntList();
            this.count_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GuanJiaMsg.CellInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.misc1_ = GuanJiaMsg.CellInfo.emptyIntList();
            this.bitField0_ &= -3;
            this.count_ = "";
            this.bitField0_ &= -5;
            this.state_ = 0;
            this.bitField0_ &= -9;
            this.mark_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_CellInfo_descriptor;
         }

         public CellInfo getDefaultInstanceForType() {
            return GuanJiaMsg.CellInfo.getDefaultInstance();
         }

         public CellInfo build() {
            CellInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CellInfo buildPartial() {
            CellInfo result = new CellInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.misc1_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.misc1_ = this.misc1_;
            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 2;
            }

            result.count_ = this.count_;
            if ((from_bitField0_ & 8) != 0) {
               result.state_ = this.state_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.mark_ = this.mark_;
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
            if (other instanceof CellInfo) {
               return this.mergeFrom((CellInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CellInfo other) {
            if (other == GuanJiaMsg.CellInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (!other.misc1_.isEmpty()) {
                  if (this.misc1_.isEmpty()) {
                     this.misc1_ = other.misc1_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureMisc1IsMutable();
                     this.misc1_.addAll(other.misc1_);
                  }

                  this.onChanged();
               }

               if (other.hasCount()) {
                  this.bitField0_ |= 4;
                  this.count_ = other.count_;
                  this.onChanged();
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasMark()) {
                  this.setMark(other.getMark());
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
               return this.hasCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CellInfo parsedMessage = null;

            try {
               parsedMessage = (CellInfo)GuanJiaMsg.CellInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CellInfo)e.getUnfinishedMessage();
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

         private void ensureMisc1IsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.misc1_ = GuanJiaMsg.CellInfo.mutableCopy(this.misc1_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getMisc1List() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.misc1_) : this.misc1_);
         }

         public int getMisc1Count() {
            return this.misc1_.size();
         }

         public int getMisc1(int index) {
            return this.misc1_.getInt(index);
         }

         public Builder setMisc1(int index, int value) {
            this.ensureMisc1IsMutable();
            this.misc1_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addMisc1(int value) {
            this.ensureMisc1IsMutable();
            this.misc1_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllMisc1(Iterable<? extends Integer> values) {
            this.ensureMisc1IsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.misc1_);
            this.onChanged();
            return this;
         }

         public Builder clearMisc1() {
            this.misc1_ = GuanJiaMsg.CellInfo.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public String getCount() {
            Object ref = this.count_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.count_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getCountBytes() {
            Object ref = this.count_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.count_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setCount(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.count_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearCount() {
            this.bitField0_ &= -5;
            this.count_ = GuanJiaMsg.CellInfo.getDefaultInstance().getCount();
            this.onChanged();
            return this;
         }

         public Builder setCountBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.count_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasState() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getState() {
            return this.state_;
         }

         public Builder setState(int value) {
            this.bitField0_ |= 8;
            this.state_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearState() {
            this.bitField0_ &= -9;
            this.state_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMark() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getMark() {
            return this.mark_;
         }

         public Builder setMark(int value) {
            this.bitField0_ |= 16;
            this.mark_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMark() {
            this.bitField0_ &= -17;
            this.mark_ = 0;
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

   public static final class CompleteInfo extends GeneratedMessageV3 implements CompleteInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int REWARDS_FIELD_NUMBER = 2;
      private List<CommonMsg.ItemInfo> rewards_;
      public static final int HURTVALUE_FIELD_NUMBER = 3;
      private long hurtValue_;
      private byte memoizedIsInitialized;
      private static final CompleteInfo DEFAULT_INSTANCE = new CompleteInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<CompleteInfo> PARSER = new AbstractParser<CompleteInfo>() {
         public CompleteInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CompleteInfo(input, extensionRegistry);
         }
      };

      private CompleteInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CompleteInfo() {
         this.memoizedIsInitialized = -1;
         this.rewards_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CompleteInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CompleteInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rewards_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rewards_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.hurtValue_ = input.readInt64();
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
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_CompleteInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_CompleteInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CompleteInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<CommonMsg.ItemInfo> getRewardsList() {
         return this.rewards_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardsOrBuilderList() {
         return this.rewards_;
      }

      public int getRewardsCount() {
         return this.rewards_.size();
      }

      public CommonMsg.ItemInfo getRewards(int index) {
         return (CommonMsg.ItemInfo)this.rewards_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getRewardsOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.rewards_.get(index);
      }

      public boolean hasHurtValue() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getHurtValue() {
         return this.hurtValue_;
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
            for(int i = 0; i < this.getRewardsCount(); ++i) {
               if (!this.getRewards(i).isInitialized()) {
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

         for(int i = 0; i < this.rewards_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.rewards_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(3, this.hurtValue_);
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

            for(int i = 0; i < this.rewards_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.rewards_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.hurtValue_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CompleteInfo)) {
            return super.equals(obj);
         } else {
            CompleteInfo other = (CompleteInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getRewardsList().equals(other.getRewardsList())) {
               return false;
            } else if (this.hasHurtValue() != other.hasHurtValue()) {
               return false;
            } else if (this.hasHurtValue() && this.getHurtValue() != other.getHurtValue()) {
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

            if (this.getRewardsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardsList().hashCode();
            }

            if (this.hasHurtValue()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getHurtValue());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CompleteInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CompleteInfo)PARSER.parseFrom(data);
      }

      public static CompleteInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CompleteInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CompleteInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CompleteInfo)PARSER.parseFrom(data);
      }

      public static CompleteInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CompleteInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CompleteInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CompleteInfo)PARSER.parseFrom(data);
      }

      public static CompleteInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CompleteInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CompleteInfo parseFrom(InputStream input) throws IOException {
         return (CompleteInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CompleteInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CompleteInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CompleteInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (CompleteInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CompleteInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CompleteInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CompleteInfo parseFrom(CodedInputStream input) throws IOException {
         return (CompleteInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CompleteInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CompleteInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CompleteInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CompleteInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CompleteInfo> parser() {
         return PARSER;
      }

      public Parser<CompleteInfo> getParserForType() {
         return PARSER;
      }

      public CompleteInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CompleteInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private List<CommonMsg.ItemInfo> rewards_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardsBuilder_;
         private long hurtValue_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_CompleteInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_CompleteInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CompleteInfo.class, Builder.class);
         }

         private Builder() {
            this.rewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rewards_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GuanJiaMsg.CompleteInfo.alwaysUseFieldBuilders) {
               this.getRewardsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            if (this.rewardsBuilder_ == null) {
               this.rewards_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.rewardsBuilder_.clear();
            }

            this.hurtValue_ = 0L;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_CompleteInfo_descriptor;
         }

         public CompleteInfo getDefaultInstanceForType() {
            return GuanJiaMsg.CompleteInfo.getDefaultInstance();
         }

         public CompleteInfo build() {
            CompleteInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CompleteInfo buildPartial() {
            CompleteInfo result = new CompleteInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if (this.rewardsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.rewards_ = Collections.unmodifiableList(this.rewards_);
                  this.bitField0_ &= -3;
               }

               result.rewards_ = this.rewards_;
            } else {
               result.rewards_ = this.rewardsBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.hurtValue_ = this.hurtValue_;
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
            if (other instanceof CompleteInfo) {
               return this.mergeFrom((CompleteInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CompleteInfo other) {
            if (other == GuanJiaMsg.CompleteInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (this.rewardsBuilder_ == null) {
                  if (!other.rewards_.isEmpty()) {
                     if (this.rewards_.isEmpty()) {
                        this.rewards_ = other.rewards_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRewardsIsMutable();
                        this.rewards_.addAll(other.rewards_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rewards_.isEmpty()) {
                  if (this.rewardsBuilder_.isEmpty()) {
                     this.rewardsBuilder_.dispose();
                     this.rewardsBuilder_ = null;
                     this.rewards_ = other.rewards_;
                     this.bitField0_ &= -3;
                     this.rewardsBuilder_ = GuanJiaMsg.CompleteInfo.alwaysUseFieldBuilders ? this.getRewardsFieldBuilder() : null;
                  } else {
                     this.rewardsBuilder_.addAllMessages(other.rewards_);
                  }
               }

               if (other.hasHurtValue()) {
                  this.setHurtValue(other.getHurtValue());
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
               for(int i = 0; i < this.getRewardsCount(); ++i) {
                  if (!this.getRewards(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CompleteInfo parsedMessage = null;

            try {
               parsedMessage = (CompleteInfo)GuanJiaMsg.CompleteInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CompleteInfo)e.getUnfinishedMessage();
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

         private void ensureRewardsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rewards_ = new ArrayList(this.rewards_);
               this.bitField0_ |= 2;
            }

         }

         public List<CommonMsg.ItemInfo> getRewardsList() {
            return this.rewardsBuilder_ == null ? Collections.unmodifiableList(this.rewards_) : this.rewardsBuilder_.getMessageList();
         }

         public int getRewardsCount() {
            return this.rewardsBuilder_ == null ? this.rewards_.size() : this.rewardsBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getRewards(int index) {
            return this.rewardsBuilder_ == null ? (CommonMsg.ItemInfo)this.rewards_.get(index) : (CommonMsg.ItemInfo)this.rewardsBuilder_.getMessage(index);
         }

         public Builder setRewards(int index, CommonMsg.ItemInfo value) {
            if (this.rewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardsIsMutable();
               this.rewards_.set(index, value);
               this.onChanged();
            } else {
               this.rewardsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRewards(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRewards(CommonMsg.ItemInfo value) {
            if (this.rewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardsIsMutable();
               this.rewards_.add(value);
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRewards(int index, CommonMsg.ItemInfo value) {
            if (this.rewardsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardsIsMutable();
               this.rewards_.add(index, value);
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRewards(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRewards(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRewards(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rewards_);
               this.onChanged();
            } else {
               this.rewardsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRewards() {
            if (this.rewardsBuilder_ == null) {
               this.rewards_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.rewardsBuilder_.clear();
            }

            return this;
         }

         public Builder removeRewards(int index) {
            if (this.rewardsBuilder_ == null) {
               this.ensureRewardsIsMutable();
               this.rewards_.remove(index);
               this.onChanged();
            } else {
               this.rewardsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getRewardsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getRewardsOrBuilder(int index) {
            return this.rewardsBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.rewards_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.rewardsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardsOrBuilderList() {
            return this.rewardsBuilder_ != null ? this.rewardsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rewards_);
         }

         public CommonMsg.ItemInfo.Builder addRewardsBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getRewardsFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addRewardsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardsFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getRewardsBuilderList() {
            return this.getRewardsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getRewardsFieldBuilder() {
            if (this.rewardsBuilder_ == null) {
               this.rewardsBuilder_ = new RepeatedFieldBuilderV3(this.rewards_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.rewards_ = null;
            }

            return this.rewardsBuilder_;
         }

         public boolean hasHurtValue() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getHurtValue() {
            return this.hurtValue_;
         }

         public Builder setHurtValue(long value) {
            this.bitField0_ |= 4;
            this.hurtValue_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHurtValue() {
            this.bitField0_ &= -5;
            this.hurtValue_ = 0L;
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

   public static final class C2S_GuanJiaInfo_16601 extends GeneratedMessageV3 implements C2S_GuanJiaInfo_16601OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_GuanJiaInfo_16601 DEFAULT_INSTANCE = new C2S_GuanJiaInfo_16601();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GuanJiaInfo_16601> PARSER = new AbstractParser<C2S_GuanJiaInfo_16601>() {
         public C2S_GuanJiaInfo_16601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GuanJiaInfo_16601(input, extensionRegistry);
         }
      };

      private C2S_GuanJiaInfo_16601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GuanJiaInfo_16601() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GuanJiaInfo_16601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GuanJiaInfo_16601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_C2S_GuanJiaInfo_16601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_C2S_GuanJiaInfo_16601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GuanJiaInfo_16601.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GuanJiaInfo_16601)) {
            return super.equals(obj);
         } else {
            C2S_GuanJiaInfo_16601 other = (C2S_GuanJiaInfo_16601)obj;
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

      public static C2S_GuanJiaInfo_16601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GuanJiaInfo_16601)PARSER.parseFrom(data);
      }

      public static C2S_GuanJiaInfo_16601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuanJiaInfo_16601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuanJiaInfo_16601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GuanJiaInfo_16601)PARSER.parseFrom(data);
      }

      public static C2S_GuanJiaInfo_16601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuanJiaInfo_16601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuanJiaInfo_16601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GuanJiaInfo_16601)PARSER.parseFrom(data);
      }

      public static C2S_GuanJiaInfo_16601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GuanJiaInfo_16601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GuanJiaInfo_16601 parseFrom(InputStream input) throws IOException {
         return (C2S_GuanJiaInfo_16601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GuanJiaInfo_16601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuanJiaInfo_16601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GuanJiaInfo_16601 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GuanJiaInfo_16601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GuanJiaInfo_16601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuanJiaInfo_16601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GuanJiaInfo_16601 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GuanJiaInfo_16601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GuanJiaInfo_16601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GuanJiaInfo_16601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GuanJiaInfo_16601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GuanJiaInfo_16601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GuanJiaInfo_16601> parser() {
         return PARSER;
      }

      public Parser<C2S_GuanJiaInfo_16601> getParserForType() {
         return PARSER;
      }

      public C2S_GuanJiaInfo_16601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GuanJiaInfo_16601OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_C2S_GuanJiaInfo_16601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_C2S_GuanJiaInfo_16601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GuanJiaInfo_16601.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GuanJiaMsg.C2S_GuanJiaInfo_16601.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_C2S_GuanJiaInfo_16601_descriptor;
         }

         public C2S_GuanJiaInfo_16601 getDefaultInstanceForType() {
            return GuanJiaMsg.C2S_GuanJiaInfo_16601.getDefaultInstance();
         }

         public C2S_GuanJiaInfo_16601 build() {
            C2S_GuanJiaInfo_16601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GuanJiaInfo_16601 buildPartial() {
            C2S_GuanJiaInfo_16601 result = new C2S_GuanJiaInfo_16601(this);
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
            if (other instanceof C2S_GuanJiaInfo_16601) {
               return this.mergeFrom((C2S_GuanJiaInfo_16601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GuanJiaInfo_16601 other) {
            if (other == GuanJiaMsg.C2S_GuanJiaInfo_16601.getDefaultInstance()) {
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
            C2S_GuanJiaInfo_16601 parsedMessage = null;

            try {
               parsedMessage = (C2S_GuanJiaInfo_16601)GuanJiaMsg.C2S_GuanJiaInfo_16601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GuanJiaInfo_16601)e.getUnfinishedMessage();
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

   public static final class S2C_GuanJiaInfo_16602 extends GeneratedMessageV3 implements S2C_GuanJiaInfo_16602OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CELLINFO_FIELD_NUMBER = 1;
      private List<CellInfo> cellInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_GuanJiaInfo_16602 DEFAULT_INSTANCE = new S2C_GuanJiaInfo_16602();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GuanJiaInfo_16602> PARSER = new AbstractParser<S2C_GuanJiaInfo_16602>() {
         public S2C_GuanJiaInfo_16602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GuanJiaInfo_16602(input, extensionRegistry);
         }
      };

      private S2C_GuanJiaInfo_16602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GuanJiaInfo_16602() {
         this.memoizedIsInitialized = -1;
         this.cellInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GuanJiaInfo_16602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GuanJiaInfo_16602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.cellInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.cellInfo_.add(input.readMessage(GuanJiaMsg.CellInfo.PARSER, extensionRegistry));
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
                  this.cellInfo_ = Collections.unmodifiableList(this.cellInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_S2C_GuanJiaInfo_16602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_S2C_GuanJiaInfo_16602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuanJiaInfo_16602.class, Builder.class);
      }

      public List<CellInfo> getCellInfoList() {
         return this.cellInfo_;
      }

      public List<? extends CellInfoOrBuilder> getCellInfoOrBuilderList() {
         return this.cellInfo_;
      }

      public int getCellInfoCount() {
         return this.cellInfo_.size();
      }

      public CellInfo getCellInfo(int index) {
         return (CellInfo)this.cellInfo_.get(index);
      }

      public CellInfoOrBuilder getCellInfoOrBuilder(int index) {
         return (CellInfoOrBuilder)this.cellInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getCellInfoCount(); ++i) {
               if (!this.getCellInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.cellInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.cellInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.cellInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.cellInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GuanJiaInfo_16602)) {
            return super.equals(obj);
         } else {
            S2C_GuanJiaInfo_16602 other = (S2C_GuanJiaInfo_16602)obj;
            if (!this.getCellInfoList().equals(other.getCellInfoList())) {
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
            if (this.getCellInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCellInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GuanJiaInfo_16602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GuanJiaInfo_16602)PARSER.parseFrom(data);
      }

      public static S2C_GuanJiaInfo_16602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuanJiaInfo_16602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuanJiaInfo_16602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GuanJiaInfo_16602)PARSER.parseFrom(data);
      }

      public static S2C_GuanJiaInfo_16602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuanJiaInfo_16602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuanJiaInfo_16602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GuanJiaInfo_16602)PARSER.parseFrom(data);
      }

      public static S2C_GuanJiaInfo_16602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GuanJiaInfo_16602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GuanJiaInfo_16602 parseFrom(InputStream input) throws IOException {
         return (S2C_GuanJiaInfo_16602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuanJiaInfo_16602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuanJiaInfo_16602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuanJiaInfo_16602 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GuanJiaInfo_16602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GuanJiaInfo_16602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuanJiaInfo_16602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GuanJiaInfo_16602 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GuanJiaInfo_16602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GuanJiaInfo_16602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GuanJiaInfo_16602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GuanJiaInfo_16602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GuanJiaInfo_16602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GuanJiaInfo_16602> parser() {
         return PARSER;
      }

      public Parser<S2C_GuanJiaInfo_16602> getParserForType() {
         return PARSER;
      }

      public S2C_GuanJiaInfo_16602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GuanJiaInfo_16602OrBuilder {
         private int bitField0_;
         private List<CellInfo> cellInfo_;
         private RepeatedFieldBuilderV3<CellInfo, CellInfo.Builder, CellInfoOrBuilder> cellInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_S2C_GuanJiaInfo_16602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_S2C_GuanJiaInfo_16602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GuanJiaInfo_16602.class, Builder.class);
         }

         private Builder() {
            this.cellInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.cellInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GuanJiaMsg.S2C_GuanJiaInfo_16602.alwaysUseFieldBuilders) {
               this.getCellInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.cellInfoBuilder_ == null) {
               this.cellInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.cellInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_S2C_GuanJiaInfo_16602_descriptor;
         }

         public S2C_GuanJiaInfo_16602 getDefaultInstanceForType() {
            return GuanJiaMsg.S2C_GuanJiaInfo_16602.getDefaultInstance();
         }

         public S2C_GuanJiaInfo_16602 build() {
            S2C_GuanJiaInfo_16602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GuanJiaInfo_16602 buildPartial() {
            S2C_GuanJiaInfo_16602 result = new S2C_GuanJiaInfo_16602(this);
            int from_bitField0_ = this.bitField0_;
            if (this.cellInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.cellInfo_ = Collections.unmodifiableList(this.cellInfo_);
                  this.bitField0_ &= -2;
               }

               result.cellInfo_ = this.cellInfo_;
            } else {
               result.cellInfo_ = this.cellInfoBuilder_.build();
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
            if (other instanceof S2C_GuanJiaInfo_16602) {
               return this.mergeFrom((S2C_GuanJiaInfo_16602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GuanJiaInfo_16602 other) {
            if (other == GuanJiaMsg.S2C_GuanJiaInfo_16602.getDefaultInstance()) {
               return this;
            } else {
               if (this.cellInfoBuilder_ == null) {
                  if (!other.cellInfo_.isEmpty()) {
                     if (this.cellInfo_.isEmpty()) {
                        this.cellInfo_ = other.cellInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureCellInfoIsMutable();
                        this.cellInfo_.addAll(other.cellInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.cellInfo_.isEmpty()) {
                  if (this.cellInfoBuilder_.isEmpty()) {
                     this.cellInfoBuilder_.dispose();
                     this.cellInfoBuilder_ = null;
                     this.cellInfo_ = other.cellInfo_;
                     this.bitField0_ &= -2;
                     this.cellInfoBuilder_ = GuanJiaMsg.S2C_GuanJiaInfo_16602.alwaysUseFieldBuilders ? this.getCellInfoFieldBuilder() : null;
                  } else {
                     this.cellInfoBuilder_.addAllMessages(other.cellInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getCellInfoCount(); ++i) {
               if (!this.getCellInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GuanJiaInfo_16602 parsedMessage = null;

            try {
               parsedMessage = (S2C_GuanJiaInfo_16602)GuanJiaMsg.S2C_GuanJiaInfo_16602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GuanJiaInfo_16602)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureCellInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.cellInfo_ = new ArrayList(this.cellInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<CellInfo> getCellInfoList() {
            return this.cellInfoBuilder_ == null ? Collections.unmodifiableList(this.cellInfo_) : this.cellInfoBuilder_.getMessageList();
         }

         public int getCellInfoCount() {
            return this.cellInfoBuilder_ == null ? this.cellInfo_.size() : this.cellInfoBuilder_.getCount();
         }

         public CellInfo getCellInfo(int index) {
            return this.cellInfoBuilder_ == null ? (CellInfo)this.cellInfo_.get(index) : (CellInfo)this.cellInfoBuilder_.getMessage(index);
         }

         public Builder setCellInfo(int index, CellInfo value) {
            if (this.cellInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCellInfoIsMutable();
               this.cellInfo_.set(index, value);
               this.onChanged();
            } else {
               this.cellInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setCellInfo(int index, CellInfo.Builder builderForValue) {
            if (this.cellInfoBuilder_ == null) {
               this.ensureCellInfoIsMutable();
               this.cellInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.cellInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addCellInfo(CellInfo value) {
            if (this.cellInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCellInfoIsMutable();
               this.cellInfo_.add(value);
               this.onChanged();
            } else {
               this.cellInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addCellInfo(int index, CellInfo value) {
            if (this.cellInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCellInfoIsMutable();
               this.cellInfo_.add(index, value);
               this.onChanged();
            } else {
               this.cellInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addCellInfo(CellInfo.Builder builderForValue) {
            if (this.cellInfoBuilder_ == null) {
               this.ensureCellInfoIsMutable();
               this.cellInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.cellInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addCellInfo(int index, CellInfo.Builder builderForValue) {
            if (this.cellInfoBuilder_ == null) {
               this.ensureCellInfoIsMutable();
               this.cellInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.cellInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllCellInfo(Iterable<? extends CellInfo> values) {
            if (this.cellInfoBuilder_ == null) {
               this.ensureCellInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.cellInfo_);
               this.onChanged();
            } else {
               this.cellInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearCellInfo() {
            if (this.cellInfoBuilder_ == null) {
               this.cellInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.cellInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeCellInfo(int index) {
            if (this.cellInfoBuilder_ == null) {
               this.ensureCellInfoIsMutable();
               this.cellInfo_.remove(index);
               this.onChanged();
            } else {
               this.cellInfoBuilder_.remove(index);
            }

            return this;
         }

         public CellInfo.Builder getCellInfoBuilder(int index) {
            return (CellInfo.Builder)this.getCellInfoFieldBuilder().getBuilder(index);
         }

         public CellInfoOrBuilder getCellInfoOrBuilder(int index) {
            return this.cellInfoBuilder_ == null ? (CellInfoOrBuilder)this.cellInfo_.get(index) : (CellInfoOrBuilder)this.cellInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CellInfoOrBuilder> getCellInfoOrBuilderList() {
            return this.cellInfoBuilder_ != null ? this.cellInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.cellInfo_);
         }

         public CellInfo.Builder addCellInfoBuilder() {
            return (CellInfo.Builder)this.getCellInfoFieldBuilder().addBuilder(GuanJiaMsg.CellInfo.getDefaultInstance());
         }

         public CellInfo.Builder addCellInfoBuilder(int index) {
            return (CellInfo.Builder)this.getCellInfoFieldBuilder().addBuilder(index, GuanJiaMsg.CellInfo.getDefaultInstance());
         }

         public List<CellInfo.Builder> getCellInfoBuilderList() {
            return this.getCellInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CellInfo, CellInfo.Builder, CellInfoOrBuilder> getCellInfoFieldBuilder() {
            if (this.cellInfoBuilder_ == null) {
               this.cellInfoBuilder_ = new RepeatedFieldBuilderV3(this.cellInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.cellInfo_ = null;
            }

            return this.cellInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_SelectSystem_16603 extends GeneratedMessageV3 implements C2S_SelectSystem_16603OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CELLINFO_FIELD_NUMBER = 1;
      private List<CellInfo> cellInfo_;
      private byte memoizedIsInitialized;
      private static final C2S_SelectSystem_16603 DEFAULT_INSTANCE = new C2S_SelectSystem_16603();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SelectSystem_16603> PARSER = new AbstractParser<C2S_SelectSystem_16603>() {
         public C2S_SelectSystem_16603 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SelectSystem_16603(input, extensionRegistry);
         }
      };

      private C2S_SelectSystem_16603(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SelectSystem_16603() {
         this.memoizedIsInitialized = -1;
         this.cellInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SelectSystem_16603();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SelectSystem_16603(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.cellInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.cellInfo_.add(input.readMessage(GuanJiaMsg.CellInfo.PARSER, extensionRegistry));
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
                  this.cellInfo_ = Collections.unmodifiableList(this.cellInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_C2S_SelectSystem_16603_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_C2S_SelectSystem_16603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SelectSystem_16603.class, Builder.class);
      }

      public List<CellInfo> getCellInfoList() {
         return this.cellInfo_;
      }

      public List<? extends CellInfoOrBuilder> getCellInfoOrBuilderList() {
         return this.cellInfo_;
      }

      public int getCellInfoCount() {
         return this.cellInfo_.size();
      }

      public CellInfo getCellInfo(int index) {
         return (CellInfo)this.cellInfo_.get(index);
      }

      public CellInfoOrBuilder getCellInfoOrBuilder(int index) {
         return (CellInfoOrBuilder)this.cellInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getCellInfoCount(); ++i) {
               if (!this.getCellInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.cellInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.cellInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.cellInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.cellInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SelectSystem_16603)) {
            return super.equals(obj);
         } else {
            C2S_SelectSystem_16603 other = (C2S_SelectSystem_16603)obj;
            if (!this.getCellInfoList().equals(other.getCellInfoList())) {
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
            if (this.getCellInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCellInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SelectSystem_16603 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SelectSystem_16603)PARSER.parseFrom(data);
      }

      public static C2S_SelectSystem_16603 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SelectSystem_16603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SelectSystem_16603 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SelectSystem_16603)PARSER.parseFrom(data);
      }

      public static C2S_SelectSystem_16603 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SelectSystem_16603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SelectSystem_16603 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SelectSystem_16603)PARSER.parseFrom(data);
      }

      public static C2S_SelectSystem_16603 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SelectSystem_16603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SelectSystem_16603 parseFrom(InputStream input) throws IOException {
         return (C2S_SelectSystem_16603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SelectSystem_16603 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SelectSystem_16603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SelectSystem_16603 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SelectSystem_16603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SelectSystem_16603 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SelectSystem_16603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SelectSystem_16603 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SelectSystem_16603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SelectSystem_16603 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SelectSystem_16603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SelectSystem_16603 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SelectSystem_16603 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SelectSystem_16603> parser() {
         return PARSER;
      }

      public Parser<C2S_SelectSystem_16603> getParserForType() {
         return PARSER;
      }

      public C2S_SelectSystem_16603 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SelectSystem_16603OrBuilder {
         private int bitField0_;
         private List<CellInfo> cellInfo_;
         private RepeatedFieldBuilderV3<CellInfo, CellInfo.Builder, CellInfoOrBuilder> cellInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_C2S_SelectSystem_16603_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_C2S_SelectSystem_16603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SelectSystem_16603.class, Builder.class);
         }

         private Builder() {
            this.cellInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.cellInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GuanJiaMsg.C2S_SelectSystem_16603.alwaysUseFieldBuilders) {
               this.getCellInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.cellInfoBuilder_ == null) {
               this.cellInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.cellInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_C2S_SelectSystem_16603_descriptor;
         }

         public C2S_SelectSystem_16603 getDefaultInstanceForType() {
            return GuanJiaMsg.C2S_SelectSystem_16603.getDefaultInstance();
         }

         public C2S_SelectSystem_16603 build() {
            C2S_SelectSystem_16603 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SelectSystem_16603 buildPartial() {
            C2S_SelectSystem_16603 result = new C2S_SelectSystem_16603(this);
            int from_bitField0_ = this.bitField0_;
            if (this.cellInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.cellInfo_ = Collections.unmodifiableList(this.cellInfo_);
                  this.bitField0_ &= -2;
               }

               result.cellInfo_ = this.cellInfo_;
            } else {
               result.cellInfo_ = this.cellInfoBuilder_.build();
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
            if (other instanceof C2S_SelectSystem_16603) {
               return this.mergeFrom((C2S_SelectSystem_16603)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SelectSystem_16603 other) {
            if (other == GuanJiaMsg.C2S_SelectSystem_16603.getDefaultInstance()) {
               return this;
            } else {
               if (this.cellInfoBuilder_ == null) {
                  if (!other.cellInfo_.isEmpty()) {
                     if (this.cellInfo_.isEmpty()) {
                        this.cellInfo_ = other.cellInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureCellInfoIsMutable();
                        this.cellInfo_.addAll(other.cellInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.cellInfo_.isEmpty()) {
                  if (this.cellInfoBuilder_.isEmpty()) {
                     this.cellInfoBuilder_.dispose();
                     this.cellInfoBuilder_ = null;
                     this.cellInfo_ = other.cellInfo_;
                     this.bitField0_ &= -2;
                     this.cellInfoBuilder_ = GuanJiaMsg.C2S_SelectSystem_16603.alwaysUseFieldBuilders ? this.getCellInfoFieldBuilder() : null;
                  } else {
                     this.cellInfoBuilder_.addAllMessages(other.cellInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getCellInfoCount(); ++i) {
               if (!this.getCellInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SelectSystem_16603 parsedMessage = null;

            try {
               parsedMessage = (C2S_SelectSystem_16603)GuanJiaMsg.C2S_SelectSystem_16603.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SelectSystem_16603)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureCellInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.cellInfo_ = new ArrayList(this.cellInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<CellInfo> getCellInfoList() {
            return this.cellInfoBuilder_ == null ? Collections.unmodifiableList(this.cellInfo_) : this.cellInfoBuilder_.getMessageList();
         }

         public int getCellInfoCount() {
            return this.cellInfoBuilder_ == null ? this.cellInfo_.size() : this.cellInfoBuilder_.getCount();
         }

         public CellInfo getCellInfo(int index) {
            return this.cellInfoBuilder_ == null ? (CellInfo)this.cellInfo_.get(index) : (CellInfo)this.cellInfoBuilder_.getMessage(index);
         }

         public Builder setCellInfo(int index, CellInfo value) {
            if (this.cellInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCellInfoIsMutable();
               this.cellInfo_.set(index, value);
               this.onChanged();
            } else {
               this.cellInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setCellInfo(int index, CellInfo.Builder builderForValue) {
            if (this.cellInfoBuilder_ == null) {
               this.ensureCellInfoIsMutable();
               this.cellInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.cellInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addCellInfo(CellInfo value) {
            if (this.cellInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCellInfoIsMutable();
               this.cellInfo_.add(value);
               this.onChanged();
            } else {
               this.cellInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addCellInfo(int index, CellInfo value) {
            if (this.cellInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCellInfoIsMutable();
               this.cellInfo_.add(index, value);
               this.onChanged();
            } else {
               this.cellInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addCellInfo(CellInfo.Builder builderForValue) {
            if (this.cellInfoBuilder_ == null) {
               this.ensureCellInfoIsMutable();
               this.cellInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.cellInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addCellInfo(int index, CellInfo.Builder builderForValue) {
            if (this.cellInfoBuilder_ == null) {
               this.ensureCellInfoIsMutable();
               this.cellInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.cellInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllCellInfo(Iterable<? extends CellInfo> values) {
            if (this.cellInfoBuilder_ == null) {
               this.ensureCellInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.cellInfo_);
               this.onChanged();
            } else {
               this.cellInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearCellInfo() {
            if (this.cellInfoBuilder_ == null) {
               this.cellInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.cellInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeCellInfo(int index) {
            if (this.cellInfoBuilder_ == null) {
               this.ensureCellInfoIsMutable();
               this.cellInfo_.remove(index);
               this.onChanged();
            } else {
               this.cellInfoBuilder_.remove(index);
            }

            return this;
         }

         public CellInfo.Builder getCellInfoBuilder(int index) {
            return (CellInfo.Builder)this.getCellInfoFieldBuilder().getBuilder(index);
         }

         public CellInfoOrBuilder getCellInfoOrBuilder(int index) {
            return this.cellInfoBuilder_ == null ? (CellInfoOrBuilder)this.cellInfo_.get(index) : (CellInfoOrBuilder)this.cellInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CellInfoOrBuilder> getCellInfoOrBuilderList() {
            return this.cellInfoBuilder_ != null ? this.cellInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.cellInfo_);
         }

         public CellInfo.Builder addCellInfoBuilder() {
            return (CellInfo.Builder)this.getCellInfoFieldBuilder().addBuilder(GuanJiaMsg.CellInfo.getDefaultInstance());
         }

         public CellInfo.Builder addCellInfoBuilder(int index) {
            return (CellInfo.Builder)this.getCellInfoFieldBuilder().addBuilder(index, GuanJiaMsg.CellInfo.getDefaultInstance());
         }

         public List<CellInfo.Builder> getCellInfoBuilderList() {
            return this.getCellInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CellInfo, CellInfo.Builder, CellInfoOrBuilder> getCellInfoFieldBuilder() {
            if (this.cellInfoBuilder_ == null) {
               this.cellInfoBuilder_ = new RepeatedFieldBuilderV3(this.cellInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.cellInfo_ = null;
            }

            return this.cellInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_Complete_16608 extends GeneratedMessageV3 implements S2C_Complete_16608OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private CompleteInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_Complete_16608 DEFAULT_INSTANCE = new S2C_Complete_16608();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Complete_16608> PARSER = new AbstractParser<S2C_Complete_16608>() {
         public S2C_Complete_16608 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Complete_16608(input, extensionRegistry);
         }
      };

      private S2C_Complete_16608(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Complete_16608() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Complete_16608();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Complete_16608(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CompleteInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (CompleteInfo)input.readMessage(GuanJiaMsg.CompleteInfo.PARSER, extensionRegistry);
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
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_S2C_Complete_16608_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_S2C_Complete_16608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Complete_16608.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public CompleteInfo getInfo() {
         return this.info_ == null ? GuanJiaMsg.CompleteInfo.getDefaultInstance() : this.info_;
      }

      public CompleteInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? GuanJiaMsg.CompleteInfo.getDefaultInstance() : this.info_;
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
         } else if (!(obj instanceof S2C_Complete_16608)) {
            return super.equals(obj);
         } else {
            S2C_Complete_16608 other = (S2C_Complete_16608)obj;
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

      public static S2C_Complete_16608 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Complete_16608)PARSER.parseFrom(data);
      }

      public static S2C_Complete_16608 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Complete_16608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Complete_16608 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Complete_16608)PARSER.parseFrom(data);
      }

      public static S2C_Complete_16608 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Complete_16608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Complete_16608 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Complete_16608)PARSER.parseFrom(data);
      }

      public static S2C_Complete_16608 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Complete_16608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Complete_16608 parseFrom(InputStream input) throws IOException {
         return (S2C_Complete_16608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Complete_16608 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Complete_16608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Complete_16608 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Complete_16608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Complete_16608 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Complete_16608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Complete_16608 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Complete_16608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Complete_16608 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Complete_16608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Complete_16608 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Complete_16608 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Complete_16608> parser() {
         return PARSER;
      }

      public Parser<S2C_Complete_16608> getParserForType() {
         return PARSER;
      }

      public S2C_Complete_16608 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Complete_16608OrBuilder {
         private int bitField0_;
         private CompleteInfo info_;
         private SingleFieldBuilderV3<CompleteInfo, CompleteInfo.Builder, CompleteInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_S2C_Complete_16608_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_S2C_Complete_16608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Complete_16608.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GuanJiaMsg.S2C_Complete_16608.alwaysUseFieldBuilders) {
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
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_S2C_Complete_16608_descriptor;
         }

         public S2C_Complete_16608 getDefaultInstanceForType() {
            return GuanJiaMsg.S2C_Complete_16608.getDefaultInstance();
         }

         public S2C_Complete_16608 build() {
            S2C_Complete_16608 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Complete_16608 buildPartial() {
            S2C_Complete_16608 result = new S2C_Complete_16608(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (CompleteInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_Complete_16608) {
               return this.mergeFrom((S2C_Complete_16608)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Complete_16608 other) {
            if (other == GuanJiaMsg.S2C_Complete_16608.getDefaultInstance()) {
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
            S2C_Complete_16608 parsedMessage = null;

            try {
               parsedMessage = (S2C_Complete_16608)GuanJiaMsg.S2C_Complete_16608.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Complete_16608)e.getUnfinishedMessage();
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

         public CompleteInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? GuanJiaMsg.CompleteInfo.getDefaultInstance() : this.info_;
            } else {
               return (CompleteInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(CompleteInfo value) {
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

         public Builder setInfo(CompleteInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(CompleteInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != GuanJiaMsg.CompleteInfo.getDefaultInstance()) {
                  this.info_ = GuanJiaMsg.CompleteInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public CompleteInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CompleteInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public CompleteInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (CompleteInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? GuanJiaMsg.CompleteInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<CompleteInfo, CompleteInfo.Builder, CompleteInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class C2S_CompleteInfo_16609 extends GeneratedMessageV3 implements C2S_CompleteInfo_16609OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_CompleteInfo_16609 DEFAULT_INSTANCE = new C2S_CompleteInfo_16609();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CompleteInfo_16609> PARSER = new AbstractParser<C2S_CompleteInfo_16609>() {
         public C2S_CompleteInfo_16609 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CompleteInfo_16609(input, extensionRegistry);
         }
      };

      private C2S_CompleteInfo_16609(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CompleteInfo_16609() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CompleteInfo_16609();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CompleteInfo_16609(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_C2S_CompleteInfo_16609_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_C2S_CompleteInfo_16609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CompleteInfo_16609.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CompleteInfo_16609)) {
            return super.equals(obj);
         } else {
            C2S_CompleteInfo_16609 other = (C2S_CompleteInfo_16609)obj;
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

      public static C2S_CompleteInfo_16609 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CompleteInfo_16609)PARSER.parseFrom(data);
      }

      public static C2S_CompleteInfo_16609 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CompleteInfo_16609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CompleteInfo_16609 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CompleteInfo_16609)PARSER.parseFrom(data);
      }

      public static C2S_CompleteInfo_16609 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CompleteInfo_16609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CompleteInfo_16609 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CompleteInfo_16609)PARSER.parseFrom(data);
      }

      public static C2S_CompleteInfo_16609 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CompleteInfo_16609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CompleteInfo_16609 parseFrom(InputStream input) throws IOException {
         return (C2S_CompleteInfo_16609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CompleteInfo_16609 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CompleteInfo_16609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CompleteInfo_16609 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CompleteInfo_16609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CompleteInfo_16609 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CompleteInfo_16609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CompleteInfo_16609 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CompleteInfo_16609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CompleteInfo_16609 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CompleteInfo_16609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CompleteInfo_16609 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CompleteInfo_16609 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CompleteInfo_16609> parser() {
         return PARSER;
      }

      public Parser<C2S_CompleteInfo_16609> getParserForType() {
         return PARSER;
      }

      public C2S_CompleteInfo_16609 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CompleteInfo_16609OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_C2S_CompleteInfo_16609_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_C2S_CompleteInfo_16609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CompleteInfo_16609.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (GuanJiaMsg.C2S_CompleteInfo_16609.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_C2S_CompleteInfo_16609_descriptor;
         }

         public C2S_CompleteInfo_16609 getDefaultInstanceForType() {
            return GuanJiaMsg.C2S_CompleteInfo_16609.getDefaultInstance();
         }

         public C2S_CompleteInfo_16609 build() {
            C2S_CompleteInfo_16609 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CompleteInfo_16609 buildPartial() {
            C2S_CompleteInfo_16609 result = new C2S_CompleteInfo_16609(this);
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
            if (other instanceof C2S_CompleteInfo_16609) {
               return this.mergeFrom((C2S_CompleteInfo_16609)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CompleteInfo_16609 other) {
            if (other == GuanJiaMsg.C2S_CompleteInfo_16609.getDefaultInstance()) {
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
            C2S_CompleteInfo_16609 parsedMessage = null;

            try {
               parsedMessage = (C2S_CompleteInfo_16609)GuanJiaMsg.C2S_CompleteInfo_16609.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CompleteInfo_16609)e.getUnfinishedMessage();
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

   public static final class S2C_CompleteInfo_16610 extends GeneratedMessageV3 implements S2C_CompleteInfo_16610OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFO_FIELD_NUMBER = 1;
      private List<CompleteInfo> info_;
      private byte memoizedIsInitialized;
      private static final S2C_CompleteInfo_16610 DEFAULT_INSTANCE = new S2C_CompleteInfo_16610();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CompleteInfo_16610> PARSER = new AbstractParser<S2C_CompleteInfo_16610>() {
         public S2C_CompleteInfo_16610 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CompleteInfo_16610(input, extensionRegistry);
         }
      };

      private S2C_CompleteInfo_16610(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CompleteInfo_16610() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CompleteInfo_16610();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CompleteInfo_16610(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.info_.add(input.readMessage(GuanJiaMsg.CompleteInfo.PARSER, extensionRegistry));
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
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_S2C_CompleteInfo_16610_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_S2C_CompleteInfo_16610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CompleteInfo_16610.class, Builder.class);
      }

      public List<CompleteInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends CompleteInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public CompleteInfo getInfo(int index) {
         return (CompleteInfo)this.info_.get(index);
      }

      public CompleteInfoOrBuilder getInfoOrBuilder(int index) {
         return (CompleteInfoOrBuilder)this.info_.get(index);
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
         } else if (!(obj instanceof S2C_CompleteInfo_16610)) {
            return super.equals(obj);
         } else {
            S2C_CompleteInfo_16610 other = (S2C_CompleteInfo_16610)obj;
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

      public static S2C_CompleteInfo_16610 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CompleteInfo_16610)PARSER.parseFrom(data);
      }

      public static S2C_CompleteInfo_16610 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CompleteInfo_16610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CompleteInfo_16610 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CompleteInfo_16610)PARSER.parseFrom(data);
      }

      public static S2C_CompleteInfo_16610 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CompleteInfo_16610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CompleteInfo_16610 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CompleteInfo_16610)PARSER.parseFrom(data);
      }

      public static S2C_CompleteInfo_16610 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CompleteInfo_16610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CompleteInfo_16610 parseFrom(InputStream input) throws IOException {
         return (S2C_CompleteInfo_16610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CompleteInfo_16610 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CompleteInfo_16610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CompleteInfo_16610 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CompleteInfo_16610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CompleteInfo_16610 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CompleteInfo_16610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CompleteInfo_16610 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CompleteInfo_16610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CompleteInfo_16610 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CompleteInfo_16610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CompleteInfo_16610 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CompleteInfo_16610 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CompleteInfo_16610> parser() {
         return PARSER;
      }

      public Parser<S2C_CompleteInfo_16610> getParserForType() {
         return PARSER;
      }

      public S2C_CompleteInfo_16610 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CompleteInfo_16610OrBuilder {
         private int bitField0_;
         private List<CompleteInfo> info_;
         private RepeatedFieldBuilderV3<CompleteInfo, CompleteInfo.Builder, CompleteInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_S2C_CompleteInfo_16610_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_S2C_CompleteInfo_16610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CompleteInfo_16610.class, Builder.class);
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
            if (GuanJiaMsg.S2C_CompleteInfo_16610.alwaysUseFieldBuilders) {
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
            return GuanJiaMsg.internal_static_guanJia_com_gzbz_protobuf_S2C_CompleteInfo_16610_descriptor;
         }

         public S2C_CompleteInfo_16610 getDefaultInstanceForType() {
            return GuanJiaMsg.S2C_CompleteInfo_16610.getDefaultInstance();
         }

         public S2C_CompleteInfo_16610 build() {
            S2C_CompleteInfo_16610 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CompleteInfo_16610 buildPartial() {
            S2C_CompleteInfo_16610 result = new S2C_CompleteInfo_16610(this);
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
            if (other instanceof S2C_CompleteInfo_16610) {
               return this.mergeFrom((S2C_CompleteInfo_16610)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CompleteInfo_16610 other) {
            if (other == GuanJiaMsg.S2C_CompleteInfo_16610.getDefaultInstance()) {
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
                     this.infoBuilder_ = GuanJiaMsg.S2C_CompleteInfo_16610.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
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
            S2C_CompleteInfo_16610 parsedMessage = null;

            try {
               parsedMessage = (S2C_CompleteInfo_16610)GuanJiaMsg.S2C_CompleteInfo_16610.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CompleteInfo_16610)e.getUnfinishedMessage();
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

         public List<CompleteInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public CompleteInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (CompleteInfo)this.info_.get(index) : (CompleteInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, CompleteInfo value) {
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

         public Builder setInfo(int index, CompleteInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(CompleteInfo value) {
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

         public Builder addInfo(int index, CompleteInfo value) {
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

         public Builder addInfo(CompleteInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, CompleteInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends CompleteInfo> values) {
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

         public CompleteInfo.Builder getInfoBuilder(int index) {
            return (CompleteInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public CompleteInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (CompleteInfoOrBuilder)this.info_.get(index) : (CompleteInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CompleteInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public CompleteInfo.Builder addInfoBuilder() {
            return (CompleteInfo.Builder)this.getInfoFieldBuilder().addBuilder(GuanJiaMsg.CompleteInfo.getDefaultInstance());
         }

         public CompleteInfo.Builder addInfoBuilder(int index) {
            return (CompleteInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, GuanJiaMsg.CompleteInfo.getDefaultInstance());
         }

         public List<CompleteInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CompleteInfo, CompleteInfo.Builder, CompleteInfoOrBuilder> getInfoFieldBuilder() {
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

   public interface C2S_CompleteInfo_16609OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_GuanJiaInfo_16601OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SelectSystem_16603OrBuilder extends MessageOrBuilder {
      List<CellInfo> getCellInfoList();

      CellInfo getCellInfo(int index);

      int getCellInfoCount();

      List<? extends CellInfoOrBuilder> getCellInfoOrBuilderList();

      CellInfoOrBuilder getCellInfoOrBuilder(int index);
   }

   public interface CellInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      List<Integer> getMisc1List();

      int getMisc1Count();

      int getMisc1(int index);

      boolean hasCount();

      String getCount();

      ByteString getCountBytes();

      boolean hasState();

      int getState();

      boolean hasMark();

      int getMark();
   }

   public interface CompleteInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      List<CommonMsg.ItemInfo> getRewardsList();

      CommonMsg.ItemInfo getRewards(int index);

      int getRewardsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getRewardsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getRewardsOrBuilder(int index);

      boolean hasHurtValue();

      long getHurtValue();
   }

   public interface S2C_CompleteInfo_16610OrBuilder extends MessageOrBuilder {
      List<CompleteInfo> getInfoList();

      CompleteInfo getInfo(int index);

      int getInfoCount();

      List<? extends CompleteInfoOrBuilder> getInfoOrBuilderList();

      CompleteInfoOrBuilder getInfoOrBuilder(int index);
   }

   public interface S2C_Complete_16608OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      CompleteInfo getInfo();

      CompleteInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_GuanJiaInfo_16602OrBuilder extends MessageOrBuilder {
      List<CellInfo> getCellInfoList();

      CellInfo getCellInfo(int index);

      int getCellInfoCount();

      List<? extends CellInfoOrBuilder> getCellInfoOrBuilderList();

      CellInfoOrBuilder getCellInfoOrBuilder(int index);
   }
}
