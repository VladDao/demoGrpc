// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/audit/audit_log.proto

package com.google.cloud.audit;

/**
 * <pre>
 * Metadata about the request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.audit.RequestMetadata}
 */
public final class RequestMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.audit.RequestMetadata)
    RequestMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestMetadata.newBuilder() to construct.
  private RequestMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestMetadata() {
    callerIp_ = "";
    callerSuppliedUserAgent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RequestMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RequestMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            callerIp_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            callerSuppliedUserAgent_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.audit.AuditLogProto.internal_static_google_cloud_audit_RequestMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.audit.AuditLogProto.internal_static_google_cloud_audit_RequestMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.audit.RequestMetadata.class, com.google.cloud.audit.RequestMetadata.Builder.class);
  }

  public static final int CALLER_IP_FIELD_NUMBER = 1;
  private volatile java.lang.Object callerIp_;
  /**
   * <pre>
   * The IP address of the caller.
   * </pre>
   *
   * <code>string caller_ip = 1;</code>
   * @return The callerIp.
   */
  @java.lang.Override
  public java.lang.String getCallerIp() {
    java.lang.Object ref = callerIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      callerIp_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The IP address of the caller.
   * </pre>
   *
   * <code>string caller_ip = 1;</code>
   * @return The bytes for callerIp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCallerIpBytes() {
    java.lang.Object ref = callerIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      callerIp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object callerSuppliedUserAgent_;
  /**
   * <pre>
   * The user agent of the caller.
   * This information is not authenticated and should be treated accordingly.
   * For example:
   * +   `google-api-python-client/1.4.0`:
   *     The request was made by the Google API client for Python.
   * +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:
   *     The request was made by the Google Cloud SDK CLI (gcloud).
   * +   `AppEngine-Google; (+http://code.google.com/appengine; appid:
   * s~my-project`:
   *     The request was made from the `my-project` App Engine app.
   * </pre>
   *
   * <code>string caller_supplied_user_agent = 2;</code>
   * @return The callerSuppliedUserAgent.
   */
  @java.lang.Override
  public java.lang.String getCallerSuppliedUserAgent() {
    java.lang.Object ref = callerSuppliedUserAgent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      callerSuppliedUserAgent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The user agent of the caller.
   * This information is not authenticated and should be treated accordingly.
   * For example:
   * +   `google-api-python-client/1.4.0`:
   *     The request was made by the Google API client for Python.
   * +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:
   *     The request was made by the Google Cloud SDK CLI (gcloud).
   * +   `AppEngine-Google; (+http://code.google.com/appengine; appid:
   * s~my-project`:
   *     The request was made from the `my-project` App Engine app.
   * </pre>
   *
   * <code>string caller_supplied_user_agent = 2;</code>
   * @return The bytes for callerSuppliedUserAgent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCallerSuppliedUserAgentBytes() {
    java.lang.Object ref = callerSuppliedUserAgent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      callerSuppliedUserAgent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getCallerIpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, callerIp_);
    }
    if (!getCallerSuppliedUserAgentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, callerSuppliedUserAgent_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCallerIpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, callerIp_);
    }
    if (!getCallerSuppliedUserAgentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, callerSuppliedUserAgent_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.audit.RequestMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.audit.RequestMetadata other = (com.google.cloud.audit.RequestMetadata) obj;

    if (!getCallerIp()
        .equals(other.getCallerIp())) return false;
    if (!getCallerSuppliedUserAgent()
        .equals(other.getCallerSuppliedUserAgent())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CALLER_IP_FIELD_NUMBER;
    hash = (53 * hash) + getCallerIp().hashCode();
    hash = (37 * hash) + CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER;
    hash = (53 * hash) + getCallerSuppliedUserAgent().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.audit.RequestMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.audit.RequestMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.audit.RequestMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.audit.RequestMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.audit.RequestMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.audit.RequestMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.audit.RequestMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.audit.RequestMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.audit.RequestMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.audit.RequestMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.audit.RequestMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.audit.RequestMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.audit.RequestMetadata prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Metadata about the request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.audit.RequestMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.audit.RequestMetadata)
      com.google.cloud.audit.RequestMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.audit.AuditLogProto.internal_static_google_cloud_audit_RequestMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.audit.AuditLogProto.internal_static_google_cloud_audit_RequestMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.audit.RequestMetadata.class, com.google.cloud.audit.RequestMetadata.Builder.class);
    }

    // Construct using com.google.cloud.audit.RequestMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      callerIp_ = "";

      callerSuppliedUserAgent_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.audit.AuditLogProto.internal_static_google_cloud_audit_RequestMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.audit.RequestMetadata getDefaultInstanceForType() {
      return com.google.cloud.audit.RequestMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.audit.RequestMetadata build() {
      com.google.cloud.audit.RequestMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.audit.RequestMetadata buildPartial() {
      com.google.cloud.audit.RequestMetadata result = new com.google.cloud.audit.RequestMetadata(this);
      result.callerIp_ = callerIp_;
      result.callerSuppliedUserAgent_ = callerSuppliedUserAgent_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.audit.RequestMetadata) {
        return mergeFrom((com.google.cloud.audit.RequestMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.audit.RequestMetadata other) {
      if (other == com.google.cloud.audit.RequestMetadata.getDefaultInstance()) return this;
      if (!other.getCallerIp().isEmpty()) {
        callerIp_ = other.callerIp_;
        onChanged();
      }
      if (!other.getCallerSuppliedUserAgent().isEmpty()) {
        callerSuppliedUserAgent_ = other.callerSuppliedUserAgent_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.audit.RequestMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.audit.RequestMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object callerIp_ = "";
    /**
     * <pre>
     * The IP address of the caller.
     * </pre>
     *
     * <code>string caller_ip = 1;</code>
     * @return The callerIp.
     */
    public java.lang.String getCallerIp() {
      java.lang.Object ref = callerIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        callerIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The IP address of the caller.
     * </pre>
     *
     * <code>string caller_ip = 1;</code>
     * @return The bytes for callerIp.
     */
    public com.google.protobuf.ByteString
        getCallerIpBytes() {
      java.lang.Object ref = callerIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        callerIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The IP address of the caller.
     * </pre>
     *
     * <code>string caller_ip = 1;</code>
     * @param value The callerIp to set.
     * @return This builder for chaining.
     */
    public Builder setCallerIp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      callerIp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The IP address of the caller.
     * </pre>
     *
     * <code>string caller_ip = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCallerIp() {
      
      callerIp_ = getDefaultInstance().getCallerIp();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The IP address of the caller.
     * </pre>
     *
     * <code>string caller_ip = 1;</code>
     * @param value The bytes for callerIp to set.
     * @return This builder for chaining.
     */
    public Builder setCallerIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      callerIp_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object callerSuppliedUserAgent_ = "";
    /**
     * <pre>
     * The user agent of the caller.
     * This information is not authenticated and should be treated accordingly.
     * For example:
     * +   `google-api-python-client/1.4.0`:
     *     The request was made by the Google API client for Python.
     * +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:
     *     The request was made by the Google Cloud SDK CLI (gcloud).
     * +   `AppEngine-Google; (+http://code.google.com/appengine; appid:
     * s~my-project`:
     *     The request was made from the `my-project` App Engine app.
     * </pre>
     *
     * <code>string caller_supplied_user_agent = 2;</code>
     * @return The callerSuppliedUserAgent.
     */
    public java.lang.String getCallerSuppliedUserAgent() {
      java.lang.Object ref = callerSuppliedUserAgent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        callerSuppliedUserAgent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The user agent of the caller.
     * This information is not authenticated and should be treated accordingly.
     * For example:
     * +   `google-api-python-client/1.4.0`:
     *     The request was made by the Google API client for Python.
     * +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:
     *     The request was made by the Google Cloud SDK CLI (gcloud).
     * +   `AppEngine-Google; (+http://code.google.com/appengine; appid:
     * s~my-project`:
     *     The request was made from the `my-project` App Engine app.
     * </pre>
     *
     * <code>string caller_supplied_user_agent = 2;</code>
     * @return The bytes for callerSuppliedUserAgent.
     */
    public com.google.protobuf.ByteString
        getCallerSuppliedUserAgentBytes() {
      java.lang.Object ref = callerSuppliedUserAgent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        callerSuppliedUserAgent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The user agent of the caller.
     * This information is not authenticated and should be treated accordingly.
     * For example:
     * +   `google-api-python-client/1.4.0`:
     *     The request was made by the Google API client for Python.
     * +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:
     *     The request was made by the Google Cloud SDK CLI (gcloud).
     * +   `AppEngine-Google; (+http://code.google.com/appengine; appid:
     * s~my-project`:
     *     The request was made from the `my-project` App Engine app.
     * </pre>
     *
     * <code>string caller_supplied_user_agent = 2;</code>
     * @param value The callerSuppliedUserAgent to set.
     * @return This builder for chaining.
     */
    public Builder setCallerSuppliedUserAgent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      callerSuppliedUserAgent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user agent of the caller.
     * This information is not authenticated and should be treated accordingly.
     * For example:
     * +   `google-api-python-client/1.4.0`:
     *     The request was made by the Google API client for Python.
     * +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:
     *     The request was made by the Google Cloud SDK CLI (gcloud).
     * +   `AppEngine-Google; (+http://code.google.com/appengine; appid:
     * s~my-project`:
     *     The request was made from the `my-project` App Engine app.
     * </pre>
     *
     * <code>string caller_supplied_user_agent = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCallerSuppliedUserAgent() {
      
      callerSuppliedUserAgent_ = getDefaultInstance().getCallerSuppliedUserAgent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user agent of the caller.
     * This information is not authenticated and should be treated accordingly.
     * For example:
     * +   `google-api-python-client/1.4.0`:
     *     The request was made by the Google API client for Python.
     * +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:
     *     The request was made by the Google Cloud SDK CLI (gcloud).
     * +   `AppEngine-Google; (+http://code.google.com/appengine; appid:
     * s~my-project`:
     *     The request was made from the `my-project` App Engine app.
     * </pre>
     *
     * <code>string caller_supplied_user_agent = 2;</code>
     * @param value The bytes for callerSuppliedUserAgent to set.
     * @return This builder for chaining.
     */
    public Builder setCallerSuppliedUserAgentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      callerSuppliedUserAgent_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.audit.RequestMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.audit.RequestMetadata)
  private static final com.google.cloud.audit.RequestMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.audit.RequestMetadata();
  }

  public static com.google.cloud.audit.RequestMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestMetadata>
      PARSER = new com.google.protobuf.AbstractParser<RequestMetadata>() {
    @java.lang.Override
    public RequestMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.audit.RequestMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

