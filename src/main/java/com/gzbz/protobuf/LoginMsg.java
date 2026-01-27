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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class LoginMsg {
   private static final Descriptors.Descriptor internal_static_login_com_gzbz_protobuf_C2S_Login_1000_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_login_com_gzbz_protobuf_C2S_Login_1000_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_login_com_gzbz_protobuf_S2C_LoginResult_1001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_login_com_gzbz_protobuf_S2C_LoginResult_1001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_login_com_gzbz_protobuf_C2S_CreateRole_1002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_login_com_gzbz_protobuf_C2S_CreateRole_1002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_login_com_gzbz_protobuf_S2C_CreateRoleResult_1003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_login_com_gzbz_protobuf_S2C_CreateRoleResult_1003_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_login_com_gzbz_protobuf_S2C_Respond_1004_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_login_com_gzbz_protobuf_S2C_Respond_1004_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_login_com_gzbz_protobuf_S2C_ReconnectKey_1005_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_login_com_gzbz_protobuf_S2C_ReconnectKey_1005_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_login_com_gzbz_protobuf_C2S_ReconnectKey_1006_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_login_com_gzbz_protobuf_C2S_ReconnectKey_1006_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_login_com_gzbz_protobuf_S2C_CrossMsg_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_login_com_gzbz_protobuf_S2C_CrossMsg_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_login_com_gzbz_protobuf_C2S_FilterRecommend_1007_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_login_com_gzbz_protobuf_C2S_FilterRecommend_1007_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_login_com_gzbz_protobuf_S2C_FilterRecommend_1008_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_login_com_gzbz_protobuf_S2C_FilterRecommend_1008_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private LoginMsg() {
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
      String[] descriptorData = new String[]{"\n\u000bLogin.proto\u0012\u0017login.com.gzbz.protobuf\"Ç\u0002\n\u000eC2S_Login_1000\u0012\u000f\n\u0007account\u0018\u0001 \u0002(\t\u0012\u000f\n\u0007passwad\u0018\u0002 \u0002(\t\u0012\u0010\n\bserverId\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004sign\u0018\u0004 \u0001(\t\u0012\u0011\n\tchannelId\u0018\u0005 \u0001(\t\u0012\u000f\n\u0007netInfo\u0018\u0006 \u0001(\t\u0012\u000f\n\u0007groupId\u0018\u0007 \u0001(\t\u0012\u000e\n\u0006devUID\u0018\b \u0001(\t\u0012\u000f\n\u0007devName\u0018\t \u0001(\t\u0012\u0010\n\bdevOsVer\u0018\n \u0001(\t\u0012\u000e\n\u0006devRes\u0018\u000b \u0001(\t\u0012\u000f\n\u0007netOper\u0018\f \u0001(\t\u0012\u000f\n\u0007version\u0018\r \u0001(\t\u0012\u000b\n\u0003age\u0018\u000e \u0001(\u0005\u0012\u000f\n\u0007isGuest\u0018\u000f \u0001(\b\u0012\u0013\n\u000baccountName\u0018\u0010 \u0001(\t\u0012\u0013\n\u000baccountType\u0018\u0011 \u0001(\u0005\u0012\u0011\n\tloginTime\u0018\u0012 \u0001(\u0005\" \u0001\n\u0014S2C_LoginResult_1001\u00123\n\u0006result\u0018\u0001 \u0002(\u000e2#.login.com.gzbz.protobuf.resultType\u0012\u0010\n\bplayerId\u0018\u0002 \u0001(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u0013\n\u000bisReconnect\u0018\u0004 \u0001(\u0005\u0012\f\n\u0004area\u0018\u0005 \u0001(\t\u0012\n\n\u0002lv\u0018\u0006 \u0001(\u0005\"M\n\u0013C2S_CreateRole_1002\u0012\u000b\n\u0003sex\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0002 \u0002(\t\u0012\u0015\n\rrecommendCode\u0018\u0003 \u0001(\u0005\"N\n\u0019S2C_CreateRoleResult_1003\u00121\n\u0005error\u0018\u0001 \u0002(\u000e2\".login.com.gzbz.protobuf.ErrorCode\" \n\u0010S2C_Respond_1004\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"$\n\u0015S2C_ReconnectKey_1005\u0012\u000b\n\u0003key\u0018\u0001 \u0002(\t\"$\n\u0015C2S_ReconnectKey_1006\u0012\u000b\n\u0003key\u0018\u0001 \u0002(\t\"d\n\fS2C_CrossMsg\u0012\u0016\n\u000esourceServerId\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bsourceMgrId\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fdestServerId\u0018\u0003 \u0002(\u0005\u0012\u0011\n\tdestMgrId\u0018\u0004 \u0002(\u0005\"1\n\u0018C2S_FilterRecommend_1007\u0012\u0015\n\rrecommendCode\u0018\u0001 \u0001(\u0005\"*\n\u0018S2C_FilterRecommend_1008\u0012\u000e\n\u0006result\u0018\u0001 \u0001(\u0005*\u0088\u0002\n\nresultType\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\n\n\u0006CREATE\u0010\u0001\u0012\n\n\u0006PASSWD\u0010\u0002\u0012\t\n\u0005OTHER\u0010\u0003\u0012\f\n\bSERVERID\u0010\u0004\u0012\b\n\u0004FULL\u0010\u0005\u0012\n\n\u0006REFUSE\u0010\u0006\u0012\n\n\u0006CLOSED\u0010\u0007\u0012\u000b\n\u0007KICKOUT\u0010\b\u0012\u0010\n\fONLINE_LIMIT\u0010e\u0012\u0014\n\u0010LOGIN_TIME_LIMIT\u0010f\u0012\u0016\n\u0012GUEST_ONLINE_LIMIT\u0010g\u0012\u000e\n\nDEVICE_UID\u0010h\u0012\u0012\n\u000eREGISTER_LIMIT\u0010i\u0012\u0013\n\u000fLOGIN_AUTH_FAIL\u0010j\u0012\u0014\n\u0010SERVER_OPEN_TIME\u0010k* \n\tErrorCode\u0012\u0013\n\u000fRECOMMEND_ERROR\u0010\u0001B\u001f\n\u0011com.gzbz.protobufB\bLoginMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
      internal_static_login_com_gzbz_protobuf_C2S_Login_1000_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_login_com_gzbz_protobuf_C2S_Login_1000_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_login_com_gzbz_protobuf_C2S_Login_1000_descriptor, new String[]{"Account", "Passwad", "ServerId", "Sign", "ChannelId", "NetInfo", "GroupId", "DevUID", "DevName", "DevOsVer", "DevRes", "NetOper", "Version", "Age", "IsGuest", "AccountName", "AccountType", "LoginTime"});
      internal_static_login_com_gzbz_protobuf_S2C_LoginResult_1001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_login_com_gzbz_protobuf_S2C_LoginResult_1001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_login_com_gzbz_protobuf_S2C_LoginResult_1001_descriptor, new String[]{"Result", "PlayerId", "PlayerName", "IsReconnect", "Area", "Lv"});
      internal_static_login_com_gzbz_protobuf_C2S_CreateRole_1002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_login_com_gzbz_protobuf_C2S_CreateRole_1002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_login_com_gzbz_protobuf_C2S_CreateRole_1002_descriptor, new String[]{"Sex", "PlayerName", "RecommendCode"});
      internal_static_login_com_gzbz_protobuf_S2C_CreateRoleResult_1003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_login_com_gzbz_protobuf_S2C_CreateRoleResult_1003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_login_com_gzbz_protobuf_S2C_CreateRoleResult_1003_descriptor, new String[]{"Error"});
      internal_static_login_com_gzbz_protobuf_S2C_Respond_1004_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_login_com_gzbz_protobuf_S2C_Respond_1004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_login_com_gzbz_protobuf_S2C_Respond_1004_descriptor, new String[]{"Code"});
      internal_static_login_com_gzbz_protobuf_S2C_ReconnectKey_1005_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_login_com_gzbz_protobuf_S2C_ReconnectKey_1005_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_login_com_gzbz_protobuf_S2C_ReconnectKey_1005_descriptor, new String[]{"Key"});
      internal_static_login_com_gzbz_protobuf_C2S_ReconnectKey_1006_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_login_com_gzbz_protobuf_C2S_ReconnectKey_1006_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_login_com_gzbz_protobuf_C2S_ReconnectKey_1006_descriptor, new String[]{"Key"});
      internal_static_login_com_gzbz_protobuf_S2C_CrossMsg_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_login_com_gzbz_protobuf_S2C_CrossMsg_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_login_com_gzbz_protobuf_S2C_CrossMsg_descriptor, new String[]{"SourceServerId", "SourceMgrId", "DestServerId", "DestMgrId"});
      internal_static_login_com_gzbz_protobuf_C2S_FilterRecommend_1007_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_login_com_gzbz_protobuf_C2S_FilterRecommend_1007_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_login_com_gzbz_protobuf_C2S_FilterRecommend_1007_descriptor, new String[]{"RecommendCode"});
      internal_static_login_com_gzbz_protobuf_S2C_FilterRecommend_1008_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_login_com_gzbz_protobuf_S2C_FilterRecommend_1008_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_login_com_gzbz_protobuf_S2C_FilterRecommend_1008_descriptor, new String[]{"Result"});
   }

   public static enum resultType implements ProtocolMessageEnum {
      SUCCESS(0),
      CREATE(1),
      PASSWD(2),
      OTHER(3),
      SERVERID(4),
      FULL(5),
      REFUSE(6),
      CLOSED(7),
      KICKOUT(8),
      ONLINE_LIMIT(101),
      LOGIN_TIME_LIMIT(102),
      GUEST_ONLINE_LIMIT(103),
      DEVICE_UID(104),
      REGISTER_LIMIT(105),
      LOGIN_AUTH_FAIL(106),
      SERVER_OPEN_TIME(107);

      public static final int SUCCESS_VALUE = 0;
      public static final int CREATE_VALUE = 1;
      public static final int PASSWD_VALUE = 2;
      public static final int OTHER_VALUE = 3;
      public static final int SERVERID_VALUE = 4;
      public static final int FULL_VALUE = 5;
      public static final int REFUSE_VALUE = 6;
      public static final int CLOSED_VALUE = 7;
      public static final int KICKOUT_VALUE = 8;
      public static final int ONLINE_LIMIT_VALUE = 101;
      public static final int LOGIN_TIME_LIMIT_VALUE = 102;
      public static final int GUEST_ONLINE_LIMIT_VALUE = 103;
      public static final int DEVICE_UID_VALUE = 104;
      public static final int REGISTER_LIMIT_VALUE = 105;
      public static final int LOGIN_AUTH_FAIL_VALUE = 106;
      public static final int SERVER_OPEN_TIME_VALUE = 107;
      private static final Internal.EnumLiteMap<resultType> internalValueMap = new Internal.EnumLiteMap<resultType>() {
         public resultType findValueByNumber(int number) {
            return LoginMsg.resultType.forNumber(number);
         }
      };
      private static final resultType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static resultType valueOf(int value) {
         return forNumber(value);
      }

      public static resultType forNumber(int value) {
         switch (value) {
            case 0:
               return SUCCESS;
            case 1:
               return CREATE;
            case 2:
               return PASSWD;
            case 3:
               return OTHER;
            case 4:
               return SERVERID;
            case 5:
               return FULL;
            case 6:
               return REFUSE;
            case 7:
               return CLOSED;
            case 8:
               return KICKOUT;
            case 101:
               return ONLINE_LIMIT;
            case 102:
               return LOGIN_TIME_LIMIT;
            case 103:
               return GUEST_ONLINE_LIMIT;
            case 104:
               return DEVICE_UID;
            case 105:
               return REGISTER_LIMIT;
            case 106:
               return LOGIN_AUTH_FAIL;
            case 107:
               return SERVER_OPEN_TIME;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<resultType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)LoginMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static resultType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private resultType(int value) {
         this.value = value;
      }
   }

   public static enum ErrorCode implements ProtocolMessageEnum {
      RECOMMEND_ERROR(1);

      public static final int RECOMMEND_ERROR_VALUE = 1;
      private static final Internal.EnumLiteMap<ErrorCode> internalValueMap = new Internal.EnumLiteMap<ErrorCode>() {
         public ErrorCode findValueByNumber(int number) {
            return LoginMsg.ErrorCode.forNumber(number);
         }
      };
      private static final ErrorCode[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static ErrorCode valueOf(int value) {
         return forNumber(value);
      }

      public static ErrorCode forNumber(int value) {
         switch (value) {
            case 1:
               return RECOMMEND_ERROR;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<ErrorCode> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)LoginMsg.getDescriptor().getEnumTypes().get(1);
      }

      public static ErrorCode valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private ErrorCode(int value) {
         this.value = value;
      }
   }

   public static final class C2S_Login_1000 extends GeneratedMessageV3 implements C2S_Login_1000OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ACCOUNT_FIELD_NUMBER = 1;
      private volatile Object account_;
      public static final int PASSWAD_FIELD_NUMBER = 2;
      private volatile Object passwad_;
      public static final int SERVERID_FIELD_NUMBER = 3;
      private int serverId_;
      public static final int SIGN_FIELD_NUMBER = 4;
      private volatile Object sign_;
      public static final int CHANNELID_FIELD_NUMBER = 5;
      private volatile Object channelId_;
      public static final int NETINFO_FIELD_NUMBER = 6;
      private volatile Object netInfo_;
      public static final int GROUPID_FIELD_NUMBER = 7;
      private volatile Object groupId_;
      public static final int DEVUID_FIELD_NUMBER = 8;
      private volatile Object devUID_;
      public static final int DEVNAME_FIELD_NUMBER = 9;
      private volatile Object devName_;
      public static final int DEVOSVER_FIELD_NUMBER = 10;
      private volatile Object devOsVer_;
      public static final int DEVRES_FIELD_NUMBER = 11;
      private volatile Object devRes_;
      public static final int NETOPER_FIELD_NUMBER = 12;
      private volatile Object netOper_;
      public static final int VERSION_FIELD_NUMBER = 13;
      private volatile Object version_;
      public static final int AGE_FIELD_NUMBER = 14;
      private int age_;
      public static final int ISGUEST_FIELD_NUMBER = 15;
      private boolean isGuest_;
      public static final int ACCOUNTNAME_FIELD_NUMBER = 16;
      private volatile Object accountName_;
      public static final int ACCOUNTTYPE_FIELD_NUMBER = 17;
      private int accountType_;
      public static final int LOGINTIME_FIELD_NUMBER = 18;
      private int loginTime_;
      private byte memoizedIsInitialized;
      private static final C2S_Login_1000 DEFAULT_INSTANCE = new C2S_Login_1000();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Login_1000> PARSER = new AbstractParser<C2S_Login_1000>() {
         public C2S_Login_1000 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Login_1000(input, extensionRegistry);
         }
      };

      private C2S_Login_1000(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Login_1000() {
         this.memoizedIsInitialized = -1;
         this.account_ = "";
         this.passwad_ = "";
         this.sign_ = "";
         this.channelId_ = "";
         this.netInfo_ = "";
         this.groupId_ = "";
         this.devUID_ = "";
         this.devName_ = "";
         this.devOsVer_ = "";
         this.devRes_ = "";
         this.netOper_ = "";
         this.version_ = "";
         this.accountName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Login_1000();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Login_1000(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.account_ = bs;
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.passwad_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.serverId_ = input.readInt32();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.sign_ = bs;
                        break;
                     case 42:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16;
                        this.channelId_ = bs;
                        break;
                     case 50:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 32;
                        this.netInfo_ = bs;
                        break;
                     case 58:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 64;
                        this.groupId_ = bs;
                        break;
                     case 66:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 128;
                        this.devUID_ = bs;
                        break;
                     case 74:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 256;
                        this.devName_ = bs;
                        break;
                     case 82:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 512;
                        this.devOsVer_ = bs;
                        break;
                     case 90:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 1024;
                        this.devRes_ = bs;
                        break;
                     case 98:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2048;
                        this.netOper_ = bs;
                        break;
                     case 106:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4096;
                        this.version_ = bs;
                        break;
                     case 112:
                        this.bitField0_ |= 8192;
                        this.age_ = input.readInt32();
                        break;
                     case 120:
                        this.bitField0_ |= 16384;
                        this.isGuest_ = input.readBool();
                        break;
                     case 130:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 32768;
                        this.accountName_ = bs;
                        break;
                     case 136:
                        this.bitField0_ |= 65536;
                        this.accountType_ = input.readInt32();
                        break;
                     case 144:
                        this.bitField0_ |= 131072;
                        this.loginTime_ = input.readInt32();
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
         return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_Login_1000_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_Login_1000_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Login_1000.class, Builder.class);
      }

      public boolean hasAccount() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getAccount() {
         Object ref = this.account_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.account_ = s;
            }

            return s;
         }
      }

      public ByteString getAccountBytes() {
         Object ref = this.account_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.account_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasPasswad() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getPasswad() {
         Object ref = this.passwad_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.passwad_ = s;
            }

            return s;
         }
      }

      public ByteString getPasswadBytes() {
         Object ref = this.passwad_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.passwad_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasSign() {
         return (this.bitField0_ & 8) != 0;
      }

      public String getSign() {
         Object ref = this.sign_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.sign_ = s;
            }

            return s;
         }
      }

      public ByteString getSignBytes() {
         Object ref = this.sign_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.sign_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasChannelId() {
         return (this.bitField0_ & 16) != 0;
      }

      public String getChannelId() {
         Object ref = this.channelId_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.channelId_ = s;
            }

            return s;
         }
      }

      public ByteString getChannelIdBytes() {
         Object ref = this.channelId_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.channelId_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasNetInfo() {
         return (this.bitField0_ & 32) != 0;
      }

      public String getNetInfo() {
         Object ref = this.netInfo_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.netInfo_ = s;
            }

            return s;
         }
      }

      public ByteString getNetInfoBytes() {
         Object ref = this.netInfo_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.netInfo_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasGroupId() {
         return (this.bitField0_ & 64) != 0;
      }

      public String getGroupId() {
         Object ref = this.groupId_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.groupId_ = s;
            }

            return s;
         }
      }

      public ByteString getGroupIdBytes() {
         Object ref = this.groupId_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.groupId_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasDevUID() {
         return (this.bitField0_ & 128) != 0;
      }

      public String getDevUID() {
         Object ref = this.devUID_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.devUID_ = s;
            }

            return s;
         }
      }

      public ByteString getDevUIDBytes() {
         Object ref = this.devUID_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.devUID_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasDevName() {
         return (this.bitField0_ & 256) != 0;
      }

      public String getDevName() {
         Object ref = this.devName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.devName_ = s;
            }

            return s;
         }
      }

      public ByteString getDevNameBytes() {
         Object ref = this.devName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.devName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasDevOsVer() {
         return (this.bitField0_ & 512) != 0;
      }

      public String getDevOsVer() {
         Object ref = this.devOsVer_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.devOsVer_ = s;
            }

            return s;
         }
      }

      public ByteString getDevOsVerBytes() {
         Object ref = this.devOsVer_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.devOsVer_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasDevRes() {
         return (this.bitField0_ & 1024) != 0;
      }

      public String getDevRes() {
         Object ref = this.devRes_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.devRes_ = s;
            }

            return s;
         }
      }

      public ByteString getDevResBytes() {
         Object ref = this.devRes_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.devRes_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasNetOper() {
         return (this.bitField0_ & 2048) != 0;
      }

      public String getNetOper() {
         Object ref = this.netOper_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.netOper_ = s;
            }

            return s;
         }
      }

      public ByteString getNetOperBytes() {
         Object ref = this.netOper_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.netOper_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasVersion() {
         return (this.bitField0_ & 4096) != 0;
      }

      public String getVersion() {
         Object ref = this.version_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.version_ = s;
            }

            return s;
         }
      }

      public ByteString getVersionBytes() {
         Object ref = this.version_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.version_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasAge() {
         return (this.bitField0_ & 8192) != 0;
      }

      public int getAge() {
         return this.age_;
      }

      public boolean hasIsGuest() {
         return (this.bitField0_ & 16384) != 0;
      }

      public boolean getIsGuest() {
         return this.isGuest_;
      }

      public boolean hasAccountName() {
         return (this.bitField0_ & '耀') != 0;
      }

      public String getAccountName() {
         Object ref = this.accountName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.accountName_ = s;
            }

            return s;
         }
      }

      public ByteString getAccountNameBytes() {
         Object ref = this.accountName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.accountName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasAccountType() {
         return (this.bitField0_ & 65536) != 0;
      }

      public int getAccountType() {
         return this.accountType_;
      }

      public boolean hasLoginTime() {
         return (this.bitField0_ & 131072) != 0;
      }

      public int getLoginTime() {
         return this.loginTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAccount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPasswad()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.account_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.passwad_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.serverId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.sign_);
         }

         if ((this.bitField0_ & 16) != 0) {
            GeneratedMessageV3.writeString(output, 5, this.channelId_);
         }

         if ((this.bitField0_ & 32) != 0) {
            GeneratedMessageV3.writeString(output, 6, this.netInfo_);
         }

         if ((this.bitField0_ & 64) != 0) {
            GeneratedMessageV3.writeString(output, 7, this.groupId_);
         }

         if ((this.bitField0_ & 128) != 0) {
            GeneratedMessageV3.writeString(output, 8, this.devUID_);
         }

         if ((this.bitField0_ & 256) != 0) {
            GeneratedMessageV3.writeString(output, 9, this.devName_);
         }

         if ((this.bitField0_ & 512) != 0) {
            GeneratedMessageV3.writeString(output, 10, this.devOsVer_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            GeneratedMessageV3.writeString(output, 11, this.devRes_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            GeneratedMessageV3.writeString(output, 12, this.netOper_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            GeneratedMessageV3.writeString(output, 13, this.version_);
         }

         if ((this.bitField0_ & 8192) != 0) {
            output.writeInt32(14, this.age_);
         }

         if ((this.bitField0_ & 16384) != 0) {
            output.writeBool(15, this.isGuest_);
         }

         if ((this.bitField0_ & '耀') != 0) {
            GeneratedMessageV3.writeString(output, 16, this.accountName_);
         }

         if ((this.bitField0_ & 65536) != 0) {
            output.writeInt32(17, this.accountType_);
         }

         if ((this.bitField0_ & 131072) != 0) {
            output.writeInt32(18, this.loginTime_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.account_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.passwad_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.serverId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.sign_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += GeneratedMessageV3.computeStringSize(5, this.channelId_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += GeneratedMessageV3.computeStringSize(6, this.netInfo_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += GeneratedMessageV3.computeStringSize(7, this.groupId_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += GeneratedMessageV3.computeStringSize(8, this.devUID_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += GeneratedMessageV3.computeStringSize(9, this.devName_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += GeneratedMessageV3.computeStringSize(10, this.devOsVer_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += GeneratedMessageV3.computeStringSize(11, this.devRes_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += GeneratedMessageV3.computeStringSize(12, this.netOper_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += GeneratedMessageV3.computeStringSize(13, this.version_);
            }

            if ((this.bitField0_ & 8192) != 0) {
               size += CodedOutputStream.computeInt32Size(14, this.age_);
            }

            if ((this.bitField0_ & 16384) != 0) {
               size += CodedOutputStream.computeBoolSize(15, this.isGuest_);
            }

            if ((this.bitField0_ & '耀') != 0) {
               size += GeneratedMessageV3.computeStringSize(16, this.accountName_);
            }

            if ((this.bitField0_ & 65536) != 0) {
               size += CodedOutputStream.computeInt32Size(17, this.accountType_);
            }

            if ((this.bitField0_ & 131072) != 0) {
               size += CodedOutputStream.computeInt32Size(18, this.loginTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Login_1000)) {
            return super.equals(obj);
         } else {
            C2S_Login_1000 other = (C2S_Login_1000)obj;
            if (this.hasAccount() != other.hasAccount()) {
               return false;
            } else if (this.hasAccount() && !this.getAccount().equals(other.getAccount())) {
               return false;
            } else if (this.hasPasswad() != other.hasPasswad()) {
               return false;
            } else if (this.hasPasswad() && !this.getPasswad().equals(other.getPasswad())) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasSign() != other.hasSign()) {
               return false;
            } else if (this.hasSign() && !this.getSign().equals(other.getSign())) {
               return false;
            } else if (this.hasChannelId() != other.hasChannelId()) {
               return false;
            } else if (this.hasChannelId() && !this.getChannelId().equals(other.getChannelId())) {
               return false;
            } else if (this.hasNetInfo() != other.hasNetInfo()) {
               return false;
            } else if (this.hasNetInfo() && !this.getNetInfo().equals(other.getNetInfo())) {
               return false;
            } else if (this.hasGroupId() != other.hasGroupId()) {
               return false;
            } else if (this.hasGroupId() && !this.getGroupId().equals(other.getGroupId())) {
               return false;
            } else if (this.hasDevUID() != other.hasDevUID()) {
               return false;
            } else if (this.hasDevUID() && !this.getDevUID().equals(other.getDevUID())) {
               return false;
            } else if (this.hasDevName() != other.hasDevName()) {
               return false;
            } else if (this.hasDevName() && !this.getDevName().equals(other.getDevName())) {
               return false;
            } else if (this.hasDevOsVer() != other.hasDevOsVer()) {
               return false;
            } else if (this.hasDevOsVer() && !this.getDevOsVer().equals(other.getDevOsVer())) {
               return false;
            } else if (this.hasDevRes() != other.hasDevRes()) {
               return false;
            } else if (this.hasDevRes() && !this.getDevRes().equals(other.getDevRes())) {
               return false;
            } else if (this.hasNetOper() != other.hasNetOper()) {
               return false;
            } else if (this.hasNetOper() && !this.getNetOper().equals(other.getNetOper())) {
               return false;
            } else if (this.hasVersion() != other.hasVersion()) {
               return false;
            } else if (this.hasVersion() && !this.getVersion().equals(other.getVersion())) {
               return false;
            } else if (this.hasAge() != other.hasAge()) {
               return false;
            } else if (this.hasAge() && this.getAge() != other.getAge()) {
               return false;
            } else if (this.hasIsGuest() != other.hasIsGuest()) {
               return false;
            } else if (this.hasIsGuest() && this.getIsGuest() != other.getIsGuest()) {
               return false;
            } else if (this.hasAccountName() != other.hasAccountName()) {
               return false;
            } else if (this.hasAccountName() && !this.getAccountName().equals(other.getAccountName())) {
               return false;
            } else if (this.hasAccountType() != other.hasAccountType()) {
               return false;
            } else if (this.hasAccountType() && this.getAccountType() != other.getAccountType()) {
               return false;
            } else if (this.hasLoginTime() != other.hasLoginTime()) {
               return false;
            } else if (this.hasLoginTime() && this.getLoginTime() != other.getLoginTime()) {
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
            if (this.hasAccount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAccount().hashCode();
            }

            if (this.hasPasswad()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPasswad().hashCode();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasSign()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSign().hashCode();
            }

            if (this.hasChannelId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getChannelId().hashCode();
            }

            if (this.hasNetInfo()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getNetInfo().hashCode();
            }

            if (this.hasGroupId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getGroupId().hashCode();
            }

            if (this.hasDevUID()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getDevUID().hashCode();
            }

            if (this.hasDevName()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getDevName().hashCode();
            }

            if (this.hasDevOsVer()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getDevOsVer().hashCode();
            }

            if (this.hasDevRes()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getDevRes().hashCode();
            }

            if (this.hasNetOper()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getNetOper().hashCode();
            }

            if (this.hasVersion()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getVersion().hashCode();
            }

            if (this.hasAge()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + this.getAge();
            }

            if (this.hasIsGuest()) {
               hash = 37 * hash + 15;
               hash = 53 * hash + Internal.hashBoolean(this.getIsGuest());
            }

            if (this.hasAccountName()) {
               hash = 37 * hash + 16;
               hash = 53 * hash + this.getAccountName().hashCode();
            }

            if (this.hasAccountType()) {
               hash = 37 * hash + 17;
               hash = 53 * hash + this.getAccountType();
            }

            if (this.hasLoginTime()) {
               hash = 37 * hash + 18;
               hash = 53 * hash + this.getLoginTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Login_1000 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Login_1000)PARSER.parseFrom(data);
      }

      public static C2S_Login_1000 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Login_1000)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Login_1000 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Login_1000)PARSER.parseFrom(data);
      }

      public static C2S_Login_1000 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Login_1000)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Login_1000 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Login_1000)PARSER.parseFrom(data);
      }

      public static C2S_Login_1000 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Login_1000)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Login_1000 parseFrom(InputStream input) throws IOException {
         return (C2S_Login_1000)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Login_1000 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Login_1000)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Login_1000 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Login_1000)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Login_1000 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Login_1000)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Login_1000 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Login_1000)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Login_1000 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Login_1000)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Login_1000 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Login_1000 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Login_1000> parser() {
         return PARSER;
      }

      public Parser<C2S_Login_1000> getParserForType() {
         return PARSER;
      }

      public C2S_Login_1000 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Login_1000OrBuilder {
         private int bitField0_;
         private Object account_;
         private Object passwad_;
         private int serverId_;
         private Object sign_;
         private Object channelId_;
         private Object netInfo_;
         private Object groupId_;
         private Object devUID_;
         private Object devName_;
         private Object devOsVer_;
         private Object devRes_;
         private Object netOper_;
         private Object version_;
         private int age_;
         private boolean isGuest_;
         private Object accountName_;
         private int accountType_;
         private int loginTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_Login_1000_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_Login_1000_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Login_1000.class, Builder.class);
         }

         private Builder() {
            this.account_ = "";
            this.passwad_ = "";
            this.sign_ = "";
            this.channelId_ = "";
            this.netInfo_ = "";
            this.groupId_ = "";
            this.devUID_ = "";
            this.devName_ = "";
            this.devOsVer_ = "";
            this.devRes_ = "";
            this.netOper_ = "";
            this.version_ = "";
            this.accountName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.account_ = "";
            this.passwad_ = "";
            this.sign_ = "";
            this.channelId_ = "";
            this.netInfo_ = "";
            this.groupId_ = "";
            this.devUID_ = "";
            this.devName_ = "";
            this.devOsVer_ = "";
            this.devRes_ = "";
            this.netOper_ = "";
            this.version_ = "";
            this.accountName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LoginMsg.C2S_Login_1000.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.account_ = "";
            this.bitField0_ &= -2;
            this.passwad_ = "";
            this.bitField0_ &= -3;
            this.serverId_ = 0;
            this.bitField0_ &= -5;
            this.sign_ = "";
            this.bitField0_ &= -9;
            this.channelId_ = "";
            this.bitField0_ &= -17;
            this.netInfo_ = "";
            this.bitField0_ &= -33;
            this.groupId_ = "";
            this.bitField0_ &= -65;
            this.devUID_ = "";
            this.bitField0_ &= -129;
            this.devName_ = "";
            this.bitField0_ &= -257;
            this.devOsVer_ = "";
            this.bitField0_ &= -513;
            this.devRes_ = "";
            this.bitField0_ &= -1025;
            this.netOper_ = "";
            this.bitField0_ &= -2049;
            this.version_ = "";
            this.bitField0_ &= -4097;
            this.age_ = 0;
            this.bitField0_ &= -8193;
            this.isGuest_ = false;
            this.bitField0_ &= -16385;
            this.accountName_ = "";
            this.bitField0_ &= -32769;
            this.accountType_ = 0;
            this.bitField0_ &= -65537;
            this.loginTime_ = 0;
            this.bitField0_ &= -131073;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_Login_1000_descriptor;
         }

         public C2S_Login_1000 getDefaultInstanceForType() {
            return LoginMsg.C2S_Login_1000.getDefaultInstance();
         }

         public C2S_Login_1000 build() {
            C2S_Login_1000 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Login_1000 buildPartial() {
            C2S_Login_1000 result = new C2S_Login_1000(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.account_ = this.account_;
            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.passwad_ = this.passwad_;
            if ((from_bitField0_ & 4) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.sign_ = this.sign_;
            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 16;
            }

            result.channelId_ = this.channelId_;
            if ((from_bitField0_ & 32) != 0) {
               to_bitField0_ |= 32;
            }

            result.netInfo_ = this.netInfo_;
            if ((from_bitField0_ & 64) != 0) {
               to_bitField0_ |= 64;
            }

            result.groupId_ = this.groupId_;
            if ((from_bitField0_ & 128) != 0) {
               to_bitField0_ |= 128;
            }

            result.devUID_ = this.devUID_;
            if ((from_bitField0_ & 256) != 0) {
               to_bitField0_ |= 256;
            }

            result.devName_ = this.devName_;
            if ((from_bitField0_ & 512) != 0) {
               to_bitField0_ |= 512;
            }

            result.devOsVer_ = this.devOsVer_;
            if ((from_bitField0_ & 1024) != 0) {
               to_bitField0_ |= 1024;
            }

            result.devRes_ = this.devRes_;
            if ((from_bitField0_ & 2048) != 0) {
               to_bitField0_ |= 2048;
            }

            result.netOper_ = this.netOper_;
            if ((from_bitField0_ & 4096) != 0) {
               to_bitField0_ |= 4096;
            }

            result.version_ = this.version_;
            if ((from_bitField0_ & 8192) != 0) {
               result.age_ = this.age_;
               to_bitField0_ |= 8192;
            }

            if ((from_bitField0_ & 16384) != 0) {
               result.isGuest_ = this.isGuest_;
               to_bitField0_ |= 16384;
            }

            if ((from_bitField0_ & '耀') != 0) {
               to_bitField0_ |= 32768;
            }

            result.accountName_ = this.accountName_;
            if ((from_bitField0_ & 65536) != 0) {
               result.accountType_ = this.accountType_;
               to_bitField0_ |= 65536;
            }

            if ((from_bitField0_ & 131072) != 0) {
               result.loginTime_ = this.loginTime_;
               to_bitField0_ |= 131072;
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
            if (other instanceof C2S_Login_1000) {
               return this.mergeFrom((C2S_Login_1000)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Login_1000 other) {
            if (other == LoginMsg.C2S_Login_1000.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAccount()) {
                  this.bitField0_ |= 1;
                  this.account_ = other.account_;
                  this.onChanged();
               }

               if (other.hasPasswad()) {
                  this.bitField0_ |= 2;
                  this.passwad_ = other.passwad_;
                  this.onChanged();
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasSign()) {
                  this.bitField0_ |= 8;
                  this.sign_ = other.sign_;
                  this.onChanged();
               }

               if (other.hasChannelId()) {
                  this.bitField0_ |= 16;
                  this.channelId_ = other.channelId_;
                  this.onChanged();
               }

               if (other.hasNetInfo()) {
                  this.bitField0_ |= 32;
                  this.netInfo_ = other.netInfo_;
                  this.onChanged();
               }

               if (other.hasGroupId()) {
                  this.bitField0_ |= 64;
                  this.groupId_ = other.groupId_;
                  this.onChanged();
               }

               if (other.hasDevUID()) {
                  this.bitField0_ |= 128;
                  this.devUID_ = other.devUID_;
                  this.onChanged();
               }

               if (other.hasDevName()) {
                  this.bitField0_ |= 256;
                  this.devName_ = other.devName_;
                  this.onChanged();
               }

               if (other.hasDevOsVer()) {
                  this.bitField0_ |= 512;
                  this.devOsVer_ = other.devOsVer_;
                  this.onChanged();
               }

               if (other.hasDevRes()) {
                  this.bitField0_ |= 1024;
                  this.devRes_ = other.devRes_;
                  this.onChanged();
               }

               if (other.hasNetOper()) {
                  this.bitField0_ |= 2048;
                  this.netOper_ = other.netOper_;
                  this.onChanged();
               }

               if (other.hasVersion()) {
                  this.bitField0_ |= 4096;
                  this.version_ = other.version_;
                  this.onChanged();
               }

               if (other.hasAge()) {
                  this.setAge(other.getAge());
               }

               if (other.hasIsGuest()) {
                  this.setIsGuest(other.getIsGuest());
               }

               if (other.hasAccountName()) {
                  this.bitField0_ |= 32768;
                  this.accountName_ = other.accountName_;
                  this.onChanged();
               }

               if (other.hasAccountType()) {
                  this.setAccountType(other.getAccountType());
               }

               if (other.hasLoginTime()) {
                  this.setLoginTime(other.getLoginTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasAccount()) {
               return false;
            } else if (!this.hasPasswad()) {
               return false;
            } else {
               return this.hasServerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Login_1000 parsedMessage = null;

            try {
               parsedMessage = (C2S_Login_1000)LoginMsg.C2S_Login_1000.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Login_1000)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAccount() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getAccount() {
            Object ref = this.account_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.account_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getAccountBytes() {
            Object ref = this.account_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.account_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setAccount(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.account_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearAccount() {
            this.bitField0_ &= -2;
            this.account_ = LoginMsg.C2S_Login_1000.getDefaultInstance().getAccount();
            this.onChanged();
            return this;
         }

         public Builder setAccountBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.account_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasPasswad() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getPasswad() {
            Object ref = this.passwad_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.passwad_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getPasswadBytes() {
            Object ref = this.passwad_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.passwad_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setPasswad(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.passwad_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPasswad() {
            this.bitField0_ &= -3;
            this.passwad_ = LoginMsg.C2S_Login_1000.getDefaultInstance().getPasswad();
            this.onChanged();
            return this;
         }

         public Builder setPasswadBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.passwad_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 4;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -5;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSign() {
            return (this.bitField0_ & 8) != 0;
         }

         public String getSign() {
            Object ref = this.sign_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.sign_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getSignBytes() {
            Object ref = this.sign_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.sign_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setSign(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.sign_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearSign() {
            this.bitField0_ &= -9;
            this.sign_ = LoginMsg.C2S_Login_1000.getDefaultInstance().getSign();
            this.onChanged();
            return this;
         }

         public Builder setSignBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.sign_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasChannelId() {
            return (this.bitField0_ & 16) != 0;
         }

         public String getChannelId() {
            Object ref = this.channelId_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.channelId_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getChannelIdBytes() {
            Object ref = this.channelId_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.channelId_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setChannelId(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.channelId_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearChannelId() {
            this.bitField0_ &= -17;
            this.channelId_ = LoginMsg.C2S_Login_1000.getDefaultInstance().getChannelId();
            this.onChanged();
            return this;
         }

         public Builder setChannelIdBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.channelId_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasNetInfo() {
            return (this.bitField0_ & 32) != 0;
         }

         public String getNetInfo() {
            Object ref = this.netInfo_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.netInfo_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getNetInfoBytes() {
            Object ref = this.netInfo_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.netInfo_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setNetInfo(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32;
               this.netInfo_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearNetInfo() {
            this.bitField0_ &= -33;
            this.netInfo_ = LoginMsg.C2S_Login_1000.getDefaultInstance().getNetInfo();
            this.onChanged();
            return this;
         }

         public Builder setNetInfoBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32;
               this.netInfo_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasGroupId() {
            return (this.bitField0_ & 64) != 0;
         }

         public String getGroupId() {
            Object ref = this.groupId_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.groupId_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getGroupIdBytes() {
            Object ref = this.groupId_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.groupId_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setGroupId(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 64;
               this.groupId_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearGroupId() {
            this.bitField0_ &= -65;
            this.groupId_ = LoginMsg.C2S_Login_1000.getDefaultInstance().getGroupId();
            this.onChanged();
            return this;
         }

         public Builder setGroupIdBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 64;
               this.groupId_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasDevUID() {
            return (this.bitField0_ & 128) != 0;
         }

         public String getDevUID() {
            Object ref = this.devUID_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.devUID_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getDevUIDBytes() {
            Object ref = this.devUID_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.devUID_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setDevUID(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 128;
               this.devUID_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearDevUID() {
            this.bitField0_ &= -129;
            this.devUID_ = LoginMsg.C2S_Login_1000.getDefaultInstance().getDevUID();
            this.onChanged();
            return this;
         }

         public Builder setDevUIDBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 128;
               this.devUID_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasDevName() {
            return (this.bitField0_ & 256) != 0;
         }

         public String getDevName() {
            Object ref = this.devName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.devName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getDevNameBytes() {
            Object ref = this.devName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.devName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setDevName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 256;
               this.devName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearDevName() {
            this.bitField0_ &= -257;
            this.devName_ = LoginMsg.C2S_Login_1000.getDefaultInstance().getDevName();
            this.onChanged();
            return this;
         }

         public Builder setDevNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 256;
               this.devName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasDevOsVer() {
            return (this.bitField0_ & 512) != 0;
         }

         public String getDevOsVer() {
            Object ref = this.devOsVer_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.devOsVer_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getDevOsVerBytes() {
            Object ref = this.devOsVer_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.devOsVer_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setDevOsVer(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 512;
               this.devOsVer_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearDevOsVer() {
            this.bitField0_ &= -513;
            this.devOsVer_ = LoginMsg.C2S_Login_1000.getDefaultInstance().getDevOsVer();
            this.onChanged();
            return this;
         }

         public Builder setDevOsVerBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 512;
               this.devOsVer_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasDevRes() {
            return (this.bitField0_ & 1024) != 0;
         }

         public String getDevRes() {
            Object ref = this.devRes_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.devRes_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getDevResBytes() {
            Object ref = this.devRes_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.devRes_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setDevRes(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1024;
               this.devRes_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearDevRes() {
            this.bitField0_ &= -1025;
            this.devRes_ = LoginMsg.C2S_Login_1000.getDefaultInstance().getDevRes();
            this.onChanged();
            return this;
         }

         public Builder setDevResBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1024;
               this.devRes_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasNetOper() {
            return (this.bitField0_ & 2048) != 0;
         }

         public String getNetOper() {
            Object ref = this.netOper_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.netOper_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getNetOperBytes() {
            Object ref = this.netOper_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.netOper_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setNetOper(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2048;
               this.netOper_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearNetOper() {
            this.bitField0_ &= -2049;
            this.netOper_ = LoginMsg.C2S_Login_1000.getDefaultInstance().getNetOper();
            this.onChanged();
            return this;
         }

         public Builder setNetOperBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2048;
               this.netOper_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasVersion() {
            return (this.bitField0_ & 4096) != 0;
         }

         public String getVersion() {
            Object ref = this.version_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.version_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getVersionBytes() {
            Object ref = this.version_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.version_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setVersion(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4096;
               this.version_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearVersion() {
            this.bitField0_ &= -4097;
            this.version_ = LoginMsg.C2S_Login_1000.getDefaultInstance().getVersion();
            this.onChanged();
            return this;
         }

         public Builder setVersionBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4096;
               this.version_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasAge() {
            return (this.bitField0_ & 8192) != 0;
         }

         public int getAge() {
            return this.age_;
         }

         public Builder setAge(int value) {
            this.bitField0_ |= 8192;
            this.age_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAge() {
            this.bitField0_ &= -8193;
            this.age_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsGuest() {
            return (this.bitField0_ & 16384) != 0;
         }

         public boolean getIsGuest() {
            return this.isGuest_;
         }

         public Builder setIsGuest(boolean value) {
            this.bitField0_ |= 16384;
            this.isGuest_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsGuest() {
            this.bitField0_ &= -16385;
            this.isGuest_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasAccountName() {
            return (this.bitField0_ & '耀') != 0;
         }

         public String getAccountName() {
            Object ref = this.accountName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.accountName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getAccountNameBytes() {
            Object ref = this.accountName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.accountName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setAccountName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32768;
               this.accountName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearAccountName() {
            this.bitField0_ &= -32769;
            this.accountName_ = LoginMsg.C2S_Login_1000.getDefaultInstance().getAccountName();
            this.onChanged();
            return this;
         }

         public Builder setAccountNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 32768;
               this.accountName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasAccountType() {
            return (this.bitField0_ & 65536) != 0;
         }

         public int getAccountType() {
            return this.accountType_;
         }

         public Builder setAccountType(int value) {
            this.bitField0_ |= 65536;
            this.accountType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAccountType() {
            this.bitField0_ &= -65537;
            this.accountType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLoginTime() {
            return (this.bitField0_ & 131072) != 0;
         }

         public int getLoginTime() {
            return this.loginTime_;
         }

         public Builder setLoginTime(int value) {
            this.bitField0_ |= 131072;
            this.loginTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLoginTime() {
            this.bitField0_ &= -131073;
            this.loginTime_ = 0;
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

   public static final class S2C_LoginResult_1001 extends GeneratedMessageV3 implements S2C_LoginResult_1001OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      public static final int ISRECONNECT_FIELD_NUMBER = 4;
      private int isReconnect_;
      public static final int AREA_FIELD_NUMBER = 5;
      private volatile Object area_;
      public static final int LV_FIELD_NUMBER = 6;
      private int lv_;
      private byte memoizedIsInitialized;
      private static final S2C_LoginResult_1001 DEFAULT_INSTANCE = new S2C_LoginResult_1001();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LoginResult_1001> PARSER = new AbstractParser<S2C_LoginResult_1001>() {
         public S2C_LoginResult_1001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LoginResult_1001(input, extensionRegistry);
         }
      };

      private S2C_LoginResult_1001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LoginResult_1001() {
         this.memoizedIsInitialized = -1;
         this.result_ = 0;
         this.playerName_ = "";
         this.area_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LoginResult_1001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LoginResult_1001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        resultType value = LoginMsg.resultType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.result_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.playerName_ = bs;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.isReconnect_ = input.readInt32();
                        break;
                     case 42:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16;
                        this.area_ = bs;
                        break;
                     case 48:
                        this.bitField0_ |= 32;
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
         return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_LoginResult_1001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_LoginResult_1001_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LoginResult_1001.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public resultType getResult() {
         resultType result = LoginMsg.resultType.valueOf(this.result_);
         return result == null ? LoginMsg.resultType.SUCCESS : result;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 4) != 0;
      }

      public String getPlayerName() {
         Object ref = this.playerName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.playerName_ = s;
            }

            return s;
         }
      }

      public ByteString getPlayerNameBytes() {
         Object ref = this.playerName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.playerName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasIsReconnect() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getIsReconnect() {
         return this.isReconnect_;
      }

      public boolean hasArea() {
         return (this.bitField0_ & 16) != 0;
      }

      public String getArea() {
         Object ref = this.area_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.area_ = s;
            }

            return s;
         }
      }

      public ByteString getAreaBytes() {
         Object ref = this.area_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.area_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasLv() {
         return (this.bitField0_ & 32) != 0;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.isReconnect_);
         }

         if ((this.bitField0_ & 16) != 0) {
            GeneratedMessageV3.writeString(output, 5, this.area_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.lv_);
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
               size += CodedOutputStream.computeEnumSize(1, this.result_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.isReconnect_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += GeneratedMessageV3.computeStringSize(5, this.area_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.lv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LoginResult_1001)) {
            return super.equals(obj);
         } else {
            S2C_LoginResult_1001 other = (S2C_LoginResult_1001)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.result_ != other.result_) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasIsReconnect() != other.hasIsReconnect()) {
               return false;
            } else if (this.hasIsReconnect() && this.getIsReconnect() != other.getIsReconnect()) {
               return false;
            } else if (this.hasArea() != other.hasArea()) {
               return false;
            } else if (this.hasArea() && !this.getArea().equals(other.getArea())) {
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
               hash = 53 * hash + this.result_;
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasIsReconnect()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getIsReconnect();
            }

            if (this.hasArea()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getArea().hashCode();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LoginResult_1001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LoginResult_1001)PARSER.parseFrom(data);
      }

      public static S2C_LoginResult_1001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LoginResult_1001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LoginResult_1001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LoginResult_1001)PARSER.parseFrom(data);
      }

      public static S2C_LoginResult_1001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LoginResult_1001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LoginResult_1001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LoginResult_1001)PARSER.parseFrom(data);
      }

      public static S2C_LoginResult_1001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LoginResult_1001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LoginResult_1001 parseFrom(InputStream input) throws IOException {
         return (S2C_LoginResult_1001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LoginResult_1001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LoginResult_1001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LoginResult_1001 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LoginResult_1001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LoginResult_1001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LoginResult_1001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LoginResult_1001 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LoginResult_1001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LoginResult_1001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LoginResult_1001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LoginResult_1001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LoginResult_1001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LoginResult_1001> parser() {
         return PARSER;
      }

      public Parser<S2C_LoginResult_1001> getParserForType() {
         return PARSER;
      }

      public S2C_LoginResult_1001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LoginResult_1001OrBuilder {
         private int bitField0_;
         private int result_;
         private int playerId_;
         private Object playerName_;
         private int isReconnect_;
         private Object area_;
         private int lv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_LoginResult_1001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_LoginResult_1001_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LoginResult_1001.class, Builder.class);
         }

         private Builder() {
            this.result_ = 0;
            this.playerName_ = "";
            this.area_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.result_ = 0;
            this.playerName_ = "";
            this.area_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LoginMsg.S2C_LoginResult_1001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.playerName_ = "";
            this.bitField0_ &= -5;
            this.isReconnect_ = 0;
            this.bitField0_ &= -9;
            this.area_ = "";
            this.bitField0_ &= -17;
            this.lv_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_LoginResult_1001_descriptor;
         }

         public S2C_LoginResult_1001 getDefaultInstanceForType() {
            return LoginMsg.S2C_LoginResult_1001.getDefaultInstance();
         }

         public S2C_LoginResult_1001 build() {
            S2C_LoginResult_1001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LoginResult_1001 buildPartial() {
            S2C_LoginResult_1001 result = new S2C_LoginResult_1001(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.result_ = this.result_;
            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 8) != 0) {
               result.isReconnect_ = this.isReconnect_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 16;
            }

            result.area_ = this.area_;
            if ((from_bitField0_ & 32) != 0) {
               result.lv_ = this.lv_;
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
            if (other instanceof S2C_LoginResult_1001) {
               return this.mergeFrom((S2C_LoginResult_1001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LoginResult_1001 other) {
            if (other == LoginMsg.S2C_LoginResult_1001.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasIsReconnect()) {
                  this.setIsReconnect(other.getIsReconnect());
               }

               if (other.hasArea()) {
                  this.bitField0_ |= 16;
                  this.area_ = other.area_;
                  this.onChanged();
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
            return this.hasResult();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LoginResult_1001 parsedMessage = null;

            try {
               parsedMessage = (S2C_LoginResult_1001)LoginMsg.S2C_LoginResult_1001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LoginResult_1001)e.getUnfinishedMessage();
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

         public resultType getResult() {
            resultType result = LoginMsg.resultType.valueOf(this.result_);
            return result == null ? LoginMsg.resultType.SUCCESS : result;
         }

         public Builder setResult(resultType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.result_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 2;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -3;
            this.playerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 4) != 0;
         }

         public String getPlayerName() {
            Object ref = this.playerName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.playerName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getPlayerNameBytes() {
            Object ref = this.playerName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.playerName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setPlayerName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -5;
            this.playerName_ = LoginMsg.S2C_LoginResult_1001.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasIsReconnect() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getIsReconnect() {
            return this.isReconnect_;
         }

         public Builder setIsReconnect(int value) {
            this.bitField0_ |= 8;
            this.isReconnect_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsReconnect() {
            this.bitField0_ &= -9;
            this.isReconnect_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasArea() {
            return (this.bitField0_ & 16) != 0;
         }

         public String getArea() {
            Object ref = this.area_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.area_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getAreaBytes() {
            Object ref = this.area_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.area_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setArea(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.area_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearArea() {
            this.bitField0_ &= -17;
            this.area_ = LoginMsg.S2C_LoginResult_1001.getDefaultInstance().getArea();
            this.onChanged();
            return this;
         }

         public Builder setAreaBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.area_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasLv() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 32;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -33;
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

   public static final class C2S_CreateRole_1002 extends GeneratedMessageV3 implements C2S_CreateRole_1002OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SEX_FIELD_NUMBER = 1;
      private int sex_;
      public static final int PLAYERNAME_FIELD_NUMBER = 2;
      private volatile Object playerName_;
      public static final int RECOMMENDCODE_FIELD_NUMBER = 3;
      private int recommendCode_;
      private byte memoizedIsInitialized;
      private static final C2S_CreateRole_1002 DEFAULT_INSTANCE = new C2S_CreateRole_1002();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CreateRole_1002> PARSER = new AbstractParser<C2S_CreateRole_1002>() {
         public C2S_CreateRole_1002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CreateRole_1002(input, extensionRegistry);
         }
      };

      private C2S_CreateRole_1002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CreateRole_1002() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CreateRole_1002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CreateRole_1002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.sex_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.playerName_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.recommendCode_ = input.readInt32();
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
         return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_CreateRole_1002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_CreateRole_1002_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CreateRole_1002.class, Builder.class);
      }

      public boolean hasSex() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSex() {
         return this.sex_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getPlayerName() {
         Object ref = this.playerName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.playerName_ = s;
            }

            return s;
         }
      }

      public ByteString getPlayerNameBytes() {
         Object ref = this.playerName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.playerName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasRecommendCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getRecommendCode() {
         return this.recommendCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.sex_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.playerName_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.recommendCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.sex_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.playerName_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.recommendCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CreateRole_1002)) {
            return super.equals(obj);
         } else {
            C2S_CreateRole_1002 other = (C2S_CreateRole_1002)obj;
            if (this.hasSex() != other.hasSex()) {
               return false;
            } else if (this.hasSex() && this.getSex() != other.getSex()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasRecommendCode() != other.hasRecommendCode()) {
               return false;
            } else if (this.hasRecommendCode() && this.getRecommendCode() != other.getRecommendCode()) {
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
            if (this.hasSex()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSex();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasRecommendCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRecommendCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CreateRole_1002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CreateRole_1002)PARSER.parseFrom(data);
      }

      public static C2S_CreateRole_1002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CreateRole_1002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CreateRole_1002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CreateRole_1002)PARSER.parseFrom(data);
      }

      public static C2S_CreateRole_1002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CreateRole_1002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CreateRole_1002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CreateRole_1002)PARSER.parseFrom(data);
      }

      public static C2S_CreateRole_1002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CreateRole_1002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CreateRole_1002 parseFrom(InputStream input) throws IOException {
         return (C2S_CreateRole_1002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CreateRole_1002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CreateRole_1002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CreateRole_1002 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CreateRole_1002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CreateRole_1002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CreateRole_1002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CreateRole_1002 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CreateRole_1002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CreateRole_1002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CreateRole_1002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CreateRole_1002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CreateRole_1002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CreateRole_1002> parser() {
         return PARSER;
      }

      public Parser<C2S_CreateRole_1002> getParserForType() {
         return PARSER;
      }

      public C2S_CreateRole_1002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CreateRole_1002OrBuilder {
         private int bitField0_;
         private int sex_;
         private Object playerName_;
         private int recommendCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_CreateRole_1002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_CreateRole_1002_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CreateRole_1002.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LoginMsg.C2S_CreateRole_1002.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.sex_ = 0;
            this.bitField0_ &= -2;
            this.playerName_ = "";
            this.bitField0_ &= -3;
            this.recommendCode_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_CreateRole_1002_descriptor;
         }

         public C2S_CreateRole_1002 getDefaultInstanceForType() {
            return LoginMsg.C2S_CreateRole_1002.getDefaultInstance();
         }

         public C2S_CreateRole_1002 build() {
            C2S_CreateRole_1002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CreateRole_1002 buildPartial() {
            C2S_CreateRole_1002 result = new C2S_CreateRole_1002(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.sex_ = this.sex_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 4) != 0) {
               result.recommendCode_ = this.recommendCode_;
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
            if (other instanceof C2S_CreateRole_1002) {
               return this.mergeFrom((C2S_CreateRole_1002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CreateRole_1002 other) {
            if (other == LoginMsg.C2S_CreateRole_1002.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSex()) {
                  this.setSex(other.getSex());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 2;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasRecommendCode()) {
                  this.setRecommendCode(other.getRecommendCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSex()) {
               return false;
            } else {
               return this.hasPlayerName();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CreateRole_1002 parsedMessage = null;

            try {
               parsedMessage = (C2S_CreateRole_1002)LoginMsg.C2S_CreateRole_1002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CreateRole_1002)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSex() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSex() {
            return this.sex_;
         }

         public Builder setSex(int value) {
            this.bitField0_ |= 1;
            this.sex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSex() {
            this.bitField0_ &= -2;
            this.sex_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getPlayerName() {
            Object ref = this.playerName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.playerName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getPlayerNameBytes() {
            Object ref = this.playerName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.playerName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setPlayerName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -3;
            this.playerName_ = LoginMsg.C2S_CreateRole_1002.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasRecommendCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getRecommendCode() {
            return this.recommendCode_;
         }

         public Builder setRecommendCode(int value) {
            this.bitField0_ |= 4;
            this.recommendCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecommendCode() {
            this.bitField0_ &= -5;
            this.recommendCode_ = 0;
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

   public static final class S2C_CreateRoleResult_1003 extends GeneratedMessageV3 implements S2C_CreateRoleResult_1003OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ERROR_FIELD_NUMBER = 1;
      private int error_;
      private byte memoizedIsInitialized;
      private static final S2C_CreateRoleResult_1003 DEFAULT_INSTANCE = new S2C_CreateRoleResult_1003();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CreateRoleResult_1003> PARSER = new AbstractParser<S2C_CreateRoleResult_1003>() {
         public S2C_CreateRoleResult_1003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CreateRoleResult_1003(input, extensionRegistry);
         }
      };

      private S2C_CreateRoleResult_1003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CreateRoleResult_1003() {
         this.memoizedIsInitialized = -1;
         this.error_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CreateRoleResult_1003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CreateRoleResult_1003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ErrorCode value = LoginMsg.ErrorCode.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.error_ = rawValue;
                        }
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
         return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_CreateRoleResult_1003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_CreateRoleResult_1003_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CreateRoleResult_1003.class, Builder.class);
      }

      public boolean hasError() {
         return (this.bitField0_ & 1) != 0;
      }

      public ErrorCode getError() {
         ErrorCode result = LoginMsg.ErrorCode.valueOf(this.error_);
         return result == null ? LoginMsg.ErrorCode.RECOMMEND_ERROR : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasError()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.error_);
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
               size += CodedOutputStream.computeEnumSize(1, this.error_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CreateRoleResult_1003)) {
            return super.equals(obj);
         } else {
            S2C_CreateRoleResult_1003 other = (S2C_CreateRoleResult_1003)obj;
            if (this.hasError() != other.hasError()) {
               return false;
            } else if (this.hasError() && this.error_ != other.error_) {
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
            if (this.hasError()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.error_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CreateRoleResult_1003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CreateRoleResult_1003)PARSER.parseFrom(data);
      }

      public static S2C_CreateRoleResult_1003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CreateRoleResult_1003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CreateRoleResult_1003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CreateRoleResult_1003)PARSER.parseFrom(data);
      }

      public static S2C_CreateRoleResult_1003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CreateRoleResult_1003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CreateRoleResult_1003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CreateRoleResult_1003)PARSER.parseFrom(data);
      }

      public static S2C_CreateRoleResult_1003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CreateRoleResult_1003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CreateRoleResult_1003 parseFrom(InputStream input) throws IOException {
         return (S2C_CreateRoleResult_1003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CreateRoleResult_1003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CreateRoleResult_1003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CreateRoleResult_1003 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CreateRoleResult_1003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CreateRoleResult_1003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CreateRoleResult_1003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CreateRoleResult_1003 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CreateRoleResult_1003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CreateRoleResult_1003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CreateRoleResult_1003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CreateRoleResult_1003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CreateRoleResult_1003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CreateRoleResult_1003> parser() {
         return PARSER;
      }

      public Parser<S2C_CreateRoleResult_1003> getParserForType() {
         return PARSER;
      }

      public S2C_CreateRoleResult_1003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CreateRoleResult_1003OrBuilder {
         private int bitField0_;
         private int error_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_CreateRoleResult_1003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_CreateRoleResult_1003_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CreateRoleResult_1003.class, Builder.class);
         }

         private Builder() {
            this.error_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.error_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LoginMsg.S2C_CreateRoleResult_1003.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.error_ = 1;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_CreateRoleResult_1003_descriptor;
         }

         public S2C_CreateRoleResult_1003 getDefaultInstanceForType() {
            return LoginMsg.S2C_CreateRoleResult_1003.getDefaultInstance();
         }

         public S2C_CreateRoleResult_1003 build() {
            S2C_CreateRoleResult_1003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CreateRoleResult_1003 buildPartial() {
            S2C_CreateRoleResult_1003 result = new S2C_CreateRoleResult_1003(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.error_ = this.error_;
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
            if (other instanceof S2C_CreateRoleResult_1003) {
               return this.mergeFrom((S2C_CreateRoleResult_1003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CreateRoleResult_1003 other) {
            if (other == LoginMsg.S2C_CreateRoleResult_1003.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasError()) {
                  this.setError(other.getError());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasError();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CreateRoleResult_1003 parsedMessage = null;

            try {
               parsedMessage = (S2C_CreateRoleResult_1003)LoginMsg.S2C_CreateRoleResult_1003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CreateRoleResult_1003)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
         }

         public ErrorCode getError() {
            ErrorCode result = LoginMsg.ErrorCode.valueOf(this.error_);
            return result == null ? LoginMsg.ErrorCode.RECOMMEND_ERROR : result;
         }

         public Builder setError(ErrorCode value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.error_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearError() {
            this.bitField0_ &= -2;
            this.error_ = 1;
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

   public static final class S2C_Respond_1004 extends GeneratedMessageV3 implements S2C_Respond_1004OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final S2C_Respond_1004 DEFAULT_INSTANCE = new S2C_Respond_1004();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Respond_1004> PARSER = new AbstractParser<S2C_Respond_1004>() {
         public S2C_Respond_1004 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Respond_1004(input, extensionRegistry);
         }
      };

      private S2C_Respond_1004(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Respond_1004() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Respond_1004();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Respond_1004(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_Respond_1004_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_Respond_1004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Respond_1004.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Respond_1004)) {
            return super.equals(obj);
         } else {
            S2C_Respond_1004 other = (S2C_Respond_1004)obj;
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

      public static S2C_Respond_1004 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Respond_1004)PARSER.parseFrom(data);
      }

      public static S2C_Respond_1004 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Respond_1004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Respond_1004 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Respond_1004)PARSER.parseFrom(data);
      }

      public static S2C_Respond_1004 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Respond_1004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Respond_1004 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Respond_1004)PARSER.parseFrom(data);
      }

      public static S2C_Respond_1004 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Respond_1004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Respond_1004 parseFrom(InputStream input) throws IOException {
         return (S2C_Respond_1004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Respond_1004 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Respond_1004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Respond_1004 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Respond_1004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Respond_1004 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Respond_1004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Respond_1004 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Respond_1004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Respond_1004 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Respond_1004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Respond_1004 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Respond_1004 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Respond_1004> parser() {
         return PARSER;
      }

      public Parser<S2C_Respond_1004> getParserForType() {
         return PARSER;
      }

      public S2C_Respond_1004 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Respond_1004OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_Respond_1004_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_Respond_1004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Respond_1004.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LoginMsg.S2C_Respond_1004.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_Respond_1004_descriptor;
         }

         public S2C_Respond_1004 getDefaultInstanceForType() {
            return LoginMsg.S2C_Respond_1004.getDefaultInstance();
         }

         public S2C_Respond_1004 build() {
            S2C_Respond_1004 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Respond_1004 buildPartial() {
            S2C_Respond_1004 result = new S2C_Respond_1004(this);
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
            if (other instanceof S2C_Respond_1004) {
               return this.mergeFrom((S2C_Respond_1004)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Respond_1004 other) {
            if (other == LoginMsg.S2C_Respond_1004.getDefaultInstance()) {
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
            S2C_Respond_1004 parsedMessage = null;

            try {
               parsedMessage = (S2C_Respond_1004)LoginMsg.S2C_Respond_1004.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Respond_1004)e.getUnfinishedMessage();
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

   public static final class S2C_ReconnectKey_1005 extends GeneratedMessageV3 implements S2C_ReconnectKey_1005OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int KEY_FIELD_NUMBER = 1;
      private volatile Object key_;
      private byte memoizedIsInitialized;
      private static final S2C_ReconnectKey_1005 DEFAULT_INSTANCE = new S2C_ReconnectKey_1005();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReconnectKey_1005> PARSER = new AbstractParser<S2C_ReconnectKey_1005>() {
         public S2C_ReconnectKey_1005 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReconnectKey_1005(input, extensionRegistry);
         }
      };

      private S2C_ReconnectKey_1005(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReconnectKey_1005() {
         this.memoizedIsInitialized = -1;
         this.key_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReconnectKey_1005();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReconnectKey_1005(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.key_ = bs;
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
         return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_ReconnectKey_1005_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_ReconnectKey_1005_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReconnectKey_1005.class, Builder.class);
      }

      public boolean hasKey() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getKey() {
         Object ref = this.key_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.key_ = s;
            }

            return s;
         }
      }

      public ByteString getKeyBytes() {
         Object ref = this.key_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.key_ = b;
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
         } else if (!this.hasKey()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.key_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.key_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReconnectKey_1005)) {
            return super.equals(obj);
         } else {
            S2C_ReconnectKey_1005 other = (S2C_ReconnectKey_1005)obj;
            if (this.hasKey() != other.hasKey()) {
               return false;
            } else if (this.hasKey() && !this.getKey().equals(other.getKey())) {
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
            if (this.hasKey()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getKey().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReconnectKey_1005 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReconnectKey_1005)PARSER.parseFrom(data);
      }

      public static S2C_ReconnectKey_1005 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReconnectKey_1005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReconnectKey_1005 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReconnectKey_1005)PARSER.parseFrom(data);
      }

      public static S2C_ReconnectKey_1005 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReconnectKey_1005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReconnectKey_1005 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReconnectKey_1005)PARSER.parseFrom(data);
      }

      public static S2C_ReconnectKey_1005 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReconnectKey_1005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReconnectKey_1005 parseFrom(InputStream input) throws IOException {
         return (S2C_ReconnectKey_1005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReconnectKey_1005 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReconnectKey_1005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReconnectKey_1005 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReconnectKey_1005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReconnectKey_1005 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReconnectKey_1005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReconnectKey_1005 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReconnectKey_1005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReconnectKey_1005 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReconnectKey_1005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReconnectKey_1005 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReconnectKey_1005 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReconnectKey_1005> parser() {
         return PARSER;
      }

      public Parser<S2C_ReconnectKey_1005> getParserForType() {
         return PARSER;
      }

      public S2C_ReconnectKey_1005 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReconnectKey_1005OrBuilder {
         private int bitField0_;
         private Object key_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_ReconnectKey_1005_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_ReconnectKey_1005_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReconnectKey_1005.class, Builder.class);
         }

         private Builder() {
            this.key_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.key_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LoginMsg.S2C_ReconnectKey_1005.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.key_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_ReconnectKey_1005_descriptor;
         }

         public S2C_ReconnectKey_1005 getDefaultInstanceForType() {
            return LoginMsg.S2C_ReconnectKey_1005.getDefaultInstance();
         }

         public S2C_ReconnectKey_1005 build() {
            S2C_ReconnectKey_1005 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReconnectKey_1005 buildPartial() {
            S2C_ReconnectKey_1005 result = new S2C_ReconnectKey_1005(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.key_ = this.key_;
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
            if (other instanceof S2C_ReconnectKey_1005) {
               return this.mergeFrom((S2C_ReconnectKey_1005)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReconnectKey_1005 other) {
            if (other == LoginMsg.S2C_ReconnectKey_1005.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasKey()) {
                  this.bitField0_ |= 1;
                  this.key_ = other.key_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasKey();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ReconnectKey_1005 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReconnectKey_1005)LoginMsg.S2C_ReconnectKey_1005.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReconnectKey_1005)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasKey() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getKey() {
            Object ref = this.key_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.key_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getKeyBytes() {
            Object ref = this.key_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.key_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setKey(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.key_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearKey() {
            this.bitField0_ &= -2;
            this.key_ = LoginMsg.S2C_ReconnectKey_1005.getDefaultInstance().getKey();
            this.onChanged();
            return this;
         }

         public Builder setKeyBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.key_ = value;
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

   public static final class C2S_ReconnectKey_1006 extends GeneratedMessageV3 implements C2S_ReconnectKey_1006OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int KEY_FIELD_NUMBER = 1;
      private volatile Object key_;
      private byte memoizedIsInitialized;
      private static final C2S_ReconnectKey_1006 DEFAULT_INSTANCE = new C2S_ReconnectKey_1006();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReconnectKey_1006> PARSER = new AbstractParser<C2S_ReconnectKey_1006>() {
         public C2S_ReconnectKey_1006 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReconnectKey_1006(input, extensionRegistry);
         }
      };

      private C2S_ReconnectKey_1006(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReconnectKey_1006() {
         this.memoizedIsInitialized = -1;
         this.key_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReconnectKey_1006();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReconnectKey_1006(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.key_ = bs;
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
         return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_ReconnectKey_1006_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_ReconnectKey_1006_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReconnectKey_1006.class, Builder.class);
      }

      public boolean hasKey() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getKey() {
         Object ref = this.key_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.key_ = s;
            }

            return s;
         }
      }

      public ByteString getKeyBytes() {
         Object ref = this.key_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.key_ = b;
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
         } else if (!this.hasKey()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.key_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.key_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ReconnectKey_1006)) {
            return super.equals(obj);
         } else {
            C2S_ReconnectKey_1006 other = (C2S_ReconnectKey_1006)obj;
            if (this.hasKey() != other.hasKey()) {
               return false;
            } else if (this.hasKey() && !this.getKey().equals(other.getKey())) {
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
            if (this.hasKey()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getKey().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ReconnectKey_1006 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReconnectKey_1006)PARSER.parseFrom(data);
      }

      public static C2S_ReconnectKey_1006 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReconnectKey_1006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReconnectKey_1006 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReconnectKey_1006)PARSER.parseFrom(data);
      }

      public static C2S_ReconnectKey_1006 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReconnectKey_1006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReconnectKey_1006 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReconnectKey_1006)PARSER.parseFrom(data);
      }

      public static C2S_ReconnectKey_1006 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReconnectKey_1006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReconnectKey_1006 parseFrom(InputStream input) throws IOException {
         return (C2S_ReconnectKey_1006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReconnectKey_1006 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReconnectKey_1006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReconnectKey_1006 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReconnectKey_1006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReconnectKey_1006 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReconnectKey_1006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReconnectKey_1006 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReconnectKey_1006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReconnectKey_1006 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReconnectKey_1006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReconnectKey_1006 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReconnectKey_1006 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReconnectKey_1006> parser() {
         return PARSER;
      }

      public Parser<C2S_ReconnectKey_1006> getParserForType() {
         return PARSER;
      }

      public C2S_ReconnectKey_1006 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReconnectKey_1006OrBuilder {
         private int bitField0_;
         private Object key_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_ReconnectKey_1006_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_ReconnectKey_1006_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReconnectKey_1006.class, Builder.class);
         }

         private Builder() {
            this.key_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.key_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LoginMsg.C2S_ReconnectKey_1006.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.key_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_ReconnectKey_1006_descriptor;
         }

         public C2S_ReconnectKey_1006 getDefaultInstanceForType() {
            return LoginMsg.C2S_ReconnectKey_1006.getDefaultInstance();
         }

         public C2S_ReconnectKey_1006 build() {
            C2S_ReconnectKey_1006 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReconnectKey_1006 buildPartial() {
            C2S_ReconnectKey_1006 result = new C2S_ReconnectKey_1006(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.key_ = this.key_;
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
            if (other instanceof C2S_ReconnectKey_1006) {
               return this.mergeFrom((C2S_ReconnectKey_1006)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReconnectKey_1006 other) {
            if (other == LoginMsg.C2S_ReconnectKey_1006.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasKey()) {
                  this.bitField0_ |= 1;
                  this.key_ = other.key_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasKey();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ReconnectKey_1006 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReconnectKey_1006)LoginMsg.C2S_ReconnectKey_1006.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReconnectKey_1006)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasKey() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getKey() {
            Object ref = this.key_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.key_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getKeyBytes() {
            Object ref = this.key_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.key_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setKey(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.key_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearKey() {
            this.bitField0_ &= -2;
            this.key_ = LoginMsg.C2S_ReconnectKey_1006.getDefaultInstance().getKey();
            this.onChanged();
            return this;
         }

         public Builder setKeyBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.key_ = value;
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

   public static final class S2C_CrossMsg extends GeneratedMessageV3 implements S2C_CrossMsgOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SOURCESERVERID_FIELD_NUMBER = 1;
      private int sourceServerId_;
      public static final int SOURCEMGRID_FIELD_NUMBER = 2;
      private int sourceMgrId_;
      public static final int DESTSERVERID_FIELD_NUMBER = 3;
      private int destServerId_;
      public static final int DESTMGRID_FIELD_NUMBER = 4;
      private int destMgrId_;
      private byte memoizedIsInitialized;
      private static final S2C_CrossMsg DEFAULT_INSTANCE = new S2C_CrossMsg();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CrossMsg> PARSER = new AbstractParser<S2C_CrossMsg>() {
         public S2C_CrossMsg parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CrossMsg(input, extensionRegistry);
         }
      };

      private S2C_CrossMsg(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CrossMsg() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CrossMsg();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CrossMsg(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.sourceServerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.sourceMgrId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.destServerId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.destMgrId_ = input.readInt32();
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
         return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_CrossMsg_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_CrossMsg_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CrossMsg.class, Builder.class);
      }

      public boolean hasSourceServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSourceServerId() {
         return this.sourceServerId_;
      }

      public boolean hasSourceMgrId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSourceMgrId() {
         return this.sourceMgrId_;
      }

      public boolean hasDestServerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDestServerId() {
         return this.destServerId_;
      }

      public boolean hasDestMgrId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDestMgrId() {
         return this.destMgrId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSourceServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSourceMgrId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDestServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDestMgrId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.sourceServerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.sourceMgrId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.destServerId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.destMgrId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.sourceServerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.sourceMgrId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.destServerId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.destMgrId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CrossMsg)) {
            return super.equals(obj);
         } else {
            S2C_CrossMsg other = (S2C_CrossMsg)obj;
            if (this.hasSourceServerId() != other.hasSourceServerId()) {
               return false;
            } else if (this.hasSourceServerId() && this.getSourceServerId() != other.getSourceServerId()) {
               return false;
            } else if (this.hasSourceMgrId() != other.hasSourceMgrId()) {
               return false;
            } else if (this.hasSourceMgrId() && this.getSourceMgrId() != other.getSourceMgrId()) {
               return false;
            } else if (this.hasDestServerId() != other.hasDestServerId()) {
               return false;
            } else if (this.hasDestServerId() && this.getDestServerId() != other.getDestServerId()) {
               return false;
            } else if (this.hasDestMgrId() != other.hasDestMgrId()) {
               return false;
            } else if (this.hasDestMgrId() && this.getDestMgrId() != other.getDestMgrId()) {
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
            if (this.hasSourceServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSourceServerId();
            }

            if (this.hasSourceMgrId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSourceMgrId();
            }

            if (this.hasDestServerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDestServerId();
            }

            if (this.hasDestMgrId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDestMgrId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CrossMsg parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CrossMsg)PARSER.parseFrom(data);
      }

      public static S2C_CrossMsg parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CrossMsg)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CrossMsg parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CrossMsg)PARSER.parseFrom(data);
      }

      public static S2C_CrossMsg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CrossMsg)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CrossMsg parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CrossMsg)PARSER.parseFrom(data);
      }

      public static S2C_CrossMsg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CrossMsg)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CrossMsg parseFrom(InputStream input) throws IOException {
         return (S2C_CrossMsg)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CrossMsg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CrossMsg)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CrossMsg parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CrossMsg)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CrossMsg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CrossMsg)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CrossMsg parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CrossMsg)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CrossMsg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CrossMsg)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CrossMsg prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CrossMsg getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CrossMsg> parser() {
         return PARSER;
      }

      public Parser<S2C_CrossMsg> getParserForType() {
         return PARSER;
      }

      public S2C_CrossMsg getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CrossMsgOrBuilder {
         private int bitField0_;
         private int sourceServerId_;
         private int sourceMgrId_;
         private int destServerId_;
         private int destMgrId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_CrossMsg_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_CrossMsg_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CrossMsg.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LoginMsg.S2C_CrossMsg.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.sourceServerId_ = 0;
            this.bitField0_ &= -2;
            this.sourceMgrId_ = 0;
            this.bitField0_ &= -3;
            this.destServerId_ = 0;
            this.bitField0_ &= -5;
            this.destMgrId_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_CrossMsg_descriptor;
         }

         public S2C_CrossMsg getDefaultInstanceForType() {
            return LoginMsg.S2C_CrossMsg.getDefaultInstance();
         }

         public S2C_CrossMsg build() {
            S2C_CrossMsg result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CrossMsg buildPartial() {
            S2C_CrossMsg result = new S2C_CrossMsg(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.sourceServerId_ = this.sourceServerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.sourceMgrId_ = this.sourceMgrId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.destServerId_ = this.destServerId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.destMgrId_ = this.destMgrId_;
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
            if (other instanceof S2C_CrossMsg) {
               return this.mergeFrom((S2C_CrossMsg)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CrossMsg other) {
            if (other == LoginMsg.S2C_CrossMsg.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSourceServerId()) {
                  this.setSourceServerId(other.getSourceServerId());
               }

               if (other.hasSourceMgrId()) {
                  this.setSourceMgrId(other.getSourceMgrId());
               }

               if (other.hasDestServerId()) {
                  this.setDestServerId(other.getDestServerId());
               }

               if (other.hasDestMgrId()) {
                  this.setDestMgrId(other.getDestMgrId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSourceServerId()) {
               return false;
            } else if (!this.hasSourceMgrId()) {
               return false;
            } else if (!this.hasDestServerId()) {
               return false;
            } else {
               return this.hasDestMgrId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CrossMsg parsedMessage = null;

            try {
               parsedMessage = (S2C_CrossMsg)LoginMsg.S2C_CrossMsg.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CrossMsg)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSourceServerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSourceServerId() {
            return this.sourceServerId_;
         }

         public Builder setSourceServerId(int value) {
            this.bitField0_ |= 1;
            this.sourceServerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSourceServerId() {
            this.bitField0_ &= -2;
            this.sourceServerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSourceMgrId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSourceMgrId() {
            return this.sourceMgrId_;
         }

         public Builder setSourceMgrId(int value) {
            this.bitField0_ |= 2;
            this.sourceMgrId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSourceMgrId() {
            this.bitField0_ &= -3;
            this.sourceMgrId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDestServerId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getDestServerId() {
            return this.destServerId_;
         }

         public Builder setDestServerId(int value) {
            this.bitField0_ |= 4;
            this.destServerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestServerId() {
            this.bitField0_ &= -5;
            this.destServerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDestMgrId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDestMgrId() {
            return this.destMgrId_;
         }

         public Builder setDestMgrId(int value) {
            this.bitField0_ |= 8;
            this.destMgrId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDestMgrId() {
            this.bitField0_ &= -9;
            this.destMgrId_ = 0;
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

   public static final class C2S_FilterRecommend_1007 extends GeneratedMessageV3 implements C2S_FilterRecommend_1007OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECOMMENDCODE_FIELD_NUMBER = 1;
      private int recommendCode_;
      private byte memoizedIsInitialized;
      private static final C2S_FilterRecommend_1007 DEFAULT_INSTANCE = new C2S_FilterRecommend_1007();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FilterRecommend_1007> PARSER = new AbstractParser<C2S_FilterRecommend_1007>() {
         public C2S_FilterRecommend_1007 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FilterRecommend_1007(input, extensionRegistry);
         }
      };

      private C2S_FilterRecommend_1007(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FilterRecommend_1007() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FilterRecommend_1007();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FilterRecommend_1007(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.recommendCode_ = input.readInt32();
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
         return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_FilterRecommend_1007_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_FilterRecommend_1007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FilterRecommend_1007.class, Builder.class);
      }

      public boolean hasRecommendCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecommendCode() {
         return this.recommendCode_;
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
            output.writeInt32(1, this.recommendCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.recommendCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FilterRecommend_1007)) {
            return super.equals(obj);
         } else {
            C2S_FilterRecommend_1007 other = (C2S_FilterRecommend_1007)obj;
            if (this.hasRecommendCode() != other.hasRecommendCode()) {
               return false;
            } else if (this.hasRecommendCode() && this.getRecommendCode() != other.getRecommendCode()) {
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
            if (this.hasRecommendCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecommendCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FilterRecommend_1007 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FilterRecommend_1007)PARSER.parseFrom(data);
      }

      public static C2S_FilterRecommend_1007 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FilterRecommend_1007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FilterRecommend_1007 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FilterRecommend_1007)PARSER.parseFrom(data);
      }

      public static C2S_FilterRecommend_1007 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FilterRecommend_1007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FilterRecommend_1007 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FilterRecommend_1007)PARSER.parseFrom(data);
      }

      public static C2S_FilterRecommend_1007 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FilterRecommend_1007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FilterRecommend_1007 parseFrom(InputStream input) throws IOException {
         return (C2S_FilterRecommend_1007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FilterRecommend_1007 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FilterRecommend_1007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FilterRecommend_1007 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FilterRecommend_1007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FilterRecommend_1007 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FilterRecommend_1007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FilterRecommend_1007 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FilterRecommend_1007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FilterRecommend_1007 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FilterRecommend_1007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FilterRecommend_1007 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FilterRecommend_1007 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FilterRecommend_1007> parser() {
         return PARSER;
      }

      public Parser<C2S_FilterRecommend_1007> getParserForType() {
         return PARSER;
      }

      public C2S_FilterRecommend_1007 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FilterRecommend_1007OrBuilder {
         private int bitField0_;
         private int recommendCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_FilterRecommend_1007_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_FilterRecommend_1007_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FilterRecommend_1007.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LoginMsg.C2S_FilterRecommend_1007.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recommendCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_C2S_FilterRecommend_1007_descriptor;
         }

         public C2S_FilterRecommend_1007 getDefaultInstanceForType() {
            return LoginMsg.C2S_FilterRecommend_1007.getDefaultInstance();
         }

         public C2S_FilterRecommend_1007 build() {
            C2S_FilterRecommend_1007 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FilterRecommend_1007 buildPartial() {
            C2S_FilterRecommend_1007 result = new C2S_FilterRecommend_1007(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recommendCode_ = this.recommendCode_;
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
            if (other instanceof C2S_FilterRecommend_1007) {
               return this.mergeFrom((C2S_FilterRecommend_1007)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FilterRecommend_1007 other) {
            if (other == LoginMsg.C2S_FilterRecommend_1007.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecommendCode()) {
                  this.setRecommendCode(other.getRecommendCode());
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
            C2S_FilterRecommend_1007 parsedMessage = null;

            try {
               parsedMessage = (C2S_FilterRecommend_1007)LoginMsg.C2S_FilterRecommend_1007.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FilterRecommend_1007)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRecommendCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRecommendCode() {
            return this.recommendCode_;
         }

         public Builder setRecommendCode(int value) {
            this.bitField0_ |= 1;
            this.recommendCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecommendCode() {
            this.bitField0_ &= -2;
            this.recommendCode_ = 0;
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

   public static final class S2C_FilterRecommend_1008 extends GeneratedMessageV3 implements S2C_FilterRecommend_1008OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_FilterRecommend_1008 DEFAULT_INSTANCE = new S2C_FilterRecommend_1008();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FilterRecommend_1008> PARSER = new AbstractParser<S2C_FilterRecommend_1008>() {
         public S2C_FilterRecommend_1008 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FilterRecommend_1008(input, extensionRegistry);
         }
      };

      private S2C_FilterRecommend_1008(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FilterRecommend_1008() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FilterRecommend_1008();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FilterRecommend_1008(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_FilterRecommend_1008_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_FilterRecommend_1008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FilterRecommend_1008.class, Builder.class);
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
         } else if (!(obj instanceof S2C_FilterRecommend_1008)) {
            return super.equals(obj);
         } else {
            S2C_FilterRecommend_1008 other = (S2C_FilterRecommend_1008)obj;
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

      public static S2C_FilterRecommend_1008 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FilterRecommend_1008)PARSER.parseFrom(data);
      }

      public static S2C_FilterRecommend_1008 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FilterRecommend_1008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FilterRecommend_1008 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FilterRecommend_1008)PARSER.parseFrom(data);
      }

      public static S2C_FilterRecommend_1008 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FilterRecommend_1008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FilterRecommend_1008 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FilterRecommend_1008)PARSER.parseFrom(data);
      }

      public static S2C_FilterRecommend_1008 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FilterRecommend_1008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FilterRecommend_1008 parseFrom(InputStream input) throws IOException {
         return (S2C_FilterRecommend_1008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FilterRecommend_1008 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FilterRecommend_1008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FilterRecommend_1008 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FilterRecommend_1008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FilterRecommend_1008 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FilterRecommend_1008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FilterRecommend_1008 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FilterRecommend_1008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FilterRecommend_1008 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FilterRecommend_1008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FilterRecommend_1008 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FilterRecommend_1008 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FilterRecommend_1008> parser() {
         return PARSER;
      }

      public Parser<S2C_FilterRecommend_1008> getParserForType() {
         return PARSER;
      }

      public S2C_FilterRecommend_1008 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FilterRecommend_1008OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_FilterRecommend_1008_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_FilterRecommend_1008_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FilterRecommend_1008.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (LoginMsg.S2C_FilterRecommend_1008.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return LoginMsg.internal_static_login_com_gzbz_protobuf_S2C_FilterRecommend_1008_descriptor;
         }

         public S2C_FilterRecommend_1008 getDefaultInstanceForType() {
            return LoginMsg.S2C_FilterRecommend_1008.getDefaultInstance();
         }

         public S2C_FilterRecommend_1008 build() {
            S2C_FilterRecommend_1008 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FilterRecommend_1008 buildPartial() {
            S2C_FilterRecommend_1008 result = new S2C_FilterRecommend_1008(this);
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
            if (other instanceof S2C_FilterRecommend_1008) {
               return this.mergeFrom((S2C_FilterRecommend_1008)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FilterRecommend_1008 other) {
            if (other == LoginMsg.S2C_FilterRecommend_1008.getDefaultInstance()) {
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
            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FilterRecommend_1008 parsedMessage = null;

            try {
               parsedMessage = (S2C_FilterRecommend_1008)LoginMsg.S2C_FilterRecommend_1008.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FilterRecommend_1008)e.getUnfinishedMessage();
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

   public interface C2S_CreateRole_1002OrBuilder extends MessageOrBuilder {
      boolean hasSex();

      int getSex();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasRecommendCode();

      int getRecommendCode();
   }

   public interface C2S_FilterRecommend_1007OrBuilder extends MessageOrBuilder {
      boolean hasRecommendCode();

      int getRecommendCode();
   }

   public interface C2S_Login_1000OrBuilder extends MessageOrBuilder {
      boolean hasAccount();

      String getAccount();

      ByteString getAccountBytes();

      boolean hasPasswad();

      String getPasswad();

      ByteString getPasswadBytes();

      boolean hasServerId();

      int getServerId();

      boolean hasSign();

      String getSign();

      ByteString getSignBytes();

      boolean hasChannelId();

      String getChannelId();

      ByteString getChannelIdBytes();

      boolean hasNetInfo();

      String getNetInfo();

      ByteString getNetInfoBytes();

      boolean hasGroupId();

      String getGroupId();

      ByteString getGroupIdBytes();

      boolean hasDevUID();

      String getDevUID();

      ByteString getDevUIDBytes();

      boolean hasDevName();

      String getDevName();

      ByteString getDevNameBytes();

      boolean hasDevOsVer();

      String getDevOsVer();

      ByteString getDevOsVerBytes();

      boolean hasDevRes();

      String getDevRes();

      ByteString getDevResBytes();

      boolean hasNetOper();

      String getNetOper();

      ByteString getNetOperBytes();

      boolean hasVersion();

      String getVersion();

      ByteString getVersionBytes();

      boolean hasAge();

      int getAge();

      boolean hasIsGuest();

      boolean getIsGuest();

      boolean hasAccountName();

      String getAccountName();

      ByteString getAccountNameBytes();

      boolean hasAccountType();

      int getAccountType();

      boolean hasLoginTime();

      int getLoginTime();
   }

   public interface C2S_ReconnectKey_1006OrBuilder extends MessageOrBuilder {
      boolean hasKey();

      String getKey();

      ByteString getKeyBytes();
   }

   public interface S2C_CreateRoleResult_1003OrBuilder extends MessageOrBuilder {
      boolean hasError();

      ErrorCode getError();
   }

   public interface S2C_CrossMsgOrBuilder extends MessageOrBuilder {
      boolean hasSourceServerId();

      int getSourceServerId();

      boolean hasSourceMgrId();

      int getSourceMgrId();

      boolean hasDestServerId();

      int getDestServerId();

      boolean hasDestMgrId();

      int getDestMgrId();
   }

   public interface S2C_FilterRecommend_1008OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_LoginResult_1001OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      resultType getResult();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasIsReconnect();

      int getIsReconnect();

      boolean hasArea();

      String getArea();

      ByteString getAreaBytes();

      boolean hasLv();

      int getLv();
   }

   public interface S2C_ReconnectKey_1005OrBuilder extends MessageOrBuilder {
      boolean hasKey();

      String getKey();

      ByteString getKeyBytes();
   }

   public interface S2C_Respond_1004OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }
}
