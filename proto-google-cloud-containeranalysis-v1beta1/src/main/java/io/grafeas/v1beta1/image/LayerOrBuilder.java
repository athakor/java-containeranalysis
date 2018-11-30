// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/image/image.proto

package io.grafeas.v1beta1.image;

public interface LayerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.image.Layer)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The recovered Dockerfile directive used to construct this layer.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Layer.Directive directive = 1;</code>
   */
  int getDirectiveValue();
  /**
   *
   *
   * <pre>
   * The recovered Dockerfile directive used to construct this layer.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Layer.Directive directive = 1;</code>
   */
  io.grafeas.v1beta1.image.Layer.Directive getDirective();

  /**
   *
   *
   * <pre>
   * The recovered arguments to the Dockerfile directive.
   * </pre>
   *
   * <code>string arguments = 2;</code>
   */
  java.lang.String getArguments();
  /**
   *
   *
   * <pre>
   * The recovered arguments to the Dockerfile directive.
   * </pre>
   *
   * <code>string arguments = 2;</code>
   */
  com.google.protobuf.ByteString getArgumentsBytes();
}
