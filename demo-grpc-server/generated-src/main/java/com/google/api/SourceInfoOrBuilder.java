// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/source_info.proto

package com.google.api;

public interface SourceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.SourceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getSourceFilesList();
  /**
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  com.google.protobuf.Any getSourceFiles(int index);
  /**
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  int getSourceFilesCount();
  /**
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getSourceFilesOrBuilderList();
  /**
   * <pre>
   * All files used during config generation.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any source_files = 1;</code>
   */
  com.google.protobuf.AnyOrBuilder getSourceFilesOrBuilder(
      int index);
}
