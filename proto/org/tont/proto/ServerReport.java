// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: serverReport.proto

package org.tont.proto;

public final class ServerReport {
  private ServerReport() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ServerReportEntityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ServerReportEntity)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 cpuCount = 1;</code>
     */
    int getCpuCount();

    /**
     * <code>optional int32 cpuRatio = 2;</code>
     */
    int getCpuRatio();

    /**
     * <code>optional int64 memoryFree = 3;</code>
     */
    long getMemoryFree();

    /**
     * <code>optional int64 memoryTotal = 4;</code>
     */
    long getMemoryTotal();

    /**
     * <code>optional string osName = 5;</code>
     */
    java.lang.String getOsName();
    /**
     * <code>optional string osName = 5;</code>
     */
    com.google.protobuf.ByteString
        getOsNameBytes();

    /**
     * <code>optional string ipAddr = 6;</code>
     */
    java.lang.String getIpAddr();
    /**
     * <code>optional string ipAddr = 6;</code>
     */
    com.google.protobuf.ByteString
        getIpAddrBytes();

    /**
     * <code>optional string javaVersion = 7;</code>
     */
    java.lang.String getJavaVersion();
    /**
     * <code>optional string javaVersion = 7;</code>
     */
    com.google.protobuf.ByteString
        getJavaVersionBytes();

    /**
     * <code>optional int64 startTime = 8;</code>
     */
    long getStartTime();

    /**
     * <code>optional int64 handleTotalNum = 9;</code>
     */
    long getHandleTotalNum();

    /**
     * <code>optional int64 handleSpeedNow = 10;</code>
     */
    long getHandleSpeedNow();

    /**
     * <code>optional int64 loginNum = 11;</code>
     */
    long getLoginNum();

    /**
     * <code>optional int64 updateTime = 18;</code>
     */
    long getUpdateTime();
  }
  /**
   * Protobuf type {@code proto.ServerReportEntity}
   *
   * <pre>
   * [START messages code 100]
   * </pre>
   */
  public  static final class ServerReportEntity extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:proto.ServerReportEntity)
      ServerReportEntityOrBuilder {
    // Use ServerReportEntity.newBuilder() to construct.
    private ServerReportEntity(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ServerReportEntity() {
      cpuCount_ = 0;
      cpuRatio_ = 0;
      memoryFree_ = 0L;
      memoryTotal_ = 0L;
      osName_ = "";
      ipAddr_ = "";
      javaVersion_ = "";
      startTime_ = 0L;
      handleTotalNum_ = 0L;
      handleSpeedNow_ = 0L;
      loginNum_ = 0L;
      updateTime_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ServerReportEntity(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              cpuCount_ = input.readInt32();
              break;
            }
            case 16: {

              cpuRatio_ = input.readInt32();
              break;
            }
            case 24: {

              memoryFree_ = input.readInt64();
              break;
            }
            case 32: {

              memoryTotal_ = input.readInt64();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              osName_ = s;
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              ipAddr_ = s;
              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              javaVersion_ = s;
              break;
            }
            case 64: {

              startTime_ = input.readInt64();
              break;
            }
            case 72: {

              handleTotalNum_ = input.readInt64();
              break;
            }
            case 80: {

              handleSpeedNow_ = input.readInt64();
              break;
            }
            case 88: {

              loginNum_ = input.readInt64();
              break;
            }
            case 144: {

              updateTime_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tont.proto.ServerReport.internal_static_proto_ServerReportEntity_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tont.proto.ServerReport.internal_static_proto_ServerReportEntity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tont.proto.ServerReport.ServerReportEntity.class, org.tont.proto.ServerReport.ServerReportEntity.Builder.class);
    }

    public static final int CPUCOUNT_FIELD_NUMBER = 1;
    private int cpuCount_;
    /**
     * <code>optional int32 cpuCount = 1;</code>
     */
    public int getCpuCount() {
      return cpuCount_;
    }

    public static final int CPURATIO_FIELD_NUMBER = 2;
    private int cpuRatio_;
    /**
     * <code>optional int32 cpuRatio = 2;</code>
     */
    public int getCpuRatio() {
      return cpuRatio_;
    }

    public static final int MEMORYFREE_FIELD_NUMBER = 3;
    private long memoryFree_;
    /**
     * <code>optional int64 memoryFree = 3;</code>
     */
    public long getMemoryFree() {
      return memoryFree_;
    }

    public static final int MEMORYTOTAL_FIELD_NUMBER = 4;
    private long memoryTotal_;
    /**
     * <code>optional int64 memoryTotal = 4;</code>
     */
    public long getMemoryTotal() {
      return memoryTotal_;
    }

    public static final int OSNAME_FIELD_NUMBER = 5;
    private volatile java.lang.Object osName_;
    /**
     * <code>optional string osName = 5;</code>
     */
    public java.lang.String getOsName() {
      java.lang.Object ref = osName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        osName_ = s;
        return s;
      }
    }
    /**
     * <code>optional string osName = 5;</code>
     */
    public com.google.protobuf.ByteString
        getOsNameBytes() {
      java.lang.Object ref = osName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        osName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IPADDR_FIELD_NUMBER = 6;
    private volatile java.lang.Object ipAddr_;
    /**
     * <code>optional string ipAddr = 6;</code>
     */
    public java.lang.String getIpAddr() {
      java.lang.Object ref = ipAddr_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAddr_ = s;
        return s;
      }
    }
    /**
     * <code>optional string ipAddr = 6;</code>
     */
    public com.google.protobuf.ByteString
        getIpAddrBytes() {
      java.lang.Object ref = ipAddr_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int JAVAVERSION_FIELD_NUMBER = 7;
    private volatile java.lang.Object javaVersion_;
    /**
     * <code>optional string javaVersion = 7;</code>
     */
    public java.lang.String getJavaVersion() {
      java.lang.Object ref = javaVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        javaVersion_ = s;
        return s;
      }
    }
    /**
     * <code>optional string javaVersion = 7;</code>
     */
    public com.google.protobuf.ByteString
        getJavaVersionBytes() {
      java.lang.Object ref = javaVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        javaVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STARTTIME_FIELD_NUMBER = 8;
    private long startTime_;
    /**
     * <code>optional int64 startTime = 8;</code>
     */
    public long getStartTime() {
      return startTime_;
    }

    public static final int HANDLETOTALNUM_FIELD_NUMBER = 9;
    private long handleTotalNum_;
    /**
     * <code>optional int64 handleTotalNum = 9;</code>
     */
    public long getHandleTotalNum() {
      return handleTotalNum_;
    }

    public static final int HANDLESPEEDNOW_FIELD_NUMBER = 10;
    private long handleSpeedNow_;
    /**
     * <code>optional int64 handleSpeedNow = 10;</code>
     */
    public long getHandleSpeedNow() {
      return handleSpeedNow_;
    }

    public static final int LOGINNUM_FIELD_NUMBER = 11;
    private long loginNum_;
    /**
     * <code>optional int64 loginNum = 11;</code>
     */
    public long getLoginNum() {
      return loginNum_;
    }

    public static final int UPDATETIME_FIELD_NUMBER = 18;
    private long updateTime_;
    /**
     * <code>optional int64 updateTime = 18;</code>
     */
    public long getUpdateTime() {
      return updateTime_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (cpuCount_ != 0) {
        output.writeInt32(1, cpuCount_);
      }
      if (cpuRatio_ != 0) {
        output.writeInt32(2, cpuRatio_);
      }
      if (memoryFree_ != 0L) {
        output.writeInt64(3, memoryFree_);
      }
      if (memoryTotal_ != 0L) {
        output.writeInt64(4, memoryTotal_);
      }
      if (!getOsNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 5, osName_);
      }
      if (!getIpAddrBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 6, ipAddr_);
      }
      if (!getJavaVersionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 7, javaVersion_);
      }
      if (startTime_ != 0L) {
        output.writeInt64(8, startTime_);
      }
      if (handleTotalNum_ != 0L) {
        output.writeInt64(9, handleTotalNum_);
      }
      if (handleSpeedNow_ != 0L) {
        output.writeInt64(10, handleSpeedNow_);
      }
      if (loginNum_ != 0L) {
        output.writeInt64(11, loginNum_);
      }
      if (updateTime_ != 0L) {
        output.writeInt64(18, updateTime_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cpuCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, cpuCount_);
      }
      if (cpuRatio_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, cpuRatio_);
      }
      if (memoryFree_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, memoryFree_);
      }
      if (memoryTotal_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, memoryTotal_);
      }
      if (!getOsNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(5, osName_);
      }
      if (!getIpAddrBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(6, ipAddr_);
      }
      if (!getJavaVersionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(7, javaVersion_);
      }
      if (startTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(8, startTime_);
      }
      if (handleTotalNum_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(9, handleTotalNum_);
      }
      if (handleSpeedNow_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(10, handleSpeedNow_);
      }
      if (loginNum_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(11, loginNum_);
      }
      if (updateTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(18, updateTime_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static org.tont.proto.ServerReport.ServerReportEntity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tont.proto.ServerReport.ServerReportEntity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tont.proto.ServerReport.ServerReportEntity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.tont.proto.ServerReport.ServerReportEntity parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.tont.proto.ServerReport.ServerReportEntity parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.tont.proto.ServerReport.ServerReportEntity parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.tont.proto.ServerReport.ServerReportEntity parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.tont.proto.ServerReport.ServerReportEntity parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.tont.proto.ServerReport.ServerReportEntity parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.tont.proto.ServerReport.ServerReportEntity parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.tont.proto.ServerReport.ServerReportEntity prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code proto.ServerReportEntity}
     *
     * <pre>
     * [START messages code 100]
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ServerReportEntity)
        org.tont.proto.ServerReport.ServerReportEntityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.tont.proto.ServerReport.internal_static_proto_ServerReportEntity_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.tont.proto.ServerReport.internal_static_proto_ServerReportEntity_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.tont.proto.ServerReport.ServerReportEntity.class, org.tont.proto.ServerReport.ServerReportEntity.Builder.class);
      }

      // Construct using org.tont.proto.ServerReport.ServerReportEntity.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        cpuCount_ = 0;

        cpuRatio_ = 0;

        memoryFree_ = 0L;

        memoryTotal_ = 0L;

        osName_ = "";

        ipAddr_ = "";

        javaVersion_ = "";

        startTime_ = 0L;

        handleTotalNum_ = 0L;

        handleSpeedNow_ = 0L;

        loginNum_ = 0L;

        updateTime_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.tont.proto.ServerReport.internal_static_proto_ServerReportEntity_descriptor;
      }

      public org.tont.proto.ServerReport.ServerReportEntity getDefaultInstanceForType() {
        return org.tont.proto.ServerReport.ServerReportEntity.getDefaultInstance();
      }

      public org.tont.proto.ServerReport.ServerReportEntity build() {
        org.tont.proto.ServerReport.ServerReportEntity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.tont.proto.ServerReport.ServerReportEntity buildPartial() {
        org.tont.proto.ServerReport.ServerReportEntity result = new org.tont.proto.ServerReport.ServerReportEntity(this);
        result.cpuCount_ = cpuCount_;
        result.cpuRatio_ = cpuRatio_;
        result.memoryFree_ = memoryFree_;
        result.memoryTotal_ = memoryTotal_;
        result.osName_ = osName_;
        result.ipAddr_ = ipAddr_;
        result.javaVersion_ = javaVersion_;
        result.startTime_ = startTime_;
        result.handleTotalNum_ = handleTotalNum_;
        result.handleSpeedNow_ = handleSpeedNow_;
        result.loginNum_ = loginNum_;
        result.updateTime_ = updateTime_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.tont.proto.ServerReport.ServerReportEntity) {
          return mergeFrom((org.tont.proto.ServerReport.ServerReportEntity)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.tont.proto.ServerReport.ServerReportEntity other) {
        if (other == org.tont.proto.ServerReport.ServerReportEntity.getDefaultInstance()) return this;
        if (other.getCpuCount() != 0) {
          setCpuCount(other.getCpuCount());
        }
        if (other.getCpuRatio() != 0) {
          setCpuRatio(other.getCpuRatio());
        }
        if (other.getMemoryFree() != 0L) {
          setMemoryFree(other.getMemoryFree());
        }
        if (other.getMemoryTotal() != 0L) {
          setMemoryTotal(other.getMemoryTotal());
        }
        if (!other.getOsName().isEmpty()) {
          osName_ = other.osName_;
          onChanged();
        }
        if (!other.getIpAddr().isEmpty()) {
          ipAddr_ = other.ipAddr_;
          onChanged();
        }
        if (!other.getJavaVersion().isEmpty()) {
          javaVersion_ = other.javaVersion_;
          onChanged();
        }
        if (other.getStartTime() != 0L) {
          setStartTime(other.getStartTime());
        }
        if (other.getHandleTotalNum() != 0L) {
          setHandleTotalNum(other.getHandleTotalNum());
        }
        if (other.getHandleSpeedNow() != 0L) {
          setHandleSpeedNow(other.getHandleSpeedNow());
        }
        if (other.getLoginNum() != 0L) {
          setLoginNum(other.getLoginNum());
        }
        if (other.getUpdateTime() != 0L) {
          setUpdateTime(other.getUpdateTime());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.tont.proto.ServerReport.ServerReportEntity parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.tont.proto.ServerReport.ServerReportEntity) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cpuCount_ ;
      /**
       * <code>optional int32 cpuCount = 1;</code>
       */
      public int getCpuCount() {
        return cpuCount_;
      }
      /**
       * <code>optional int32 cpuCount = 1;</code>
       */
      public Builder setCpuCount(int value) {
        
        cpuCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 cpuCount = 1;</code>
       */
      public Builder clearCpuCount() {
        
        cpuCount_ = 0;
        onChanged();
        return this;
      }

      private int cpuRatio_ ;
      /**
       * <code>optional int32 cpuRatio = 2;</code>
       */
      public int getCpuRatio() {
        return cpuRatio_;
      }
      /**
       * <code>optional int32 cpuRatio = 2;</code>
       */
      public Builder setCpuRatio(int value) {
        
        cpuRatio_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 cpuRatio = 2;</code>
       */
      public Builder clearCpuRatio() {
        
        cpuRatio_ = 0;
        onChanged();
        return this;
      }

      private long memoryFree_ ;
      /**
       * <code>optional int64 memoryFree = 3;</code>
       */
      public long getMemoryFree() {
        return memoryFree_;
      }
      /**
       * <code>optional int64 memoryFree = 3;</code>
       */
      public Builder setMemoryFree(long value) {
        
        memoryFree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 memoryFree = 3;</code>
       */
      public Builder clearMemoryFree() {
        
        memoryFree_ = 0L;
        onChanged();
        return this;
      }

      private long memoryTotal_ ;
      /**
       * <code>optional int64 memoryTotal = 4;</code>
       */
      public long getMemoryTotal() {
        return memoryTotal_;
      }
      /**
       * <code>optional int64 memoryTotal = 4;</code>
       */
      public Builder setMemoryTotal(long value) {
        
        memoryTotal_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 memoryTotal = 4;</code>
       */
      public Builder clearMemoryTotal() {
        
        memoryTotal_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object osName_ = "";
      /**
       * <code>optional string osName = 5;</code>
       */
      public java.lang.String getOsName() {
        java.lang.Object ref = osName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          osName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string osName = 5;</code>
       */
      public com.google.protobuf.ByteString
          getOsNameBytes() {
        java.lang.Object ref = osName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          osName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string osName = 5;</code>
       */
      public Builder setOsName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        osName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string osName = 5;</code>
       */
      public Builder clearOsName() {
        
        osName_ = getDefaultInstance().getOsName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string osName = 5;</code>
       */
      public Builder setOsNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        osName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object ipAddr_ = "";
      /**
       * <code>optional string ipAddr = 6;</code>
       */
      public java.lang.String getIpAddr() {
        java.lang.Object ref = ipAddr_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          ipAddr_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string ipAddr = 6;</code>
       */
      public com.google.protobuf.ByteString
          getIpAddrBytes() {
        java.lang.Object ref = ipAddr_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ipAddr_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string ipAddr = 6;</code>
       */
      public Builder setIpAddr(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        ipAddr_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string ipAddr = 6;</code>
       */
      public Builder clearIpAddr() {
        
        ipAddr_ = getDefaultInstance().getIpAddr();
        onChanged();
        return this;
      }
      /**
       * <code>optional string ipAddr = 6;</code>
       */
      public Builder setIpAddrBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        ipAddr_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object javaVersion_ = "";
      /**
       * <code>optional string javaVersion = 7;</code>
       */
      public java.lang.String getJavaVersion() {
        java.lang.Object ref = javaVersion_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          javaVersion_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string javaVersion = 7;</code>
       */
      public com.google.protobuf.ByteString
          getJavaVersionBytes() {
        java.lang.Object ref = javaVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          javaVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string javaVersion = 7;</code>
       */
      public Builder setJavaVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        javaVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string javaVersion = 7;</code>
       */
      public Builder clearJavaVersion() {
        
        javaVersion_ = getDefaultInstance().getJavaVersion();
        onChanged();
        return this;
      }
      /**
       * <code>optional string javaVersion = 7;</code>
       */
      public Builder setJavaVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        javaVersion_ = value;
        onChanged();
        return this;
      }

      private long startTime_ ;
      /**
       * <code>optional int64 startTime = 8;</code>
       */
      public long getStartTime() {
        return startTime_;
      }
      /**
       * <code>optional int64 startTime = 8;</code>
       */
      public Builder setStartTime(long value) {
        
        startTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 startTime = 8;</code>
       */
      public Builder clearStartTime() {
        
        startTime_ = 0L;
        onChanged();
        return this;
      }

      private long handleTotalNum_ ;
      /**
       * <code>optional int64 handleTotalNum = 9;</code>
       */
      public long getHandleTotalNum() {
        return handleTotalNum_;
      }
      /**
       * <code>optional int64 handleTotalNum = 9;</code>
       */
      public Builder setHandleTotalNum(long value) {
        
        handleTotalNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 handleTotalNum = 9;</code>
       */
      public Builder clearHandleTotalNum() {
        
        handleTotalNum_ = 0L;
        onChanged();
        return this;
      }

      private long handleSpeedNow_ ;
      /**
       * <code>optional int64 handleSpeedNow = 10;</code>
       */
      public long getHandleSpeedNow() {
        return handleSpeedNow_;
      }
      /**
       * <code>optional int64 handleSpeedNow = 10;</code>
       */
      public Builder setHandleSpeedNow(long value) {
        
        handleSpeedNow_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 handleSpeedNow = 10;</code>
       */
      public Builder clearHandleSpeedNow() {
        
        handleSpeedNow_ = 0L;
        onChanged();
        return this;
      }

      private long loginNum_ ;
      /**
       * <code>optional int64 loginNum = 11;</code>
       */
      public long getLoginNum() {
        return loginNum_;
      }
      /**
       * <code>optional int64 loginNum = 11;</code>
       */
      public Builder setLoginNum(long value) {
        
        loginNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 loginNum = 11;</code>
       */
      public Builder clearLoginNum() {
        
        loginNum_ = 0L;
        onChanged();
        return this;
      }

      private long updateTime_ ;
      /**
       * <code>optional int64 updateTime = 18;</code>
       */
      public long getUpdateTime() {
        return updateTime_;
      }
      /**
       * <code>optional int64 updateTime = 18;</code>
       */
      public Builder setUpdateTime(long value) {
        
        updateTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 updateTime = 18;</code>
       */
      public Builder clearUpdateTime() {
        
        updateTime_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:proto.ServerReportEntity)
    }

    // @@protoc_insertion_point(class_scope:proto.ServerReportEntity)
    private static final org.tont.proto.ServerReport.ServerReportEntity DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.tont.proto.ServerReport.ServerReportEntity();
    }

    public static org.tont.proto.ServerReport.ServerReportEntity getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerReportEntity>
        PARSER = new com.google.protobuf.AbstractParser<ServerReportEntity>() {
      public ServerReportEntity parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new ServerReportEntity(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<ServerReportEntity> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerReportEntity> getParserForType() {
      return PARSER;
    }

    public org.tont.proto.ServerReport.ServerReportEntity getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ServerReportEntity_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_ServerReportEntity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022serverReport.proto\022\005proto\"\377\001\n\022ServerRe" +
      "portEntity\022\020\n\010cpuCount\030\001 \001(\005\022\020\n\010cpuRatio" +
      "\030\002 \001(\005\022\022\n\nmemoryFree\030\003 \001(\003\022\023\n\013memoryTota" +
      "l\030\004 \001(\003\022\016\n\006osName\030\005 \001(\t\022\016\n\006ipAddr\030\006 \001(\t\022" +
      "\023\n\013javaVersion\030\007 \001(\t\022\021\n\tstartTime\030\010 \001(\003\022" +
      "\026\n\016handleTotalNum\030\t \001(\003\022\026\n\016handleSpeedNo" +
      "w\030\n \001(\003\022\020\n\010loginNum\030\013 \001(\003\022\022\n\nupdateTime\030" +
      "\022 \001(\003BB\n\016org.tont.protoB\014ServerReport\252\002!" +
      "Google.Protobuf.ToNT.ServerReportb\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_proto_ServerReportEntity_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_ServerReportEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_proto_ServerReportEntity_descriptor,
        new java.lang.String[] { "CpuCount", "CpuRatio", "MemoryFree", "MemoryTotal", "OsName", "IpAddr", "JavaVersion", "StartTime", "HandleTotalNum", "HandleSpeedNow", "LoginNum", "UpdateTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
