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

public final class MailMsg {
   private static final Descriptors.Descriptor internal_static_mail_com_gzbz_protobuf_Mail_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mail_com_gzbz_protobuf_Mail_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mail_com_gzbz_protobuf_C2S_MailList_6401_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mail_com_gzbz_protobuf_C2S_MailList_6401_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mail_com_gzbz_protobuf_S2C_MailListData_6402_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mail_com_gzbz_protobuf_S2C_MailListData_6402_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mail_com_gzbz_protobuf_C2S_ReadMail_6403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mail_com_gzbz_protobuf_C2S_ReadMail_6403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mail_com_gzbz_protobuf_S2C_ReadMailResult_6404_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mail_com_gzbz_protobuf_S2C_ReadMailResult_6404_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mail_com_gzbz_protobuf_C2S_OneKeyTakeMail_6405_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mail_com_gzbz_protobuf_C2S_OneKeyTakeMail_6405_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mail_com_gzbz_protobuf_C2S_OneKeyDelMail_6407_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mail_com_gzbz_protobuf_C2S_OneKeyDelMail_6407_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mail_com_gzbz_protobuf_S2C_OneKeyDelMailResult_6408_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mail_com_gzbz_protobuf_S2C_OneKeyDelMailResult_6408_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mail_com_gzbz_protobuf_C2S_DelMail_6409_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mail_com_gzbz_protobuf_C2S_DelMail_6409_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mail_com_gzbz_protobuf_S2C_DelMailResult_6410_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mail_com_gzbz_protobuf_S2C_DelMailResult_6410_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_mail_com_gzbz_protobuf_S2C_AddMailListData_6412_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_mail_com_gzbz_protobuf_S2C_AddMailListData_6412_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private MailMsg() {
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
      String[] descriptorData = new String[]{"\n\nMail.proto\u0012\u0016mail.com.gzbz.protobuf\u001a\fcommon.proto\"Ó\u0001\n\u0004Mail\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005title\u0018\u0003 \u0002(\t\u0012\u000f\n\u0007context\u0018\u0004 \u0002(\t\u0012\u0011\n\tcreatTime\u0018\u0005 \u0002(\u0003\u0012\u0012\n\nenableTime\u0018\u0006 \u0002(\u0003\u00120\n\u0005state\u0018\u0007 \u0002(\u000e2!.mail.com.gzbz.protobuf.MailState\u0012\u001f\n\u0005items\u0018\b \u0003(\u000b2\u0010.common.ItemInfo\u0012\u0015\n\rcentreAwardId\u0018\t \u0001(\u0005\"\u0013\n\u0011C2S_MailList_6401\"R\n\u0015S2C_MailListData_6402\u0012+\n\u0005mails\u0018\u0001 \u0003(\u000b2\u001c.mail.com.gzbz.protobuf.Mail\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\"V\n\u0011C2S_ReadMail_6403\u00123\n\u0004type\u0018\u0001 \u0002(\u000e2%.mail.com.gzbz.protobuf.OperationType\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\"U\n\u0017S2C_ReadMailResult_6404\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012*\n\u0004info\u0018\u0002 \u0002(\u000b2\u001c.mail.com.gzbz.protobuf.Mail\"'\n\u0017C2S_OneKeyTakeMail_6405\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\"&\n\u0016C2S_OneKeyDelMail_6407\u0012\f\n\u0004type\u0018\u0001 \u0001(\u0005\";\n\u001cS2C_OneKeyDelMailResult_6408\u0012\r\n\u0005codes\u0018\u0001 \u0003(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0001(\u0005\" \n\u0010C2S_DelMail_6409\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"D\n\u0016S2C_DelMailResult_6410\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0003 \u0002(\u0005\"G\n\u0018S2C_AddMailListData_6412\u0012+\n\u0005mails\u0018\u0001 \u0003(\u000b2\u001c.mail.com.gzbz.protobuf.Mail*Y\n\tMailState\u0012\u0011\n\rMAILSTATE_NEW\u0010\u0000\u0012\u0012\n\u000eMAILSTATE_READ\u0010\u0001\u0012\u0012\n\u000eMAILSTATE_TAKE\u0010\u0002\u0012\u0011\n\rMAILSTATE_DEL\u0010\u0003*=\n\rOperationType\u0012\r\n\tREAD_MAIL\u0010\u0000\u0012\u000f\n\u000bTAKE_REWARD\u0010\u0001\u0012\f\n\bDEL_MAIL\u0010\u0002B\u001e\n\u0011com.gzbz.protobufB\u0007MailMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_mail_com_gzbz_protobuf_Mail_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_mail_com_gzbz_protobuf_Mail_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mail_com_gzbz_protobuf_Mail_descriptor, new String[]{"Code", "Type", "Title", "Context", "CreatTime", "EnableTime", "State", "Items", "CentreAwardId"});
      internal_static_mail_com_gzbz_protobuf_C2S_MailList_6401_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_mail_com_gzbz_protobuf_C2S_MailList_6401_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mail_com_gzbz_protobuf_C2S_MailList_6401_descriptor, new String[0]);
      internal_static_mail_com_gzbz_protobuf_S2C_MailListData_6402_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_mail_com_gzbz_protobuf_S2C_MailListData_6402_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mail_com_gzbz_protobuf_S2C_MailListData_6402_descriptor, new String[]{"Mails", "Type"});
      internal_static_mail_com_gzbz_protobuf_C2S_ReadMail_6403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_mail_com_gzbz_protobuf_C2S_ReadMail_6403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mail_com_gzbz_protobuf_C2S_ReadMail_6403_descriptor, new String[]{"Type", "Code"});
      internal_static_mail_com_gzbz_protobuf_S2C_ReadMailResult_6404_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_mail_com_gzbz_protobuf_S2C_ReadMailResult_6404_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mail_com_gzbz_protobuf_S2C_ReadMailResult_6404_descriptor, new String[]{"Result", "Info"});
      internal_static_mail_com_gzbz_protobuf_C2S_OneKeyTakeMail_6405_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_mail_com_gzbz_protobuf_C2S_OneKeyTakeMail_6405_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mail_com_gzbz_protobuf_C2S_OneKeyTakeMail_6405_descriptor, new String[]{"Type"});
      internal_static_mail_com_gzbz_protobuf_C2S_OneKeyDelMail_6407_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_mail_com_gzbz_protobuf_C2S_OneKeyDelMail_6407_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mail_com_gzbz_protobuf_C2S_OneKeyDelMail_6407_descriptor, new String[]{"Type"});
      internal_static_mail_com_gzbz_protobuf_S2C_OneKeyDelMailResult_6408_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_mail_com_gzbz_protobuf_S2C_OneKeyDelMailResult_6408_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mail_com_gzbz_protobuf_S2C_OneKeyDelMailResult_6408_descriptor, new String[]{"Codes", "Type"});
      internal_static_mail_com_gzbz_protobuf_C2S_DelMail_6409_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_mail_com_gzbz_protobuf_C2S_DelMail_6409_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mail_com_gzbz_protobuf_C2S_DelMail_6409_descriptor, new String[]{"Code"});
      internal_static_mail_com_gzbz_protobuf_S2C_DelMailResult_6410_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_mail_com_gzbz_protobuf_S2C_DelMailResult_6410_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mail_com_gzbz_protobuf_S2C_DelMailResult_6410_descriptor, new String[]{"Result", "Code", "Type"});
      internal_static_mail_com_gzbz_protobuf_S2C_AddMailListData_6412_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_mail_com_gzbz_protobuf_S2C_AddMailListData_6412_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_mail_com_gzbz_protobuf_S2C_AddMailListData_6412_descriptor, new String[]{"Mails"});
      CommonMsg.getDescriptor();
   }

   public static enum MailState implements ProtocolMessageEnum {
      MAILSTATE_NEW(0),
      MAILSTATE_READ(1),
      MAILSTATE_TAKE(2),
      MAILSTATE_DEL(3);

      public static final int MAILSTATE_NEW_VALUE = 0;
      public static final int MAILSTATE_READ_VALUE = 1;
      public static final int MAILSTATE_TAKE_VALUE = 2;
      public static final int MAILSTATE_DEL_VALUE = 3;
      private static final Internal.EnumLiteMap<MailState> internalValueMap = new Internal.EnumLiteMap<MailState>() {
         public MailState findValueByNumber(int number) {
            return MailMsg.MailState.forNumber(number);
         }
      };
      private static final MailState[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static MailState valueOf(int value) {
         return forNumber(value);
      }

      public static MailState forNumber(int value) {
         switch (value) {
            case 0:
               return MAILSTATE_NEW;
            case 1:
               return MAILSTATE_READ;
            case 2:
               return MAILSTATE_TAKE;
            case 3:
               return MAILSTATE_DEL;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<MailState> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)MailMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static MailState valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private MailState(int value) {
         this.value = value;
      }
   }

   public static enum OperationType implements ProtocolMessageEnum {
      READ_MAIL(0),
      TAKE_REWARD(1),
      DEL_MAIL(2);

      public static final int READ_MAIL_VALUE = 0;
      public static final int TAKE_REWARD_VALUE = 1;
      public static final int DEL_MAIL_VALUE = 2;
      private static final Internal.EnumLiteMap<OperationType> internalValueMap = new Internal.EnumLiteMap<OperationType>() {
         public OperationType findValueByNumber(int number) {
            return MailMsg.OperationType.forNumber(number);
         }
      };
      private static final OperationType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static OperationType valueOf(int value) {
         return forNumber(value);
      }

      public static OperationType forNumber(int value) {
         switch (value) {
            case 0:
               return READ_MAIL;
            case 1:
               return TAKE_REWARD;
            case 2:
               return DEL_MAIL;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<OperationType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)MailMsg.getDescriptor().getEnumTypes().get(1);
      }

      public static OperationType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private OperationType(int value) {
         this.value = value;
      }
   }

   public static final class Mail extends GeneratedMessageV3 implements MailOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      public static final int TITLE_FIELD_NUMBER = 3;
      private volatile Object title_;
      public static final int CONTEXT_FIELD_NUMBER = 4;
      private volatile Object context_;
      public static final int CREATTIME_FIELD_NUMBER = 5;
      private long creatTime_;
      public static final int ENABLETIME_FIELD_NUMBER = 6;
      private long enableTime_;
      public static final int STATE_FIELD_NUMBER = 7;
      private int state_;
      public static final int ITEMS_FIELD_NUMBER = 8;
      private List<CommonMsg.ItemInfo> items_;
      public static final int CENTREAWARDID_FIELD_NUMBER = 9;
      private int centreAwardId_;
      private byte memoizedIsInitialized;
      private static final Mail DEFAULT_INSTANCE = new Mail();
      /** @deprecated */
      @Deprecated
      public static final Parser<Mail> PARSER = new AbstractParser<Mail>() {
         public Mail parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new Mail(input, extensionRegistry);
         }
      };

      private Mail(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private Mail() {
         this.memoizedIsInitialized = -1;
         this.title_ = "";
         this.context_ = "";
         this.state_ = 0;
         this.items_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new Mail();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private Mail(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.title_ = bs;
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.context_ = bs;
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.creatTime_ = input.readInt64();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.enableTime_ = input.readInt64();
                        break;
                     case 56:
                        int rawValue = input.readEnum();
                        MailState value = MailMsg.MailState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(7, rawValue);
                        } else {
                           this.bitField0_ |= 64;
                           this.state_ = rawValue;
                        }
                        break;
                     case 66:
                        if ((mutable_bitField0_ & 128) == 0) {
                           this.items_ = new ArrayList();
                           mutable_bitField0_ |= 128;
                        }

                        this.items_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     case 72:
                        this.bitField0_ |= 128;
                        this.centreAwardId_ = input.readInt32();
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
               if ((mutable_bitField0_ & 128) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MailMsg.internal_static_mail_com_gzbz_protobuf_Mail_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MailMsg.internal_static_mail_com_gzbz_protobuf_Mail_fieldAccessorTable.ensureFieldAccessorsInitialized(Mail.class, Builder.class);
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

      public boolean hasTitle() {
         return (this.bitField0_ & 4) != 0;
      }

      public String getTitle() {
         Object ref = this.title_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.title_ = s;
            }

            return s;
         }
      }

      public ByteString getTitleBytes() {
         Object ref = this.title_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.title_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasContext() {
         return (this.bitField0_ & 8) != 0;
      }

      public String getContext() {
         Object ref = this.context_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.context_ = s;
            }

            return s;
         }
      }

      public ByteString getContextBytes() {
         Object ref = this.context_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.context_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasCreatTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public long getCreatTime() {
         return this.creatTime_;
      }

      public boolean hasEnableTime() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getEnableTime() {
         return this.enableTime_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 64) != 0;
      }

      public MailState getState() {
         MailState result = MailMsg.MailState.valueOf(this.state_);
         return result == null ? MailMsg.MailState.MAILSTATE_NEW : result;
      }

      public List<CommonMsg.ItemInfo> getItemsList() {
         return this.items_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
         return this.items_;
      }

      public int getItemsCount() {
         return this.items_.size();
      }

      public CommonMsg.ItemInfo getItems(int index) {
         return (CommonMsg.ItemInfo)this.items_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.items_.get(index);
      }

      public boolean hasCentreAwardId() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getCentreAwardId() {
         return this.centreAwardId_;
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
         } else if (!this.hasTitle()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasContext()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCreatTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEnableTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getItemsCount(); ++i) {
               if (!this.getItems(i).isInitialized()) {
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
            output.writeInt32(2, this.type_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.title_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.context_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt64(5, this.creatTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt64(6, this.enableTime_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeEnum(7, this.state_);
         }

         for(int i = 0; i < this.items_.size(); ++i) {
            output.writeMessage(8, (MessageLite)this.items_.get(i));
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(9, this.centreAwardId_);
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

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.title_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.context_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt64Size(5, this.creatTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.enableTime_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeEnumSize(7, this.state_);
            }

            for(int i = 0; i < this.items_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(8, (MessageLite)this.items_.get(i));
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.centreAwardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof Mail)) {
            return super.equals(obj);
         } else {
            Mail other = (Mail)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasTitle() != other.hasTitle()) {
               return false;
            } else if (this.hasTitle() && !this.getTitle().equals(other.getTitle())) {
               return false;
            } else if (this.hasContext() != other.hasContext()) {
               return false;
            } else if (this.hasContext() && !this.getContext().equals(other.getContext())) {
               return false;
            } else if (this.hasCreatTime() != other.hasCreatTime()) {
               return false;
            } else if (this.hasCreatTime() && this.getCreatTime() != other.getCreatTime()) {
               return false;
            } else if (this.hasEnableTime() != other.hasEnableTime()) {
               return false;
            } else if (this.hasEnableTime() && this.getEnableTime() != other.getEnableTime()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.state_ != other.state_) {
               return false;
            } else if (!this.getItemsList().equals(other.getItemsList())) {
               return false;
            } else if (this.hasCentreAwardId() != other.hasCentreAwardId()) {
               return false;
            } else if (this.hasCentreAwardId() && this.getCentreAwardId() != other.getCentreAwardId()) {
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

            if (this.hasTitle()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTitle().hashCode();
            }

            if (this.hasContext()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getContext().hashCode();
            }

            if (this.hasCreatTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashLong(this.getCreatTime());
            }

            if (this.hasEnableTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getEnableTime());
            }

            if (this.hasState()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.state_;
            }

            if (this.getItemsCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getItemsList().hashCode();
            }

            if (this.hasCentreAwardId()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getCentreAwardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static Mail parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (Mail)PARSER.parseFrom(data);
      }

      public static Mail parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Mail)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Mail parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (Mail)PARSER.parseFrom(data);
      }

      public static Mail parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Mail)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Mail parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (Mail)PARSER.parseFrom(data);
      }

      public static Mail parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (Mail)PARSER.parseFrom(data, extensionRegistry);
      }

      public static Mail parseFrom(InputStream input) throws IOException {
         return (Mail)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Mail parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Mail)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static Mail parseDelimitedFrom(InputStream input) throws IOException {
         return (Mail)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static Mail parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Mail)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static Mail parseFrom(CodedInputStream input) throws IOException {
         return (Mail)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static Mail parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (Mail)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(Mail prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static Mail getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<Mail> parser() {
         return PARSER;
      }

      public Parser<Mail> getParserForType() {
         return PARSER;
      }

      public Mail getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MailOrBuilder {
         private int bitField0_;
         private int code_;
         private int type_;
         private Object title_;
         private Object context_;
         private long creatTime_;
         private long enableTime_;
         private int state_;
         private List<CommonMsg.ItemInfo> items_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemsBuilder_;
         private int centreAwardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_Mail_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_Mail_fieldAccessorTable.ensureFieldAccessorsInitialized(Mail.class, Builder.class);
         }

         private Builder() {
            this.title_ = "";
            this.context_ = "";
            this.state_ = 0;
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.title_ = "";
            this.context_ = "";
            this.state_ = 0;
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MailMsg.Mail.alwaysUseFieldBuilders) {
               this.getItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            this.title_ = "";
            this.bitField0_ &= -5;
            this.context_ = "";
            this.bitField0_ &= -9;
            this.creatTime_ = 0L;
            this.bitField0_ &= -17;
            this.enableTime_ = 0L;
            this.bitField0_ &= -33;
            this.state_ = 0;
            this.bitField0_ &= -65;
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -129;
            } else {
               this.itemsBuilder_.clear();
            }

            this.centreAwardId_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_Mail_descriptor;
         }

         public Mail getDefaultInstanceForType() {
            return MailMsg.Mail.getDefaultInstance();
         }

         public Mail build() {
            Mail result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public Mail buildPartial() {
            Mail result = new Mail(this);
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

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.title_ = this.title_;
            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.context_ = this.context_;
            if ((from_bitField0_ & 16) != 0) {
               result.creatTime_ = this.creatTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.enableTime_ = this.enableTime_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               to_bitField0_ |= 64;
            }

            result.state_ = this.state_;
            if (this.itemsBuilder_ == null) {
               if ((this.bitField0_ & 128) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
                  this.bitField0_ &= -129;
               }

               result.items_ = this.items_;
            } else {
               result.items_ = this.itemsBuilder_.build();
            }

            if ((from_bitField0_ & 256) != 0) {
               result.centreAwardId_ = this.centreAwardId_;
               to_bitField0_ |= 128;
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
            if (other instanceof Mail) {
               return this.mergeFrom((Mail)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(Mail other) {
            if (other == MailMsg.Mail.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasTitle()) {
                  this.bitField0_ |= 4;
                  this.title_ = other.title_;
                  this.onChanged();
               }

               if (other.hasContext()) {
                  this.bitField0_ |= 8;
                  this.context_ = other.context_;
                  this.onChanged();
               }

               if (other.hasCreatTime()) {
                  this.setCreatTime(other.getCreatTime());
               }

               if (other.hasEnableTime()) {
                  this.setEnableTime(other.getEnableTime());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (this.itemsBuilder_ == null) {
                  if (!other.items_.isEmpty()) {
                     if (this.items_.isEmpty()) {
                        this.items_ = other.items_;
                        this.bitField0_ &= -129;
                     } else {
                        this.ensureItemsIsMutable();
                        this.items_.addAll(other.items_);
                     }

                     this.onChanged();
                  }
               } else if (!other.items_.isEmpty()) {
                  if (this.itemsBuilder_.isEmpty()) {
                     this.itemsBuilder_.dispose();
                     this.itemsBuilder_ = null;
                     this.items_ = other.items_;
                     this.bitField0_ &= -129;
                     this.itemsBuilder_ = MailMsg.Mail.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
                  } else {
                     this.itemsBuilder_.addAllMessages(other.items_);
                  }
               }

               if (other.hasCentreAwardId()) {
                  this.setCentreAwardId(other.getCentreAwardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else if (!this.hasTitle()) {
               return false;
            } else if (!this.hasContext()) {
               return false;
            } else if (!this.hasCreatTime()) {
               return false;
            } else if (!this.hasEnableTime()) {
               return false;
            } else if (!this.hasState()) {
               return false;
            } else {
               for(int i = 0; i < this.getItemsCount(); ++i) {
                  if (!this.getItems(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            Mail parsedMessage = null;

            try {
               parsedMessage = (Mail)MailMsg.Mail.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (Mail)e.getUnfinishedMessage();
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

         public boolean hasTitle() {
            return (this.bitField0_ & 4) != 0;
         }

         public String getTitle() {
            Object ref = this.title_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.title_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getTitleBytes() {
            Object ref = this.title_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.title_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setTitle(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.title_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearTitle() {
            this.bitField0_ &= -5;
            this.title_ = MailMsg.Mail.getDefaultInstance().getTitle();
            this.onChanged();
            return this;
         }

         public Builder setTitleBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.title_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasContext() {
            return (this.bitField0_ & 8) != 0;
         }

         public String getContext() {
            Object ref = this.context_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.context_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getContextBytes() {
            Object ref = this.context_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.context_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setContext(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.context_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearContext() {
            this.bitField0_ &= -9;
            this.context_ = MailMsg.Mail.getDefaultInstance().getContext();
            this.onChanged();
            return this;
         }

         public Builder setContextBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.context_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasCreatTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public long getCreatTime() {
            return this.creatTime_;
         }

         public Builder setCreatTime(long value) {
            this.bitField0_ |= 16;
            this.creatTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCreatTime() {
            this.bitField0_ &= -17;
            this.creatTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasEnableTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getEnableTime() {
            return this.enableTime_;
         }

         public Builder setEnableTime(long value) {
            this.bitField0_ |= 32;
            this.enableTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnableTime() {
            this.bitField0_ &= -33;
            this.enableTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 64) != 0;
         }

         public MailState getState() {
            MailState result = MailMsg.MailState.valueOf(this.state_);
            return result == null ? MailMsg.MailState.MAILSTATE_NEW : result;
         }

         public Builder setState(MailState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 64;
               this.state_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearState() {
            this.bitField0_ &= -65;
            this.state_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.items_ = new ArrayList(this.items_);
               this.bitField0_ |= 128;
            }

         }

         public List<CommonMsg.ItemInfo> getItemsList() {
            return this.itemsBuilder_ == null ? Collections.unmodifiableList(this.items_) : this.itemsBuilder_.getMessageList();
         }

         public int getItemsCount() {
            return this.itemsBuilder_ == null ? this.items_.size() : this.itemsBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItems(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfo)this.items_.get(index) : (CommonMsg.ItemInfo)this.itemsBuilder_.getMessage(index);
         }

         public Builder setItems(int index, CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.set(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItems(CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItems(int index, CommonMsg.ItemInfo value) {
            if (this.itemsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemsIsMutable();
               this.items_.add(index, value);
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItems(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItems(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.items_);
               this.onChanged();
            } else {
               this.itemsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItems() {
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -129;
               this.onChanged();
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Builder removeItems(int index) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.remove(index);
               this.onChanged();
            } else {
               this.itemsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.items_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
            return this.itemsBuilder_ != null ? this.itemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemsBuilderList() {
            return this.getItemsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
               this.itemsBuilder_ = new RepeatedFieldBuilderV3(this.items_, (this.bitField0_ & 128) != 0, this.getParentForChildren(), this.isClean());
               this.items_ = null;
            }

            return this.itemsBuilder_;
         }

         public boolean hasCentreAwardId() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getCentreAwardId() {
            return this.centreAwardId_;
         }

         public Builder setCentreAwardId(int value) {
            this.bitField0_ |= 256;
            this.centreAwardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCentreAwardId() {
            this.bitField0_ &= -257;
            this.centreAwardId_ = 0;
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

   public static final class C2S_MailList_6401 extends GeneratedMessageV3 implements C2S_MailList_6401OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_MailList_6401 DEFAULT_INSTANCE = new C2S_MailList_6401();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MailList_6401> PARSER = new AbstractParser<C2S_MailList_6401>() {
         public C2S_MailList_6401 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MailList_6401(input, extensionRegistry);
         }
      };

      private C2S_MailList_6401(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MailList_6401() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MailList_6401();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MailList_6401(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_MailList_6401_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_MailList_6401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MailList_6401.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MailList_6401)) {
            return super.equals(obj);
         } else {
            C2S_MailList_6401 other = (C2S_MailList_6401)obj;
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

      public static C2S_MailList_6401 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MailList_6401)PARSER.parseFrom(data);
      }

      public static C2S_MailList_6401 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MailList_6401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MailList_6401 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MailList_6401)PARSER.parseFrom(data);
      }

      public static C2S_MailList_6401 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MailList_6401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MailList_6401 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MailList_6401)PARSER.parseFrom(data);
      }

      public static C2S_MailList_6401 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MailList_6401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MailList_6401 parseFrom(InputStream input) throws IOException {
         return (C2S_MailList_6401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MailList_6401 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MailList_6401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MailList_6401 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MailList_6401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MailList_6401 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MailList_6401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MailList_6401 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MailList_6401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MailList_6401 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MailList_6401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MailList_6401 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MailList_6401 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MailList_6401> parser() {
         return PARSER;
      }

      public Parser<C2S_MailList_6401> getParserForType() {
         return PARSER;
      }

      public C2S_MailList_6401 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MailList_6401OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_MailList_6401_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_MailList_6401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MailList_6401.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MailMsg.C2S_MailList_6401.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_MailList_6401_descriptor;
         }

         public C2S_MailList_6401 getDefaultInstanceForType() {
            return MailMsg.C2S_MailList_6401.getDefaultInstance();
         }

         public C2S_MailList_6401 build() {
            C2S_MailList_6401 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MailList_6401 buildPartial() {
            C2S_MailList_6401 result = new C2S_MailList_6401(this);
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
            if (other instanceof C2S_MailList_6401) {
               return this.mergeFrom((C2S_MailList_6401)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MailList_6401 other) {
            if (other == MailMsg.C2S_MailList_6401.getDefaultInstance()) {
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
            C2S_MailList_6401 parsedMessage = null;

            try {
               parsedMessage = (C2S_MailList_6401)MailMsg.C2S_MailList_6401.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MailList_6401)e.getUnfinishedMessage();
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

   public static final class S2C_MailListData_6402 extends GeneratedMessageV3 implements S2C_MailListData_6402OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAILS_FIELD_NUMBER = 1;
      private List<Mail> mails_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2C_MailListData_6402 DEFAULT_INSTANCE = new S2C_MailListData_6402();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MailListData_6402> PARSER = new AbstractParser<S2C_MailListData_6402>() {
         public S2C_MailListData_6402 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MailListData_6402(input, extensionRegistry);
         }
      };

      private S2C_MailListData_6402(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MailListData_6402() {
         this.memoizedIsInitialized = -1;
         this.mails_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MailListData_6402();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MailListData_6402(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.mails_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.mails_.add(input.readMessage(MailMsg.Mail.PARSER, extensionRegistry));
                        break;
                     case 16:
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.mails_ = Collections.unmodifiableList(this.mails_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_MailListData_6402_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_MailListData_6402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MailListData_6402.class, Builder.class);
      }

      public List<Mail> getMailsList() {
         return this.mails_;
      }

      public List<? extends MailOrBuilder> getMailsOrBuilderList() {
         return this.mails_;
      }

      public int getMailsCount() {
         return this.mails_.size();
      }

      public Mail getMails(int index) {
         return (Mail)this.mails_.get(index);
      }

      public MailOrBuilder getMailsOrBuilder(int index) {
         return (MailOrBuilder)this.mails_.get(index);
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
            for(int i = 0; i < this.getMailsCount(); ++i) {
               if (!this.getMails(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.mails_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.mails_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
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

            for(int i = 0; i < this.mails_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.mails_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
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
         } else if (!(obj instanceof S2C_MailListData_6402)) {
            return super.equals(obj);
         } else {
            S2C_MailListData_6402 other = (S2C_MailListData_6402)obj;
            if (!this.getMailsList().equals(other.getMailsList())) {
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
            if (this.getMailsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMailsList().hashCode();
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

      public static S2C_MailListData_6402 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MailListData_6402)PARSER.parseFrom(data);
      }

      public static S2C_MailListData_6402 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MailListData_6402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MailListData_6402 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MailListData_6402)PARSER.parseFrom(data);
      }

      public static S2C_MailListData_6402 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MailListData_6402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MailListData_6402 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MailListData_6402)PARSER.parseFrom(data);
      }

      public static S2C_MailListData_6402 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MailListData_6402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MailListData_6402 parseFrom(InputStream input) throws IOException {
         return (S2C_MailListData_6402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MailListData_6402 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MailListData_6402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MailListData_6402 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MailListData_6402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MailListData_6402 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MailListData_6402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MailListData_6402 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MailListData_6402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MailListData_6402 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MailListData_6402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MailListData_6402 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MailListData_6402 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MailListData_6402> parser() {
         return PARSER;
      }

      public Parser<S2C_MailListData_6402> getParserForType() {
         return PARSER;
      }

      public S2C_MailListData_6402 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MailListData_6402OrBuilder {
         private int bitField0_;
         private List<Mail> mails_;
         private RepeatedFieldBuilderV3<Mail, Mail.Builder, MailOrBuilder> mailsBuilder_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_MailListData_6402_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_MailListData_6402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MailListData_6402.class, Builder.class);
         }

         private Builder() {
            this.mails_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.mails_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MailMsg.S2C_MailListData_6402.alwaysUseFieldBuilders) {
               this.getMailsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.mailsBuilder_ == null) {
               this.mails_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.mailsBuilder_.clear();
            }

            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_MailListData_6402_descriptor;
         }

         public S2C_MailListData_6402 getDefaultInstanceForType() {
            return MailMsg.S2C_MailListData_6402.getDefaultInstance();
         }

         public S2C_MailListData_6402 build() {
            S2C_MailListData_6402 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MailListData_6402 buildPartial() {
            S2C_MailListData_6402 result = new S2C_MailListData_6402(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.mailsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.mails_ = Collections.unmodifiableList(this.mails_);
                  this.bitField0_ &= -2;
               }

               result.mails_ = this.mails_;
            } else {
               result.mails_ = this.mailsBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
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
            if (other instanceof S2C_MailListData_6402) {
               return this.mergeFrom((S2C_MailListData_6402)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MailListData_6402 other) {
            if (other == MailMsg.S2C_MailListData_6402.getDefaultInstance()) {
               return this;
            } else {
               if (this.mailsBuilder_ == null) {
                  if (!other.mails_.isEmpty()) {
                     if (this.mails_.isEmpty()) {
                        this.mails_ = other.mails_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureMailsIsMutable();
                        this.mails_.addAll(other.mails_);
                     }

                     this.onChanged();
                  }
               } else if (!other.mails_.isEmpty()) {
                  if (this.mailsBuilder_.isEmpty()) {
                     this.mailsBuilder_.dispose();
                     this.mailsBuilder_ = null;
                     this.mails_ = other.mails_;
                     this.bitField0_ &= -2;
                     this.mailsBuilder_ = MailMsg.S2C_MailListData_6402.alwaysUseFieldBuilders ? this.getMailsFieldBuilder() : null;
                  } else {
                     this.mailsBuilder_.addAllMessages(other.mails_);
                  }
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
            if (!this.hasType()) {
               return false;
            } else {
               for(int i = 0; i < this.getMailsCount(); ++i) {
                  if (!this.getMails(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MailListData_6402 parsedMessage = null;

            try {
               parsedMessage = (S2C_MailListData_6402)MailMsg.S2C_MailListData_6402.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MailListData_6402)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureMailsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.mails_ = new ArrayList(this.mails_);
               this.bitField0_ |= 1;
            }

         }

         public List<Mail> getMailsList() {
            return this.mailsBuilder_ == null ? Collections.unmodifiableList(this.mails_) : this.mailsBuilder_.getMessageList();
         }

         public int getMailsCount() {
            return this.mailsBuilder_ == null ? this.mails_.size() : this.mailsBuilder_.getCount();
         }

         public Mail getMails(int index) {
            return this.mailsBuilder_ == null ? (Mail)this.mails_.get(index) : (Mail)this.mailsBuilder_.getMessage(index);
         }

         public Builder setMails(int index, Mail value) {
            if (this.mailsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMailsIsMutable();
               this.mails_.set(index, value);
               this.onChanged();
            } else {
               this.mailsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMails(int index, Mail.Builder builderForValue) {
            if (this.mailsBuilder_ == null) {
               this.ensureMailsIsMutable();
               this.mails_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.mailsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMails(Mail value) {
            if (this.mailsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMailsIsMutable();
               this.mails_.add(value);
               this.onChanged();
            } else {
               this.mailsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMails(int index, Mail value) {
            if (this.mailsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMailsIsMutable();
               this.mails_.add(index, value);
               this.onChanged();
            } else {
               this.mailsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMails(Mail.Builder builderForValue) {
            if (this.mailsBuilder_ == null) {
               this.ensureMailsIsMutable();
               this.mails_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.mailsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMails(int index, Mail.Builder builderForValue) {
            if (this.mailsBuilder_ == null) {
               this.ensureMailsIsMutable();
               this.mails_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.mailsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMails(Iterable<? extends Mail> values) {
            if (this.mailsBuilder_ == null) {
               this.ensureMailsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.mails_);
               this.onChanged();
            } else {
               this.mailsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMails() {
            if (this.mailsBuilder_ == null) {
               this.mails_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.mailsBuilder_.clear();
            }

            return this;
         }

         public Builder removeMails(int index) {
            if (this.mailsBuilder_ == null) {
               this.ensureMailsIsMutable();
               this.mails_.remove(index);
               this.onChanged();
            } else {
               this.mailsBuilder_.remove(index);
            }

            return this;
         }

         public Mail.Builder getMailsBuilder(int index) {
            return (Mail.Builder)this.getMailsFieldBuilder().getBuilder(index);
         }

         public MailOrBuilder getMailsOrBuilder(int index) {
            return this.mailsBuilder_ == null ? (MailOrBuilder)this.mails_.get(index) : (MailOrBuilder)this.mailsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MailOrBuilder> getMailsOrBuilderList() {
            return this.mailsBuilder_ != null ? this.mailsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.mails_);
         }

         public Mail.Builder addMailsBuilder() {
            return (Mail.Builder)this.getMailsFieldBuilder().addBuilder(MailMsg.Mail.getDefaultInstance());
         }

         public Mail.Builder addMailsBuilder(int index) {
            return (Mail.Builder)this.getMailsFieldBuilder().addBuilder(index, MailMsg.Mail.getDefaultInstance());
         }

         public List<Mail.Builder> getMailsBuilderList() {
            return this.getMailsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Mail, Mail.Builder, MailOrBuilder> getMailsFieldBuilder() {
            if (this.mailsBuilder_ == null) {
               this.mailsBuilder_ = new RepeatedFieldBuilderV3(this.mails_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.mails_ = null;
            }

            return this.mailsBuilder_;
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

   public static final class C2S_ReadMail_6403 extends GeneratedMessageV3 implements C2S_ReadMail_6403OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_ReadMail_6403 DEFAULT_INSTANCE = new C2S_ReadMail_6403();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReadMail_6403> PARSER = new AbstractParser<C2S_ReadMail_6403>() {
         public C2S_ReadMail_6403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReadMail_6403(input, extensionRegistry);
         }
      };

      private C2S_ReadMail_6403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReadMail_6403() {
         this.memoizedIsInitialized = -1;
         this.type_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReadMail_6403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReadMail_6403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        OperationType value = MailMsg.OperationType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.type_ = rawValue;
                        }
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
         return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_ReadMail_6403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_ReadMail_6403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReadMail_6403.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public OperationType getType() {
         OperationType result = MailMsg.OperationType.valueOf(this.type_);
         return result == null ? MailMsg.OperationType.READ_MAIL : result;
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
         } else if (!this.hasType()) {
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
            output.writeEnum(1, this.type_);
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
               size += CodedOutputStream.computeEnumSize(1, this.type_);
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
         } else if (!(obj instanceof C2S_ReadMail_6403)) {
            return super.equals(obj);
         } else {
            C2S_ReadMail_6403 other = (C2S_ReadMail_6403)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.type_;
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

      public static C2S_ReadMail_6403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReadMail_6403)PARSER.parseFrom(data);
      }

      public static C2S_ReadMail_6403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReadMail_6403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReadMail_6403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReadMail_6403)PARSER.parseFrom(data);
      }

      public static C2S_ReadMail_6403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReadMail_6403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReadMail_6403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReadMail_6403)PARSER.parseFrom(data);
      }

      public static C2S_ReadMail_6403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReadMail_6403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReadMail_6403 parseFrom(InputStream input) throws IOException {
         return (C2S_ReadMail_6403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReadMail_6403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReadMail_6403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReadMail_6403 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReadMail_6403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReadMail_6403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReadMail_6403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReadMail_6403 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReadMail_6403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReadMail_6403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReadMail_6403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReadMail_6403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReadMail_6403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReadMail_6403> parser() {
         return PARSER;
      }

      public Parser<C2S_ReadMail_6403> getParserForType() {
         return PARSER;
      }

      public C2S_ReadMail_6403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReadMail_6403OrBuilder {
         private int bitField0_;
         private int type_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_ReadMail_6403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_ReadMail_6403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReadMail_6403.class, Builder.class);
         }

         private Builder() {
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MailMsg.C2S_ReadMail_6403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_ReadMail_6403_descriptor;
         }

         public C2S_ReadMail_6403 getDefaultInstanceForType() {
            return MailMsg.C2S_ReadMail_6403.getDefaultInstance();
         }

         public C2S_ReadMail_6403 build() {
            C2S_ReadMail_6403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReadMail_6403 buildPartial() {
            C2S_ReadMail_6403 result = new C2S_ReadMail_6403(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.type_ = this.type_;
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
            if (other instanceof C2S_ReadMail_6403) {
               return this.mergeFrom((C2S_ReadMail_6403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReadMail_6403 other) {
            if (other == MailMsg.C2S_ReadMail_6403.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
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
            if (!this.hasType()) {
               return false;
            } else {
               return this.hasCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ReadMail_6403 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReadMail_6403)MailMsg.C2S_ReadMail_6403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReadMail_6403)e.getUnfinishedMessage();
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

         public OperationType getType() {
            OperationType result = MailMsg.OperationType.valueOf(this.type_);
            return result == null ? MailMsg.OperationType.READ_MAIL : result;
         }

         public Builder setType(OperationType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
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

   public static final class S2C_ReadMailResult_6404 extends GeneratedMessageV3 implements S2C_ReadMailResult_6404OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int INFO_FIELD_NUMBER = 2;
      private Mail info_;
      private byte memoizedIsInitialized;
      private static final S2C_ReadMailResult_6404 DEFAULT_INSTANCE = new S2C_ReadMailResult_6404();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReadMailResult_6404> PARSER = new AbstractParser<S2C_ReadMailResult_6404>() {
         public S2C_ReadMailResult_6404 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReadMailResult_6404(input, extensionRegistry);
         }
      };

      private S2C_ReadMailResult_6404(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReadMailResult_6404() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReadMailResult_6404();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReadMailResult_6404(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        Mail.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (Mail)input.readMessage(MailMsg.Mail.PARSER, extensionRegistry);
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
         return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_ReadMailResult_6404_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_ReadMailResult_6404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReadMailResult_6404.class, Builder.class);
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

      public Mail getInfo() {
         return this.info_ == null ? MailMsg.Mail.getDefaultInstance() : this.info_;
      }

      public MailOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? MailMsg.Mail.getDefaultInstance() : this.info_;
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
         } else if (!(obj instanceof S2C_ReadMailResult_6404)) {
            return super.equals(obj);
         } else {
            S2C_ReadMailResult_6404 other = (S2C_ReadMailResult_6404)obj;
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

      public static S2C_ReadMailResult_6404 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReadMailResult_6404)PARSER.parseFrom(data);
      }

      public static S2C_ReadMailResult_6404 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReadMailResult_6404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReadMailResult_6404 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReadMailResult_6404)PARSER.parseFrom(data);
      }

      public static S2C_ReadMailResult_6404 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReadMailResult_6404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReadMailResult_6404 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReadMailResult_6404)PARSER.parseFrom(data);
      }

      public static S2C_ReadMailResult_6404 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReadMailResult_6404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReadMailResult_6404 parseFrom(InputStream input) throws IOException {
         return (S2C_ReadMailResult_6404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReadMailResult_6404 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReadMailResult_6404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReadMailResult_6404 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReadMailResult_6404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReadMailResult_6404 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReadMailResult_6404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReadMailResult_6404 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReadMailResult_6404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReadMailResult_6404 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReadMailResult_6404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReadMailResult_6404 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReadMailResult_6404 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReadMailResult_6404> parser() {
         return PARSER;
      }

      public Parser<S2C_ReadMailResult_6404> getParserForType() {
         return PARSER;
      }

      public S2C_ReadMailResult_6404 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReadMailResult_6404OrBuilder {
         private int bitField0_;
         private int result_;
         private Mail info_;
         private SingleFieldBuilderV3<Mail, Mail.Builder, MailOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_ReadMailResult_6404_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_ReadMailResult_6404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReadMailResult_6404.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MailMsg.S2C_ReadMailResult_6404.alwaysUseFieldBuilders) {
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
            return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_ReadMailResult_6404_descriptor;
         }

         public S2C_ReadMailResult_6404 getDefaultInstanceForType() {
            return MailMsg.S2C_ReadMailResult_6404.getDefaultInstance();
         }

         public S2C_ReadMailResult_6404 build() {
            S2C_ReadMailResult_6404 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReadMailResult_6404 buildPartial() {
            S2C_ReadMailResult_6404 result = new S2C_ReadMailResult_6404(this);
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
                  result.info_ = (Mail)this.infoBuilder_.build();
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
            if (other instanceof S2C_ReadMailResult_6404) {
               return this.mergeFrom((S2C_ReadMailResult_6404)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReadMailResult_6404 other) {
            if (other == MailMsg.S2C_ReadMailResult_6404.getDefaultInstance()) {
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
            S2C_ReadMailResult_6404 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReadMailResult_6404)MailMsg.S2C_ReadMailResult_6404.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReadMailResult_6404)e.getUnfinishedMessage();
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

         public Mail getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? MailMsg.Mail.getDefaultInstance() : this.info_;
            } else {
               return (Mail)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(Mail value) {
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

         public Builder setInfo(Mail.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeInfo(Mail value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.info_ != null && this.info_ != MailMsg.Mail.getDefaultInstance()) {
                  this.info_ = MailMsg.Mail.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public Mail.Builder getInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (Mail.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public MailOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (MailOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? MailMsg.Mail.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<Mail, Mail.Builder, MailOrBuilder> getInfoFieldBuilder() {
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

   public static final class C2S_OneKeyTakeMail_6405 extends GeneratedMessageV3 implements C2S_OneKeyTakeMail_6405OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_OneKeyTakeMail_6405 DEFAULT_INSTANCE = new C2S_OneKeyTakeMail_6405();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OneKeyTakeMail_6405> PARSER = new AbstractParser<C2S_OneKeyTakeMail_6405>() {
         public C2S_OneKeyTakeMail_6405 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OneKeyTakeMail_6405(input, extensionRegistry);
         }
      };

      private C2S_OneKeyTakeMail_6405(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OneKeyTakeMail_6405() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OneKeyTakeMail_6405();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OneKeyTakeMail_6405(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_OneKeyTakeMail_6405_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_OneKeyTakeMail_6405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyTakeMail_6405.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OneKeyTakeMail_6405)) {
            return super.equals(obj);
         } else {
            C2S_OneKeyTakeMail_6405 other = (C2S_OneKeyTakeMail_6405)obj;
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

      public static C2S_OneKeyTakeMail_6405 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyTakeMail_6405)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyTakeMail_6405 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyTakeMail_6405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyTakeMail_6405 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyTakeMail_6405)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyTakeMail_6405 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyTakeMail_6405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyTakeMail_6405 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyTakeMail_6405)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyTakeMail_6405 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyTakeMail_6405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyTakeMail_6405 parseFrom(InputStream input) throws IOException {
         return (C2S_OneKeyTakeMail_6405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyTakeMail_6405 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyTakeMail_6405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyTakeMail_6405 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OneKeyTakeMail_6405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OneKeyTakeMail_6405 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyTakeMail_6405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyTakeMail_6405 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OneKeyTakeMail_6405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyTakeMail_6405 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyTakeMail_6405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OneKeyTakeMail_6405 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OneKeyTakeMail_6405 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OneKeyTakeMail_6405> parser() {
         return PARSER;
      }

      public Parser<C2S_OneKeyTakeMail_6405> getParserForType() {
         return PARSER;
      }

      public C2S_OneKeyTakeMail_6405 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OneKeyTakeMail_6405OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_OneKeyTakeMail_6405_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_OneKeyTakeMail_6405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyTakeMail_6405.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MailMsg.C2S_OneKeyTakeMail_6405.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_OneKeyTakeMail_6405_descriptor;
         }

         public C2S_OneKeyTakeMail_6405 getDefaultInstanceForType() {
            return MailMsg.C2S_OneKeyTakeMail_6405.getDefaultInstance();
         }

         public C2S_OneKeyTakeMail_6405 build() {
            C2S_OneKeyTakeMail_6405 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OneKeyTakeMail_6405 buildPartial() {
            C2S_OneKeyTakeMail_6405 result = new C2S_OneKeyTakeMail_6405(this);
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
            if (other instanceof C2S_OneKeyTakeMail_6405) {
               return this.mergeFrom((C2S_OneKeyTakeMail_6405)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OneKeyTakeMail_6405 other) {
            if (other == MailMsg.C2S_OneKeyTakeMail_6405.getDefaultInstance()) {
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
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OneKeyTakeMail_6405 parsedMessage = null;

            try {
               parsedMessage = (C2S_OneKeyTakeMail_6405)MailMsg.C2S_OneKeyTakeMail_6405.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OneKeyTakeMail_6405)e.getUnfinishedMessage();
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

   public static final class C2S_OneKeyDelMail_6407 extends GeneratedMessageV3 implements C2S_OneKeyDelMail_6407OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_OneKeyDelMail_6407 DEFAULT_INSTANCE = new C2S_OneKeyDelMail_6407();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OneKeyDelMail_6407> PARSER = new AbstractParser<C2S_OneKeyDelMail_6407>() {
         public C2S_OneKeyDelMail_6407 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OneKeyDelMail_6407(input, extensionRegistry);
         }
      };

      private C2S_OneKeyDelMail_6407(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OneKeyDelMail_6407() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OneKeyDelMail_6407();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OneKeyDelMail_6407(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_OneKeyDelMail_6407_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_OneKeyDelMail_6407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyDelMail_6407.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OneKeyDelMail_6407)) {
            return super.equals(obj);
         } else {
            C2S_OneKeyDelMail_6407 other = (C2S_OneKeyDelMail_6407)obj;
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

      public static C2S_OneKeyDelMail_6407 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyDelMail_6407)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyDelMail_6407 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyDelMail_6407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyDelMail_6407 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyDelMail_6407)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyDelMail_6407 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyDelMail_6407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyDelMail_6407 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyDelMail_6407)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyDelMail_6407 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyDelMail_6407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyDelMail_6407 parseFrom(InputStream input) throws IOException {
         return (C2S_OneKeyDelMail_6407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyDelMail_6407 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyDelMail_6407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyDelMail_6407 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OneKeyDelMail_6407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OneKeyDelMail_6407 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyDelMail_6407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyDelMail_6407 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OneKeyDelMail_6407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyDelMail_6407 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyDelMail_6407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OneKeyDelMail_6407 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OneKeyDelMail_6407 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OneKeyDelMail_6407> parser() {
         return PARSER;
      }

      public Parser<C2S_OneKeyDelMail_6407> getParserForType() {
         return PARSER;
      }

      public C2S_OneKeyDelMail_6407 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OneKeyDelMail_6407OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_OneKeyDelMail_6407_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_OneKeyDelMail_6407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyDelMail_6407.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MailMsg.C2S_OneKeyDelMail_6407.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_OneKeyDelMail_6407_descriptor;
         }

         public C2S_OneKeyDelMail_6407 getDefaultInstanceForType() {
            return MailMsg.C2S_OneKeyDelMail_6407.getDefaultInstance();
         }

         public C2S_OneKeyDelMail_6407 build() {
            C2S_OneKeyDelMail_6407 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OneKeyDelMail_6407 buildPartial() {
            C2S_OneKeyDelMail_6407 result = new C2S_OneKeyDelMail_6407(this);
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
            if (other instanceof C2S_OneKeyDelMail_6407) {
               return this.mergeFrom((C2S_OneKeyDelMail_6407)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OneKeyDelMail_6407 other) {
            if (other == MailMsg.C2S_OneKeyDelMail_6407.getDefaultInstance()) {
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
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OneKeyDelMail_6407 parsedMessage = null;

            try {
               parsedMessage = (C2S_OneKeyDelMail_6407)MailMsg.C2S_OneKeyDelMail_6407.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OneKeyDelMail_6407)e.getUnfinishedMessage();
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

   public static final class S2C_OneKeyDelMailResult_6408 extends GeneratedMessageV3 implements S2C_OneKeyDelMailResult_6408OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODES_FIELD_NUMBER = 1;
      private Internal.IntList codes_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2C_OneKeyDelMailResult_6408 DEFAULT_INSTANCE = new S2C_OneKeyDelMailResult_6408();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OneKeyDelMailResult_6408> PARSER = new AbstractParser<S2C_OneKeyDelMailResult_6408>() {
         public S2C_OneKeyDelMailResult_6408 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OneKeyDelMailResult_6408(input, extensionRegistry);
         }
      };

      private S2C_OneKeyDelMailResult_6408(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OneKeyDelMailResult_6408() {
         this.memoizedIsInitialized = -1;
         this.codes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OneKeyDelMailResult_6408();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OneKeyDelMailResult_6408(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.codes_.addInt(input.readInt32());
                        continue;
                     case 10:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.type_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.codes_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
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
         return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_OneKeyDelMailResult_6408_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_OneKeyDelMailResult_6408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyDelMailResult_6408.class, Builder.class);
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.codes_.size(); ++i) {
            output.writeInt32(1, this.codes_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
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
            int dataSize = 0;

            for(int i = 0; i < this.codes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.codes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCodesList().size();
            if ((this.bitField0_ & 1) != 0) {
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
         } else if (!(obj instanceof S2C_OneKeyDelMailResult_6408)) {
            return super.equals(obj);
         } else {
            S2C_OneKeyDelMailResult_6408 other = (S2C_OneKeyDelMailResult_6408)obj;
            if (!this.getCodesList().equals(other.getCodesList())) {
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
            if (this.getCodesCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCodesList().hashCode();
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

      public static S2C_OneKeyDelMailResult_6408 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyDelMailResult_6408)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyDelMailResult_6408 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyDelMailResult_6408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyDelMailResult_6408 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyDelMailResult_6408)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyDelMailResult_6408 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyDelMailResult_6408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyDelMailResult_6408 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyDelMailResult_6408)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyDelMailResult_6408 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyDelMailResult_6408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyDelMailResult_6408 parseFrom(InputStream input) throws IOException {
         return (S2C_OneKeyDelMailResult_6408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyDelMailResult_6408 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyDelMailResult_6408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyDelMailResult_6408 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OneKeyDelMailResult_6408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OneKeyDelMailResult_6408 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyDelMailResult_6408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyDelMailResult_6408 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OneKeyDelMailResult_6408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyDelMailResult_6408 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyDelMailResult_6408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OneKeyDelMailResult_6408 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OneKeyDelMailResult_6408 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OneKeyDelMailResult_6408> parser() {
         return PARSER;
      }

      public Parser<S2C_OneKeyDelMailResult_6408> getParserForType() {
         return PARSER;
      }

      public S2C_OneKeyDelMailResult_6408 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OneKeyDelMailResult_6408OrBuilder {
         private int bitField0_;
         private Internal.IntList codes_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_OneKeyDelMailResult_6408_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_OneKeyDelMailResult_6408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyDelMailResult_6408.class, Builder.class);
         }

         private Builder() {
            this.codes_ = MailMsg.S2C_OneKeyDelMailResult_6408.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codes_ = MailMsg.S2C_OneKeyDelMailResult_6408.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MailMsg.S2C_OneKeyDelMailResult_6408.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codes_ = MailMsg.S2C_OneKeyDelMailResult_6408.emptyIntList();
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_OneKeyDelMailResult_6408_descriptor;
         }

         public S2C_OneKeyDelMailResult_6408 getDefaultInstanceForType() {
            return MailMsg.S2C_OneKeyDelMailResult_6408.getDefaultInstance();
         }

         public S2C_OneKeyDelMailResult_6408 build() {
            S2C_OneKeyDelMailResult_6408 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OneKeyDelMailResult_6408 buildPartial() {
            S2C_OneKeyDelMailResult_6408 result = new S2C_OneKeyDelMailResult_6408(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.codes_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.codes_ = this.codes_;
            if ((from_bitField0_ & 2) != 0) {
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
            if (other instanceof S2C_OneKeyDelMailResult_6408) {
               return this.mergeFrom((S2C_OneKeyDelMailResult_6408)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OneKeyDelMailResult_6408 other) {
            if (other == MailMsg.S2C_OneKeyDelMailResult_6408.getDefaultInstance()) {
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

               if (other.hasType()) {
                  this.setType(other.getType());
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
            S2C_OneKeyDelMailResult_6408 parsedMessage = null;

            try {
               parsedMessage = (S2C_OneKeyDelMailResult_6408)MailMsg.S2C_OneKeyDelMailResult_6408.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OneKeyDelMailResult_6408)e.getUnfinishedMessage();
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
               this.codes_ = MailMsg.S2C_OneKeyDelMailResult_6408.mutableCopy(this.codes_);
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
            this.codes_ = MailMsg.S2C_OneKeyDelMailResult_6408.emptyIntList();
            this.bitField0_ &= -2;
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

   public static final class C2S_DelMail_6409 extends GeneratedMessageV3 implements C2S_DelMail_6409OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_DelMail_6409 DEFAULT_INSTANCE = new C2S_DelMail_6409();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DelMail_6409> PARSER = new AbstractParser<C2S_DelMail_6409>() {
         public C2S_DelMail_6409 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DelMail_6409(input, extensionRegistry);
         }
      };

      private C2S_DelMail_6409(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DelMail_6409() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DelMail_6409();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DelMail_6409(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_DelMail_6409_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_DelMail_6409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DelMail_6409.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DelMail_6409)) {
            return super.equals(obj);
         } else {
            C2S_DelMail_6409 other = (C2S_DelMail_6409)obj;
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

      public static C2S_DelMail_6409 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DelMail_6409)PARSER.parseFrom(data);
      }

      public static C2S_DelMail_6409 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DelMail_6409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DelMail_6409 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DelMail_6409)PARSER.parseFrom(data);
      }

      public static C2S_DelMail_6409 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DelMail_6409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DelMail_6409 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DelMail_6409)PARSER.parseFrom(data);
      }

      public static C2S_DelMail_6409 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DelMail_6409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DelMail_6409 parseFrom(InputStream input) throws IOException {
         return (C2S_DelMail_6409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DelMail_6409 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DelMail_6409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DelMail_6409 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DelMail_6409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DelMail_6409 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DelMail_6409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DelMail_6409 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DelMail_6409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DelMail_6409 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DelMail_6409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DelMail_6409 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DelMail_6409 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DelMail_6409> parser() {
         return PARSER;
      }

      public Parser<C2S_DelMail_6409> getParserForType() {
         return PARSER;
      }

      public C2S_DelMail_6409 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DelMail_6409OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_DelMail_6409_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_DelMail_6409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DelMail_6409.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MailMsg.C2S_DelMail_6409.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_C2S_DelMail_6409_descriptor;
         }

         public C2S_DelMail_6409 getDefaultInstanceForType() {
            return MailMsg.C2S_DelMail_6409.getDefaultInstance();
         }

         public C2S_DelMail_6409 build() {
            C2S_DelMail_6409 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DelMail_6409 buildPartial() {
            C2S_DelMail_6409 result = new C2S_DelMail_6409(this);
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
            if (other instanceof C2S_DelMail_6409) {
               return this.mergeFrom((C2S_DelMail_6409)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DelMail_6409 other) {
            if (other == MailMsg.C2S_DelMail_6409.getDefaultInstance()) {
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
            C2S_DelMail_6409 parsedMessage = null;

            try {
               parsedMessage = (C2S_DelMail_6409)MailMsg.C2S_DelMail_6409.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DelMail_6409)e.getUnfinishedMessage();
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

   public static final class S2C_DelMailResult_6410 extends GeneratedMessageV3 implements S2C_DelMailResult_6410OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int TYPE_FIELD_NUMBER = 3;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2C_DelMailResult_6410 DEFAULT_INSTANCE = new S2C_DelMailResult_6410();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DelMailResult_6410> PARSER = new AbstractParser<S2C_DelMailResult_6410>() {
         public S2C_DelMailResult_6410 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DelMailResult_6410(input, extensionRegistry);
         }
      };

      private S2C_DelMailResult_6410(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DelMailResult_6410() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DelMailResult_6410();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DelMailResult_6410(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_DelMailResult_6410_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_DelMailResult_6410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DelMailResult_6410.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DelMailResult_6410)) {
            return super.equals(obj);
         } else {
            S2C_DelMailResult_6410 other = (S2C_DelMailResult_6410)obj;
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

      public static S2C_DelMailResult_6410 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DelMailResult_6410)PARSER.parseFrom(data);
      }

      public static S2C_DelMailResult_6410 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelMailResult_6410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelMailResult_6410 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DelMailResult_6410)PARSER.parseFrom(data);
      }

      public static S2C_DelMailResult_6410 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelMailResult_6410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelMailResult_6410 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DelMailResult_6410)PARSER.parseFrom(data);
      }

      public static S2C_DelMailResult_6410 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelMailResult_6410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelMailResult_6410 parseFrom(InputStream input) throws IOException {
         return (S2C_DelMailResult_6410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DelMailResult_6410 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelMailResult_6410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DelMailResult_6410 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DelMailResult_6410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DelMailResult_6410 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelMailResult_6410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DelMailResult_6410 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DelMailResult_6410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DelMailResult_6410 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelMailResult_6410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DelMailResult_6410 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DelMailResult_6410 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DelMailResult_6410> parser() {
         return PARSER;
      }

      public Parser<S2C_DelMailResult_6410> getParserForType() {
         return PARSER;
      }

      public S2C_DelMailResult_6410 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DelMailResult_6410OrBuilder {
         private int bitField0_;
         private int result_;
         private int code_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_DelMailResult_6410_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_DelMailResult_6410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DelMailResult_6410.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MailMsg.S2C_DelMailResult_6410.alwaysUseFieldBuilders) {
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
            return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_DelMailResult_6410_descriptor;
         }

         public S2C_DelMailResult_6410 getDefaultInstanceForType() {
            return MailMsg.S2C_DelMailResult_6410.getDefaultInstance();
         }

         public S2C_DelMailResult_6410 build() {
            S2C_DelMailResult_6410 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DelMailResult_6410 buildPartial() {
            S2C_DelMailResult_6410 result = new S2C_DelMailResult_6410(this);
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
            if (other instanceof S2C_DelMailResult_6410) {
               return this.mergeFrom((S2C_DelMailResult_6410)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DelMailResult_6410 other) {
            if (other == MailMsg.S2C_DelMailResult_6410.getDefaultInstance()) {
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
            S2C_DelMailResult_6410 parsedMessage = null;

            try {
               parsedMessage = (S2C_DelMailResult_6410)MailMsg.S2C_DelMailResult_6410.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DelMailResult_6410)e.getUnfinishedMessage();
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

   public static final class S2C_AddMailListData_6412 extends GeneratedMessageV3 implements S2C_AddMailListData_6412OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int MAILS_FIELD_NUMBER = 1;
      private List<Mail> mails_;
      private byte memoizedIsInitialized;
      private static final S2C_AddMailListData_6412 DEFAULT_INSTANCE = new S2C_AddMailListData_6412();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AddMailListData_6412> PARSER = new AbstractParser<S2C_AddMailListData_6412>() {
         public S2C_AddMailListData_6412 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AddMailListData_6412(input, extensionRegistry);
         }
      };

      private S2C_AddMailListData_6412(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AddMailListData_6412() {
         this.memoizedIsInitialized = -1;
         this.mails_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AddMailListData_6412();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AddMailListData_6412(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.mails_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.mails_.add(input.readMessage(MailMsg.Mail.PARSER, extensionRegistry));
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
                  this.mails_ = Collections.unmodifiableList(this.mails_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_AddMailListData_6412_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_AddMailListData_6412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AddMailListData_6412.class, Builder.class);
      }

      public List<Mail> getMailsList() {
         return this.mails_;
      }

      public List<? extends MailOrBuilder> getMailsOrBuilderList() {
         return this.mails_;
      }

      public int getMailsCount() {
         return this.mails_.size();
      }

      public Mail getMails(int index) {
         return (Mail)this.mails_.get(index);
      }

      public MailOrBuilder getMailsOrBuilder(int index) {
         return (MailOrBuilder)this.mails_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getMailsCount(); ++i) {
               if (!this.getMails(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.mails_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.mails_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.mails_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.mails_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AddMailListData_6412)) {
            return super.equals(obj);
         } else {
            S2C_AddMailListData_6412 other = (S2C_AddMailListData_6412)obj;
            if (!this.getMailsList().equals(other.getMailsList())) {
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
            if (this.getMailsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMailsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AddMailListData_6412 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AddMailListData_6412)PARSER.parseFrom(data);
      }

      public static S2C_AddMailListData_6412 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddMailListData_6412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddMailListData_6412 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AddMailListData_6412)PARSER.parseFrom(data);
      }

      public static S2C_AddMailListData_6412 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddMailListData_6412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddMailListData_6412 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AddMailListData_6412)PARSER.parseFrom(data);
      }

      public static S2C_AddMailListData_6412 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddMailListData_6412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddMailListData_6412 parseFrom(InputStream input) throws IOException {
         return (S2C_AddMailListData_6412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AddMailListData_6412 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddMailListData_6412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AddMailListData_6412 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AddMailListData_6412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AddMailListData_6412 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddMailListData_6412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AddMailListData_6412 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AddMailListData_6412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AddMailListData_6412 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddMailListData_6412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AddMailListData_6412 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AddMailListData_6412 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AddMailListData_6412> parser() {
         return PARSER;
      }

      public Parser<S2C_AddMailListData_6412> getParserForType() {
         return PARSER;
      }

      public S2C_AddMailListData_6412 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AddMailListData_6412OrBuilder {
         private int bitField0_;
         private List<Mail> mails_;
         private RepeatedFieldBuilderV3<Mail, Mail.Builder, MailOrBuilder> mailsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_AddMailListData_6412_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_AddMailListData_6412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AddMailListData_6412.class, Builder.class);
         }

         private Builder() {
            this.mails_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.mails_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (MailMsg.S2C_AddMailListData_6412.alwaysUseFieldBuilders) {
               this.getMailsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.mailsBuilder_ == null) {
               this.mails_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.mailsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return MailMsg.internal_static_mail_com_gzbz_protobuf_S2C_AddMailListData_6412_descriptor;
         }

         public S2C_AddMailListData_6412 getDefaultInstanceForType() {
            return MailMsg.S2C_AddMailListData_6412.getDefaultInstance();
         }

         public S2C_AddMailListData_6412 build() {
            S2C_AddMailListData_6412 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AddMailListData_6412 buildPartial() {
            S2C_AddMailListData_6412 result = new S2C_AddMailListData_6412(this);
            int from_bitField0_ = this.bitField0_;
            if (this.mailsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.mails_ = Collections.unmodifiableList(this.mails_);
                  this.bitField0_ &= -2;
               }

               result.mails_ = this.mails_;
            } else {
               result.mails_ = this.mailsBuilder_.build();
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
            if (other instanceof S2C_AddMailListData_6412) {
               return this.mergeFrom((S2C_AddMailListData_6412)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AddMailListData_6412 other) {
            if (other == MailMsg.S2C_AddMailListData_6412.getDefaultInstance()) {
               return this;
            } else {
               if (this.mailsBuilder_ == null) {
                  if (!other.mails_.isEmpty()) {
                     if (this.mails_.isEmpty()) {
                        this.mails_ = other.mails_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureMailsIsMutable();
                        this.mails_.addAll(other.mails_);
                     }

                     this.onChanged();
                  }
               } else if (!other.mails_.isEmpty()) {
                  if (this.mailsBuilder_.isEmpty()) {
                     this.mailsBuilder_.dispose();
                     this.mailsBuilder_ = null;
                     this.mails_ = other.mails_;
                     this.bitField0_ &= -2;
                     this.mailsBuilder_ = MailMsg.S2C_AddMailListData_6412.alwaysUseFieldBuilders ? this.getMailsFieldBuilder() : null;
                  } else {
                     this.mailsBuilder_.addAllMessages(other.mails_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getMailsCount(); ++i) {
               if (!this.getMails(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AddMailListData_6412 parsedMessage = null;

            try {
               parsedMessage = (S2C_AddMailListData_6412)MailMsg.S2C_AddMailListData_6412.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AddMailListData_6412)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureMailsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.mails_ = new ArrayList(this.mails_);
               this.bitField0_ |= 1;
            }

         }

         public List<Mail> getMailsList() {
            return this.mailsBuilder_ == null ? Collections.unmodifiableList(this.mails_) : this.mailsBuilder_.getMessageList();
         }

         public int getMailsCount() {
            return this.mailsBuilder_ == null ? this.mails_.size() : this.mailsBuilder_.getCount();
         }

         public Mail getMails(int index) {
            return this.mailsBuilder_ == null ? (Mail)this.mails_.get(index) : (Mail)this.mailsBuilder_.getMessage(index);
         }

         public Builder setMails(int index, Mail value) {
            if (this.mailsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMailsIsMutable();
               this.mails_.set(index, value);
               this.onChanged();
            } else {
               this.mailsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setMails(int index, Mail.Builder builderForValue) {
            if (this.mailsBuilder_ == null) {
               this.ensureMailsIsMutable();
               this.mails_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.mailsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addMails(Mail value) {
            if (this.mailsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMailsIsMutable();
               this.mails_.add(value);
               this.onChanged();
            } else {
               this.mailsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addMails(int index, Mail value) {
            if (this.mailsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureMailsIsMutable();
               this.mails_.add(index, value);
               this.onChanged();
            } else {
               this.mailsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addMails(Mail.Builder builderForValue) {
            if (this.mailsBuilder_ == null) {
               this.ensureMailsIsMutable();
               this.mails_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.mailsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addMails(int index, Mail.Builder builderForValue) {
            if (this.mailsBuilder_ == null) {
               this.ensureMailsIsMutable();
               this.mails_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.mailsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllMails(Iterable<? extends Mail> values) {
            if (this.mailsBuilder_ == null) {
               this.ensureMailsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.mails_);
               this.onChanged();
            } else {
               this.mailsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearMails() {
            if (this.mailsBuilder_ == null) {
               this.mails_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.mailsBuilder_.clear();
            }

            return this;
         }

         public Builder removeMails(int index) {
            if (this.mailsBuilder_ == null) {
               this.ensureMailsIsMutable();
               this.mails_.remove(index);
               this.onChanged();
            } else {
               this.mailsBuilder_.remove(index);
            }

            return this;
         }

         public Mail.Builder getMailsBuilder(int index) {
            return (Mail.Builder)this.getMailsFieldBuilder().getBuilder(index);
         }

         public MailOrBuilder getMailsOrBuilder(int index) {
            return this.mailsBuilder_ == null ? (MailOrBuilder)this.mails_.get(index) : (MailOrBuilder)this.mailsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends MailOrBuilder> getMailsOrBuilderList() {
            return this.mailsBuilder_ != null ? this.mailsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.mails_);
         }

         public Mail.Builder addMailsBuilder() {
            return (Mail.Builder)this.getMailsFieldBuilder().addBuilder(MailMsg.Mail.getDefaultInstance());
         }

         public Mail.Builder addMailsBuilder(int index) {
            return (Mail.Builder)this.getMailsFieldBuilder().addBuilder(index, MailMsg.Mail.getDefaultInstance());
         }

         public List<Mail.Builder> getMailsBuilderList() {
            return this.getMailsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<Mail, Mail.Builder, MailOrBuilder> getMailsFieldBuilder() {
            if (this.mailsBuilder_ == null) {
               this.mailsBuilder_ = new RepeatedFieldBuilderV3(this.mails_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.mails_ = null;
            }

            return this.mailsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_DelMail_6409OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface C2S_MailList_6401OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OneKeyDelMail_6407OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_OneKeyTakeMail_6405OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_ReadMail_6403OrBuilder extends MessageOrBuilder {
      boolean hasType();

      OperationType getType();

      boolean hasCode();

      int getCode();
   }

   public interface MailOrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasType();

      int getType();

      boolean hasTitle();

      String getTitle();

      ByteString getTitleBytes();

      boolean hasContext();

      String getContext();

      ByteString getContextBytes();

      boolean hasCreatTime();

      long getCreatTime();

      boolean hasEnableTime();

      long getEnableTime();

      boolean hasState();

      MailState getState();

      List<CommonMsg.ItemInfo> getItemsList();

      CommonMsg.ItemInfo getItems(int index);

      int getItemsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index);

      boolean hasCentreAwardId();

      int getCentreAwardId();
   }

   public interface S2C_AddMailListData_6412OrBuilder extends MessageOrBuilder {
      List<Mail> getMailsList();

      Mail getMails(int index);

      int getMailsCount();

      List<? extends MailOrBuilder> getMailsOrBuilderList();

      MailOrBuilder getMailsOrBuilder(int index);
   }

   public interface S2C_DelMailResult_6410OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasCode();

      int getCode();

      boolean hasType();

      int getType();
   }

   public interface S2C_MailListData_6402OrBuilder extends MessageOrBuilder {
      List<Mail> getMailsList();

      Mail getMails(int index);

      int getMailsCount();

      List<? extends MailOrBuilder> getMailsOrBuilderList();

      MailOrBuilder getMailsOrBuilder(int index);

      boolean hasType();

      int getType();
   }

   public interface S2C_OneKeyDelMailResult_6408OrBuilder extends MessageOrBuilder {
      List<Integer> getCodesList();

      int getCodesCount();

      int getCodes(int index);

      boolean hasType();

      int getType();
   }

   public interface S2C_ReadMailResult_6404OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasInfo();

      Mail getInfo();

      MailOrBuilder getInfoOrBuilder();
   }
}
