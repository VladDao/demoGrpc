// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/backend.proto

package com.google.api;

public interface BackendRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.BackendRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   * @return The selector.
   */
  java.lang.String getSelector();
  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   * @return The bytes for selector.
   */
  com.google.protobuf.ByteString
      getSelectorBytes();

  /**
   * <pre>
   * The address of the API backend.
   * </pre>
   *
   * <code>string address = 2;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * The address of the API backend.
   * </pre>
   *
   * <code>string address = 2;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * The number of seconds to wait for a response from a request.  The default
   * deadline for gRPC is infinite (no deadline) and HTTP requests is 5 seconds.
   * </pre>
   *
   * <code>double deadline = 3;</code>
   * @return The deadline.
   */
  double getDeadline();

  /**
   * <pre>
   * Minimum deadline in seconds needed for this method. Calls having deadline
   * value lower than this will be rejected.
   * </pre>
   *
   * <code>double min_deadline = 4;</code>
   * @return The minDeadline.
   */
  double getMinDeadline();

  /**
   * <pre>
   * The number of seconds to wait for the completion of a long running
   * operation. The default is no deadline.
   * </pre>
   *
   * <code>double operation_deadline = 5;</code>
   * @return The operationDeadline.
   */
  double getOperationDeadline();

  /**
   * <code>.google.api.BackendRule.PathTranslation path_translation = 6;</code>
   * @return The enum numeric value on the wire for pathTranslation.
   */
  int getPathTranslationValue();
  /**
   * <code>.google.api.BackendRule.PathTranslation path_translation = 6;</code>
   * @return The pathTranslation.
   */
  com.google.api.BackendRule.PathTranslation getPathTranslation();

  /**
   * <pre>
   * The JWT audience is used when generating a JWT id token for the backend.
   * </pre>
   *
   * <code>string jwt_audience = 7;</code>
   * @return The jwtAudience.
   */
  java.lang.String getJwtAudience();
  /**
   * <pre>
   * The JWT audience is used when generating a JWT id token for the backend.
   * </pre>
   *
   * <code>string jwt_audience = 7;</code>
   * @return The bytes for jwtAudience.
   */
  com.google.protobuf.ByteString
      getJwtAudienceBytes();

  public com.google.api.BackendRule.AuthenticationCase getAuthenticationCase();
}